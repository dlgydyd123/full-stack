//Toggle Text 버튼을 누를 때마다 
//<p>This text can be toggled</p>
//보였다 안보였다 하게 만들기
import React, { useState } from "react";
import { View, Text, Button } from "react-native";


const ToggleText = () => {

    const [toggle, setToggle] = useState(true);

    return (
        <View>
            <Text>
                {toggle === true ? 'This text can be toggled' : ' '}
            </Text>
            <Button title='toggle' onPress={() => setToggle(!toggle)} />
        </View>
    )
}

export default ToggleText