import React,{useState,useEffect} from'react'

function UserList() {
    const[users, setUsers] = useState([]);
    const[loading, setLoading] = useState(true);
    const[error, setError] = useState(null);

    useEffect(()=> {
        const fetchData = async () =>{
            try{
                const response = await fetch('https://jsonplaceholder.typicode.com/users')

                if(!response.ok){
                    throw new Error('데이터 응답 실패')
                }
                const data = await response.json();
                setUsers(data);
            }catch(err){
                setError(err.message);
            }finally{
                setLoading(false);
            }
        }

        fetchData();
    },[])

    if(loading){
        return<p>로딩중...</p>
    } 

    //에러 발생시 보여줄 내용
    if(error){
        return <p>에러 발생 : {error}</p>
    }

    return(
        <div>
            <h1>게시글 목록</h1>
            <ul>
                {users.map((user)=>(
                    <li key={user.id}>name : {user.name} , email : {user.email}</li>
                ))}
            </ul>
        </div>
    )

}

export default UserList