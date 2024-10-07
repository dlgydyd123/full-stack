import React,{useState,useEffect} from "react";

function MyComponent(){
    const [count,setCount] =useState(0);
    //()=>{} 사이드 이펙트 함수 , [] 의존성
    useEffect(()=>{
        console.log(`you clicked ${count} tiems`)
    },[count]);

    return(
        <div>
            <p>You Clicked {count} times</p>
            <button onClick={()=> setCount(count+1)}>Click me</button>
        </div>
    )
}

export default MyComponent;