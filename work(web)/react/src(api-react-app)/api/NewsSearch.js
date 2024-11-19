import axios from "axios";
import React,{useState} from "react"

function NewsSearch(){

    const [query, setQuery] =useState('');
    const [news ,setNews] = useState([]);
    const [error, setError] = useState(null);

    const searchNews = () =>{
        try{
            const response = axios.get('http://localhost:9090/api/news',{
                params: {query}
            });
            response.then(res => setNews(res.data.items) )
        }catch(err){
            setError('뉴스 검색에 실패했습니다.')
        }
    }


    const handleSearch = (e) =>{
        if(!query){
            alert('검색어를 입력하세요');
            return;
        }
        e.preventDefault();
        searchNews();
    }


    return(
        <div style={{height:'100%'}}>
            <form onSubmit={handleSearch}>
            <h1>네이버 뉴스 검색</h1>
            <input type="text" placeholder="뉴스 찾기" value={query} onChange={(e) => setQuery(e.target.value)}/>
            <button type="submit">검색</button>
            </form>

            <ul>
            {news.map((news)=>(
                <li key={news.title}>
                    <p>제목: {news.title}</p>
                    <p>원문링크: {news.originallink}</p>
                    <p>링크: {news.link}</p>
                    <p>기사: {news.description}</p>
                    <p>시간: {news.pubDate}</p>
                </li>
            ))}
            </ul>
        </div>
    );
}

export default NewsSearch