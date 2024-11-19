import React from "react";
import styled from "styled-components"
import User from "./components/User";
// import UserContext,{UserProvider} from "./contexts/User";
import Input from "./components/input";
import ThemedComponent from "./components/ThemedComponent";
import { ThemeProvider } from "./contexts/ThemeContext";
import CartScreen from "./components/CartScreen";
import { CartProvider } from "./contexts/CartContext";
import HomeScreen from "./components/HomeScreen";
import { UserProvider } from "./contexts/UserContext";


const Container = styled.View`
    flex : 1;
    background-color : #ffffff;
    justify-content : center;
    align-items: center;
`

const App = () => {
    return (
        // <UserProvider>
        // <Container>
        //     <User />
        //     <Input />
        // </Container>
        // </UserProvider>
        // <ThemeProvider>
        // <ThemedComponent/>
        // </ThemeProvider>
        // <CartProvider>
        //     <CartScreen/>
        // </CartProvider>
        <UserProvider>
            <HomeScreen/>
        </UserProvider>
    )
}

export default App