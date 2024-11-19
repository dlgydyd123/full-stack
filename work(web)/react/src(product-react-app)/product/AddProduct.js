import React, { useState } from "react"
import { call } from "../service/ApiService";


function AddProduct(props) {

    let setItems = props.setItems;
    let setOpen = props.setOpen;

    //상품의 정보를 저장할 수 있는 state
    const[product, setProduct] = useState({productName:'',productCount:0,productPrice:0})

    const {productName,productCount,productPrice} = product;

    const onChange = (e) =>{
        //이벤트가 일어난 대상에세서 value와 name을 가져온다.
        const {value,name} = e.target;
        setProduct({      
            ...product, // 기존의 input 객체를 복사한 뒤      
            [name]: value // name 키를 가진 값을 value 로 설정    
            });  
    }

    const onButtonClick = ()=>{
        console.log("전송 정보 : "+ product)
        call("/product","POST",product)
        .then(result => setItems(result.data))
        //입력필드 초기화
        setProduct({productName:'',productCount:0,productPrice:0})
        setOpen(true)
    }

    return (
        <div>
            <div><input onChange={onChange} value={productName} name='productName' placeholder="상품이름"/></div>
            <div><input onChange={onChange} value={productCount} name='productCount' placeholder="상품재고"/></div>
            <div><input onChange={onChange} value={productPrice} name='productPrice' placeholder="상품가격"/></div>
            <input type="button" onClick={onButtonClick} value="등록"/>
        </div>
    )

}

export default AddProduct 