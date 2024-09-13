import React,{useState} from "react";

function Sol1() {
   const[eating,setEating] = useState(['초콜릿','사탕']);
   const[value, setValue] =useState("");

    const inputHandler = (e) =>{
        setValue(e.target.value);
        
    }

    const clickHandler = () =>{
        setEating([value,...eating]);
        setValue("")
    }

    return(
        <div>
            <input onChange={inputHandler} value={value}/>
            <button onClick={clickHandler}>추가</button>
        <ul>
            {eating.map(item => <li >{item}</li>)}
        </ul>
        </div>
    );
}

export default Sol1