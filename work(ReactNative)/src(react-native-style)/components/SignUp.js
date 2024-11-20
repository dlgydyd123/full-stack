import React, { useState } from "react";
import {View, Text, TextInput , Button, StyleSheet} from "react-native";

const SignUp = () =>{

    const [name, setName] =useState('')
    const [email, setEmail] =useState('')
    const [secret, setSecret] = useState('')
    const [check, setCheck] = useState('')

    const onChangeName=(e)=>{
        setName(e.nativeEvent.text)
    }

    const onChangeEmail=(e)=>{
        setEmail(e.nativeEvent.text)
    }

    const onChangeSecret=(e)=>{
        setSecret(e.nativeEvent.text)
    }
    
    const onChangeCheck=(e)=>{
        setCheck(e.nativeEvent.text)
    }

    const sign=()=>{
        if(secret === check){
            alert('회원가입 완료')
        }else{
            alert('비밀번호와 비밀번호 확인이 다릅니다.')
        }
    }

    return(
        <View style={styles.container}>
            <Text style={styles.title}>회원가입</Text>
            <Text style={styles.text}>이름</Text>
            <TextInput style={styles.textInput} placeholder="이름을 입력하세요" onChange={onChangeName}></TextInput>
            <Text style={styles.text}>이메일</Text>
            <TextInput style={styles.textInput} placeholder="이메일을 입력하세요" onChange={onChangeEmail}></TextInput>
            <Text style={styles.text}>비밀번호</Text>
            <TextInput style={styles.textInput} placeholder="비밀번호를 입력하세요" onChange={onChangeSecret} secureTextEntry></TextInput>
            <Text style={styles.text}>비밀번호 확인</Text>
            <TextInput style={styles.textInput} placeholder="비밀번호를 확인해주세요" onChange={onChangeCheck} secureTextEntry></TextInput>
            <Button title="가입하기" onPress={sign} />
        </View>
    )
}

const styles =StyleSheet.create({
    container:{
        flex:1,
        backgroundColor : '#fff',
        justifyContent: 'center'
    },
    title:{
        fontSize:30,
        alignSelf: 'center',
        marginBottom: 20
    },
    text:{
        fontSize:20
    },
    textInput:{
        backgroundColor: '#abc',
        fontSize : 15,
        width: 370,
        marginBottom:15,
        padding:5,
        borderRadius:5
    },
    button:{
        borderRadius:5
    }
   

})


export default SignUp