import React, { useState } from "react";
import { View, Text } from "react-native";
import MyButton from "./MyComponent";

const Counter = () =>{

    const [count, setCount] = useState(0);

    return(
        <View>
            <Text> Count : {count}</Text>
            <MyButton title='+1'  onPress={()=> setCount(count+1)}/>
            <MyButton title='-1'  onPress={()=> setCount(count-1)}/>
        </View>
        // +1이 쓰여있는 버튼(누르면 숫자가 1씩 증가)
        // -1이 쓰여있는 버튼(누르면 숫자가 1씩 감소) 
    )
}

export default Counter