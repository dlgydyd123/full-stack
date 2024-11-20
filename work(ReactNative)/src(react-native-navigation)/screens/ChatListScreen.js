import React from "react";
import { Button } from "react-native";
import styled from "styled-components";


const Container = styled.View`
    flex: 1 ; 
    justify-cotent : center;
`

const StyledText = styled.Text`
    font-size : 24px
`

const users = [
    { id: '1', name: 'John Doe', email: 'john@example.com' },
    { id: '2', name: 'Jane Smith', email: 'jane@example.com' },
    { id: '3', name: 'Alice Johnson', email: 'alice@example.com' },
];


const ChatList =({navigation}) =>{
   
    const _onPress = (user) =>{
        navigation.navigate('Chat',{name: user.name})
    }

    return(
        <Container>
            <StyledText>채팅방목록</StyledText>
            {users.map(user=>(
                 <Button title={user.name} 
                    color="#F7FE2E" 
                    key={user.id}
                    onPress={() => _onPress(user)}
                 />
            ))}
           
        </Container>
    )
}

export default ChatList