import React,{useState} from "react";
import styled from "styled-components";
import { Button } from "react-native";

const Container = styled.View`
    flex : 1;
    justify-content : center;
    align-items : center;
`

const StyledText = styled.Text`
    font-size : 30px;
    color :#333333
`

export const HomeScreen = () => {
    return (
        <Container>
            <StyledText>Welcome to Shop</StyledText>
        </Container>
    )
}


export const CartScreen = () => {

    const [show,setShow] = useState(true)
    const [count,setCount] = useState(0)

    const _onPress =() =>{
        setShow(false)
        alert("추가")
        setCount(count+1)
    }

    return (
        <Container>
            {show?<StyledText>your Cart is Empty</StyledText>:<StyledText>AddItem:{count}</StyledText>}
            <Button title="AddItem"  onPress={()=>_onPress()}/>
        </Container>
    )
}


export const ProfileScreen = () => {
    return (
        <Container>
            <StyledText>your Profile</StyledText>
        </Container>
    )
}

