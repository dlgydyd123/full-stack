import React from "react";
import { useState, useEffect } from "react";
import { call } from "../service/ApiService";

function OrderInfo() {

    //주문내역들을 저장할 state
    const [orders,setOrders] = useState([]);


    //DB에서 주문내역을 가져오기 위한 hook
    useEffect(() => {
        call("/orders/total", "GET")
            .then(result => {
                //주문내역을 가져와 orders에 저장
                setOrders(result.data);
            })

    }, [])


    return (
        <div>
            <table border="1">
                <tr>
                    <th>상품 이름</th>
                    <th>상품 가격</th>
                    <th>주문 개수</th>
                    <th>결제 금액</th>
                    <th>주문 날짜</th>
                </tr>
              {orders.map((order)=>(
                    <tr key={order.orderId}>
                        <td>{order.productName}</td>
                        <td>{order.productPrice}</td>
                        <td>{order.orderCount}</td>
                        <td>{order.totalPrice}</td>
                        <td>{order.orderDate}</td>
                    </tr>
              ))}
            </table>
        </div>
    )


}

export default OrderInfo