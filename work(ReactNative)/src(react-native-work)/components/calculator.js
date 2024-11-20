import React, { useState } from "react";
import styled from "styled-components";

const Container = styled.View`
    flex:1;
    align-items : center;
    justify-content: center;
    background-color : #f5f5f5;
`

const ButtonContainer = styled.View`
    justify-content: space-around;
    flex-direction: row;
    width:80%;
    margin-top:20px;
`

const Number = styled.TextInput`
    width: 80%;
    padding :10px;
    margin :10px;
    background-color : #ffffff;
    border-radius: 5px;
    text-align : center;
`

//결과창
const Result = styled.Text`
    font-size: 24px;
    margin: 20px;
`

const Operator = styled.Pressable`
   padding :16px;
   background-color : #3498db;
   border-radius: 8px;
`

const ButtonText = styled.Text`
    color: white;
    font-size : 18px;
`

const Calculator = () => {

    //숫자를 저장할 state
    const [firstNum, setFirstNum] = useState('');
    const [secondNum, setSecondNum] = useState('');

   
    //결과를 표시할 때 필요한 state
    const [result, setResult] = useState(null);

    //계산하기 기능
    const handleCalculation = (operator) => {
       
        const num1 = parseFloat(firstNum)
        const num2 = parseFloat(secondNum)
    
        if(!isNaN(num1) && !isNaN(num2)){
           switch(operator){
            case '+':
                setResult(num1+num2);
                break;
            case '-':
                setResult(num1-num2);
                break
            case '*':
                setResult(num1*num2);
                break
            case '/':
                setResult(num1/num2);
                break;
           }
        }
    }

    return (
        <Container >
            <Number
                placeholder="Enter first number"
                keyboardType="numeric" //숫자기판이 나오도록함
                value={firstNum}
                onChangeText={(text) => setFirstNum(text)}
            />
            <Number placeholder="Enter second number"
                keyboardType="numeric"
                value={secondNum}
                onChangeText={(text) => setSecondNum(text)}
            />
            <Result>
                {result !== null ? `결과 : ${result}` : '숫자를 입력하고 연산자를 누르세요'}
            </Result>
            <ButtonContainer>
                {['+', '-', '*', '/'].map((op) => (
                    <Operator key={op} onPress={() => handleCalculation(op)}>
                        <ButtonText>{op}</ButtonText>
                    </Operator>
                ))}
            </ButtonContainer>
        </Container>
    )
}

export default Calculator