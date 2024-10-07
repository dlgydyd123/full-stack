import React,{useState} from "react";

function Sol1() {
   const[item,setItem] = useState(['초콜릿','사탕']);
   const[input, setInput] = useState("");

    const inputHandler = (e) =>{
        setInput(e.target.value);
        
    }

    const clickHandler = () =>{
        setItem([input,...item]);
        setInput("")
    }


    return(
        <div>
            <input onChange={inputHandler} input={input}/>
            <button onClick={clickHandler}>추가</button>
        <ul>
            {item.map(item => <li >{item}</li>)}
        </ul>
        </div>
    );
}

export default Sol1