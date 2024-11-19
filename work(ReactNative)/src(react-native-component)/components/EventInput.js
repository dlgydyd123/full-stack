import React, {useState} from "react";
import { View,Text,TextInput, Button } from "react-native";

const EventInput = () => {

    //text를 저장할 state
    const [text, setText] = useState('')

   

    const _onChange = (event) => {
        setText(event.nativeEvent.text)
    }

    const _onChangeText = (text) =>{
        setText(text)
    }

    return(
        <View>
            <Text style={{margin:10, fontSize:30}}>text: {text}</Text>
            <TextInput 
                style={{borderWidth:1, padding:10, fontSize:20}} 
                placeholder="Enter the Text"
                //onChange={_onChange}
                onChangeText={_onChangeText}/>
        </View>
    )
}

export default EventInput