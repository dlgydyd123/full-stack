import React from "react";
import { Button } from "react-native";
import styled from "styled-components";

const Container =styled.View`
    flex:1;
    justify-content : center;
    align-items : center;
`
const StyledText = styled.Text`
    font-size : 30px;
    margin-bottom : 10px;
`

const users = [
    { id: '1', name: 'John Doe', email: 'john@example.com' },
    { id: '2', name: 'Jane Smith', email: 'jane@example.com' },
    { id: '3', name: 'Alice Johnson', email: 'alice@example.com' },
];


const UserList =({navigation}) =>{

    const _onPress = user =>{
        navigation.navigate('User',{name:user.name, email:user.email })
    }

    return(
        <Container>
            <StyledText>유저목록</StyledText>
            {users.map(user=>(
                <>
                <StyledText>{user.name}</StyledText>
                <Button 
                    key={user.id}
                    title="프로필보기"
                    onPress={() => _onPress(user)}/>
                </>
            ))}
        </Container>
    )
}

export default UserList