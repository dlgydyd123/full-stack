import React,{ useState , useEffect }  from "react";

function Sol2(){
    const[count,setCount] = useState(0);
    const[value,setValue] = useState("");

    useEffect(()=>{
        console.log(`렌더링 완료`)
    },[])
  
    const countNum = () =>{
        console.log(`count 값이 바뀜`)
        setCount(count+1)
    }


    const input = (e) =>{
        console.log(`input 값이 바뀜`)
        setValue(e.target.value);
    }


    return(
        <div>
            <h1>{count}</h1>
            <button onClick={countNum}>+1</button>
            <hr/>
            <input onChange={input}/>
            <h1>{value}</h1>
        </div>
    )
        
    
}

export default Sol2;