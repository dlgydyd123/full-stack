import React, { useState } from "react";
import { View, Text, Switch } from "react-native";
import styled, { ThemeProvider } from "styled-components";
import { viewStyles, textStyles } from "./styles";
import { theme, lightTheme, darkTheme } from "./theme";
import { Header, Contents, Footer } from "./components/Layout";
import FlexDirectionTest from "./components/flexDirectionTest";
import JustifyContent from "./components/justifyContentTest";
import AlignItemsTest from "./components/alignItemsTest";
import ShadowBox from "./components/ShadowBox";
import { Styled } from "./components/StyledComponent";
import Button from "./components/Button";
import SignUp from "./components/SignUp";
import Input from "./components/Input";


const Container = styled.View`
    flex: 1;
    background-color : ${props => props.theme.background};
    align-items: center;
    justify-content : center;
`


export default function App() {

    const [isDark, setIsDark] = useState(false);

    const _toggleSwitch = () => {
        setIsDark(!isDark);
    }

    return (
        // <View style={viewStyles.container}>
        //     {/* 인라인과 클래스 스타일 혼용사용 가능 
        //     뒤에 오는 스타일이 앞의 스타일을 덮어쓴다. */}
        //     {/* <Text style={[textStyles.text,{color:'green'}]}>Inline-Styling-Text</Text>
        //     <Text style={[textStyles.text,textStyles.error]}> Inline-Styling-Error</Text> */}
        //     {/* <Header/> */}
        //     {/* <Contents /> */}
        //     {/* <Footer /> */}
        //     {/* <FlexDirectionTest /> */}
        //     {/* <JustifyContent /> */}
        //     {/* <AlignItemsTest /> */}
        //     {/* <ShadowBox /> */}
        //     {/* <Styled /> */}
        //     {/* <SignUp /> */}
        // </View>
        <ThemeProvider theme={isDark ? darkTheme : lightTheme}>
        {/* ThemeProvider에 정의한 props는 하위 컴포넌트에서 받아서 사용할 수 있다. */}
            <Container>
                <Switch value={isDark} onValueChange={_toggleSwitch} />
                <Button title="Hanbit" />
                <Button title="React Native" />
                <Input borderColor="#3498db" />
                <Input borderColor="#9b59b6" />
            </Container>
        </ThemeProvider>
    )
}

