import React, { useState } from "react"
import { call } from "../service/ApiService";


function AddProduct(props) {

    let setItems = props.setItems;
    let setOpen = props.setOpen;

    const[product, setProduct] = useState({productName:'',productCount:'',productPrice:''})

    const {productName,productCount,productPrice} = product;

    const onChange = (e) =>{

        const {value,name} = e.target;
        setProduct({      
            ...product,    
            [name]: value  
            });  
    }

    const onButtonClick = ()=>{
        call("/product","POST",product)
        .then(result => setItems(result.data))
        setProduct({productName:'',productCount:'',productPrice:''})
        setOpen(true)
    }

    return (
        <div>
            <div><input style={{width:'492px'}} onChange={onChange} value={productName} name='productName' placeholder="상품이름"/></div>
            <div><input style={{width:'492px'}} onChange={onChange} value={productCount} name='productCount' placeholder="상품재고"/></div>
            <div><input style={{width:'492px'}} onChange={onChange} value={productPrice} name='productPrice' placeholder="상품가격"/></div>
            <input style={{width:'500px'}} type="button" onClick={onButtonClick} value="등록"/>
        </div>
    )

}

export default AddProduct 