import React from "react";
import styled from "styled-components";

const Container = styled.View`
    flex : 1;
    justify-content : center;
    align-items : center;
`

const StyledText = styled.Text`
    font-size : 30px;
    color :#333333
`


export const FriendScreen =() =>{
    return(
        <Container>
            <StyledText>친구목록입니다.</StyledText>
        </Container>
    )

}

export const SettingsScreen =() =>{
    return(
        <Container>
            <StyledText>화면설정입니다.</StyledText>
        </Container>
    )
}