import React, { useState } from "react";
import styled from "styled-components";


const AppContainer =styled.View`
    flex : 1;
    align-items: center;
    justify-content: center;
    background-color : ${(props) => props.background};
`

const ChangeColorButton = styled.Pressable`
   padding :16px;
   border-radius: 8px;
   background-color : #3498db;
   
`

const ButtonText = styled.Text`
    color: white;
    font-size: 18px;
`


const ChangeColor = () =>{

    const [background, setBackground] = useState('#ffffff')

    const handleChange =() =>{
        setBackground('#'+Math.floor(Math.random()*16777215).toString(16))
    }

    return(
        <AppContainer background={background}>
            <ChangeColorButton 
            onPress={()=> handleChange()}>
                <ButtonText >Change Background Color!</ButtonText>
            </ChangeColorButton>
        </AppContainer>
    )
}

export default ChangeColor