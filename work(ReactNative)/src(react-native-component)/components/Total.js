import React, { useState, useEffect } from "react";
import { View,Text } from "react-native";

const Total = (props) =>{
    const [sum, setSum] =useState(0);

    let arr = props.arr;
    
    
    useEffect(()=>{
        // let total = 0
        // for(var i =0; i<arr.length; i++){
        //     total += arr[i]
        // }
        // setSum(total);

        let total = arr.reduce((total,num)=>total+num,0); // total: 총합 num: 배열에서 하나씩 꺼내서 가져옴 =>식 : 식을 통한 계산
        setSum(total)
    },[arr])
   

   

    return(
        <View>
            <Text>Sum:{sum}</Text>
        </View>
    )

}

export default Total