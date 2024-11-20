import React, { useState, useEffect, useRef, useContext } from "react";
import { ProgressContext} from "../contexts/Progress";
import styled from "styled-components";
import { Alert, Text } from "react-native";
import { Image, Input, Button } from "../components";
import { KeyboardAwareScrollView } from "react-native-keyboard-aware-scroll-view";
import { validateEmail, removeWhitespace } from "../utils/common";
import { images } from "../utils/image";
import { signup } from "../utils/firebase";
import { UserContext } from "../contexts";


const Container = styled.View`
    flex : 1;
    justify-content : center;
    align-items : center;
    background-color : ${({ theme }) => theme.background};
    padding : 0px 20px;
`

const ErrorText = styled.Text`
    align-items : flex-start;
    width: 100%;
    height : 20px;
    margin-bottom :10px;
    line-height : 20px;
    color : ${({ theme }) => theme.errorText};
`

const Signup = () => {
    const {spinner} =useContext(ProgressContext)
    const {dispatch} = useContext(UserContext);

    const [name, setName] = useState(''); //이름을 관리하는 state
    const [email, setEmail] = useState(''); // 아이디(이메일)을 관리하는 state
    const [password, setPassword] = useState(''); // 비밀번호 관히하는 state
    const [passwordConfirm, setPasswordConfirm] = useState(''); // 비밀번호 일치여부를 관리하는 state
    const [errorMassage, setErrorMassage] = useState(''); // 에러메시지를 관리하는 state
    const [disabled, setDisabled] = useState(true); // 버튼 활성화 여부를 관리하는 state
    const [photoUrl, setPhotoUrl] =useState(images.photo);


    const emailRef = useRef();
    const passwordRef = useRef();
    const passwordConfirmRef = useRef();
    const didMountRef = useRef();

    //함수 작성
    useEffect(() => {
        if (didMountRef.current) {
            let _errMessage = '';
            if (!name) {
                _errMessage = 'Please enter your name';
            } else if (!validateEmail(email)) {
                _errMessage = 'Please verify your email';
            } else if (password.length < 6) {
                _errMessage = 'The Password must contain 6 characters at least';
            } else if (password !== passwordConfirm) {
                _errMessage = 'Password need to match'
            } else {
                _errMessage = ''; 
            }
            setErrorMassage(_errMessage)
        } else{
            didMountRef.current =true;
        }
    }, [name, email, password, passwordConfirm])


    useEffect(() => {
        setDisabled(
            !(name && email && password && passwordConfirm && !errorMassage)
        )
    }, [name, email, password, passwordConfirm, errorMassage])

    //회원가입 버튼
    const _handleSignupButtonPress = async () => {
        try{
            spinner.start();
            const user =await signup({email,password,name,photoUrl});
            console.log(user);
            dispatch(user)// UserProvider에서 제공하는 setUser();
            Alert.alert('Signup Success', user.email);
        }catch (error){
            Alert.alert('Signup Error',error.message);
        }finally{
            spinner.stop();
        }
    }

    return (
        <KeyboardAwareScrollView
            extraHeight={20}
        >
            <Container>
                <Image rounded  url={photoUrl} showButton onChangeImage={url => setPhotoUrl(url)}/>
                {/* 이름을 작성하는 Input */}
                <Input
                    label="Name"
                    value={name}
                    onChangeText={text => setName(text)} //텍스트가 변할 때마다 state에 반영
                    onSubmitEditing={() => { // 완료버튼 누를시 state에 반영, 이메일칸으로 포커스 이동
                        setName(name.trim());
                        emailRef.current.focus();
                    }}
                    onBlur={() => setName(name.trim())} //포커스가 빠져도 이름을 state에 반영
                    placeholder="Name"
                    returnKeyType="next"
                />
                {/* 아이디(이메일)을 작성하는 Input */}
                <Input
                    ref={emailRef}
                    label="Email"
                    value={email}
                    onChangeText={text => setEmail(removeWhitespace(text))}
                    onSubmitEditing={() => passwordRef.current.focus()}
                    placeholder="Email"
                    returnKeyType="next"
                />
                {/* 비밀번호를 작성하는 Input */}
                <Input
                    ref={passwordRef}
                    label="Password"
                    value={password}
                    onChangeText={text => setPassword(removeWhitespace(text))}
                    onSubmitEditing={() => passwordConfirmRef.current.focus()}
                    placeholder="Password"
                    returnKeyType="done"
                    isPassword
                />
                <Input
                    ref={passwordConfirmRef}
                    label="Password Confirm"
                    value={passwordConfirm}
                    onChangeText={text => setPasswordConfirm(removeWhitespace(text))}
                    onSubmitEditing={_handleSignupButtonPress}
                    placeholder="Password Confirm"
                    returnKeyType="done"
                    isPassword
                />
                <ErrorText>{errorMassage}</ErrorText>

                <Button
                    title="Signup"
                    onPress={_handleSignupButtonPress}
                    disabled={disabled}
                />
            </Container>
        </KeyboardAwareScrollView>
    )
}

export default Signup