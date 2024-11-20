import React, { useState } from "react";
import styled from "styled-components";
import Button from "./Button";

const StyledText = styled.Text`
    font-size : 24px;
    margin : 10px;
`

const Counter = () => {

    const [result, setResult] = useState(0);

    return (
            <>
            <StyledText>결과:{result}</StyledText>
            <Button title='+' onPress={() => {
                setResult(result => result+1) 
                setResult(result => result+1)
                console.log(`count : ${result}`)}}
            />
            <Button title='-' onPress={() => setResult(result-1)}/>
            </>
     
    )
}

export default Counter