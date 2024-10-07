import React ,{useState,useEffect} from "react";

function Sol3() {
    const[count,setCount] = useState(0);
    const[rcount,setRcount] =useState(0);



    const countNum =() =>{
        setCount(count+1);
    }

    useEffect(() =>{
        setRcount(rcount+1);
        console.log('렌더링 완료')
    },[count])


    return(
        <div>
            <h1>Count: {count}</h1>
            <h1>렌더링 횟수 :{rcount}</h1>
            <button onClick={countNum}>클릭</button>
        </div>

    )

}

export default Sol3;