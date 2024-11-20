import React,{useState,useEffect,useRef} from "react";
import styled from "styled-components";

const StyledTextInput = styled.TextInput.attrs({
    autoCapitalize :'none',
    autoCorrect : false
})`
    border : 1px solid #757575;
    padding : 10px;
    margin : 10px 0px;
    width : 200px;
    font-size : 20px;
`
const StyledText = styled.Text`
    font-size : 24px;
    margin :10px;
`

const Form = () =>{

    const [name,setName] = useState('');
    const [email,setEmail] = useState('');

    const refName = useRef(null);
    const refEmail = useRef(null);

    useEffect(() => {
        console.log('\n===================Form Component Mount ================\n')
        refName.current.focus();
        //clean up : useEffect의 실행 조건이 빈 배열인 경우 컴포넌트가 언마운트 될 때 정리 함수를 실행
        return () => console.log('\n===================Form Component unMount ================\n')
    },[])

    return(
        <>
            <StyledText>Name : {name}</StyledText>
            <StyledText>Email : {email}</StyledText>
            <StyledTextInput 
                ref={refName}
                returnkeyType='next' 
                placeholder='이름' 
                onChangeText={text => setName(text)}>    
            </StyledTextInput>

            <StyledTextInput
                 ref={refEmail} 
                 returnkeyType='done' 
                placeholder='이메일'
                onChangeText={text => setEmail(text)}>

                </StyledTextInput>
        </>

    )
}

export default Form