import React,{useLayoutEffect} from "react";
import styled from "styled-components";
import { MaterialCommunityIcons } from '@expo/vector-icons'

const Container = styled.View`
    flex:1;
    justify-content : center;
    align-items : center;
`
const StyledText = styled.Text`
    font-size : 30px;
    margin-bottom : 10px;
`

const User = ({navigation, route}) =>{
    useLayoutEffect(() => {
    navigation.setOptions({
          headerBackTitleVisible: false,
            headerTintColor: '#333333',
            headerLeft: ({ onPress, tintColor }) => {
                return (
                    <MaterialCommunityIcons
                        name="keyboard-backspace"
                        size={30}
                        style={{ marginLeft: 11 }}
                        color={tintColor}
                        onPress={onPress}
                    />
                )
            },
            headerRight: ({ tintColor }) => {
                return (
                    <MaterialCommunityIcons
                        name="home-variant"
                        size={30}
                        style={{ marginRight: 11 }}
                        color={tintColor}
                        onPress={() => navigation.popToTop()}
                    />
                )
            }
        })
},[])
    return(
        <Container>
            <StyledText>User</StyledText>
            <StyledText>이름 : {route.params.name}</StyledText>
            <StyledText>이메일 : {route.params.email}</StyledText>
        </Container>
    )

}

export default User