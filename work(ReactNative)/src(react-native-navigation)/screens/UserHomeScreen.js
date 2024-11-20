import React from "react";
import { Button } from "react-native";
import styled from "styled-components";

const Container = styled.SafeAreaView`
    align-items : center;
    background-color : #ffffff;
`
const StyledText = styled.Text`
    font-size : 30px;
    margin-bottom : 10px;
`

const UserHomeScreen = ({navigation}) => {
    return(
        <Container>
            <StyledText>Home</StyledText>
            <Button title="유저 목록 보기" 
                    onPress={() => navigation.navigate('UserList')}/>
        </Container>
    )
}

export default UserHomeScreen