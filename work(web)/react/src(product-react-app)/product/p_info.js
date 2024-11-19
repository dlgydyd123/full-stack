import React from 'react';
import { useState, useEffect } from 'react';
import '../css/styles.css'
import { call } from '../service/ApiService';
import AddProduct from './AddProduct';
import OrderInfo from './Order_info';

function P_info() {

    //상품정보를 가지고 있는 state
    const [items, setItems] = useState([]);

    //상품추가 컴포넌트를 렌더링 하기 위한 state
    const [open, setOpen] = useState(true);

    //내가 클릭한 라디오버튼의 인덱스를 저장하기 위한 state
    const [selectedIndex, setSelectedIndex] = useState(null);

    //주문개수를 저장하는 state
    const [orderCount, setOrderCount] = useState('');

    //주문내역을 렌더링할지 여부를 제어하는 state
    const [showOrderInfo, setShowOrderInfo] = useState(false);



    useEffect(() => {
        //백엔드에게 요청하기
        call("/product", "GET")//이제는 /Todo에 접근하려면 토큰인증이 필요하다.
            .then(result => {
                setItems(result.data);
            })

    }, [])

    //상품추가 창을 여는 함수
    const onButtonClick = () => {
        setOpen(false);
    }

    //주문내역 창을 여는 함수
    const showOrderDetails = () =>{
        setShowOrderInfo(!showOrderInfo);
    }


    //클릭한 라디오버튼의 index를 저장하는 함수
    const handleRadioChange = (index) => {
        console.log("클릭한 index : " + index)
        setSelectedIndex(index); //state에 저장
        setOrderCount(''); //라디오 버튼 선택시 주문 개수를 초기화
    }

    //주문개수의 값이 변할 때마다 state를 저장하는 함수
    const handleOrderCountChange = (event) => {
        setOrderCount(event.target.value)
    }

    //주문하기
    const orderProduct = () => {
        //주문하기 전에 유효성 검사를 수행
        if (selectedIndex && orderCount > 0 && items[selectedIndex - 1]) {
            //백엔드로 전송할 데이터
            const orderData = {
                productId: items[selectedIndex - 1].productId,
                orderCount: parseInt(orderCount)
            }
            //DB에 추가 요청을 보내고
            call("/orders", "POST", orderData)
                .then(result => { setItems(result.data) })
        } else {
            alert("상품을 선택하고 개수를 입력해주세요.")
        }

    }


    //버튼
    let addProduct = <button type="button" onClick={onButtonClick}>상품추가</button>


    let addButton = addProduct;

    if (!open) {
        addButton = <AddProduct setItems={setItems} setOpen={setOpen} />
    }



    let productItems = items.length > 0 && (
        <div>
            <table border="1">
                <tr>
                    <th>단일 선택</th>
                    <th>주문 개수</th>
                    <th>상품 번호</th>
                    <th>상품 이름</th>
                    <th>상품 재고</th>
                    <th>상품 가격</th>
                    <th>등록 날짜</th>
                    <th>수정 날짜</th>
                </tr>
                {/* DB에서 넘어온 상품들을 출력 */}
                {/* map함수의 특징 index를 설정할 수 있다. */}
                {items.map((item, index) => (
                    <tr>
                        <td><input type='radio' name="productId" onChange={() => handleRadioChange(index + 1)} /></td>
                        <td><input onChange={handleOrderCountChange} value={selectedIndex === index + 1 ? orderCount : ''} readOnly={selectedIndex !== index + 1} /></td>
                        <td>{item.productId}</td>
                        <td>{item.productName}</td>
                        <td>{item.productCount}</td>
                        <td>{item.productPrice}</td>
                        <td>{item.signupDate}</td>
                        <td>{item.modifyDate}</td>
                    </tr>
                ))}
            </table>
            <button onClick={orderProduct}>주문완료</button><button onClick={showOrderDetails}>주문내역</button>
        </div>
    );

    return (
        <div className='container'>
            {addButton}
            {productItems}
            {showOrderInfo && <OrderInfo />}
        </div>
    );
}

export default P_info;