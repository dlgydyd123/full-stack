import React from "react";
import styled from "styled-components";

const Container = styled.View`
    flex: 1 ; 
    justify-cotent : center;
`

const StyledText = styled.Text`
    font-size : 24px
`

const Chat = ({navigation, route}) =>{
    return(
        <Container>
            <StyledText>{route.params.name} 채팅방입니다. </StyledText>
        </Container>
    )
}

export default Chat