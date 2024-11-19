import React, { useState } from "react";
import { Map, MapMarker } from "react-kakao-maps-sdk";
import { useDaumPostcodePopup } from "react-daum-postcode";

function MyMap3() {

    const [address, setAddress] = useState('');

    const [position, setPosition] = useState(null);


    //Daum 우편번호 API 스크립트 URL
    let scriptUrl = "http://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"

    //react-daum-postcode의 useDaumPostcodePopup훅을 사용하여 API를 팝업으로 실행할 준비
    const open = useDaumPostcodePopup(scriptUrl);

    //주소 좌표 변환 객체를 생성
    let geoCoder = new window.kakao.maps.services.Geocoder();

    const handleComplete = (data) => {
        let addr = data.address
        setAddress(addr);
        geoCoder.addressSearch(addr, function (results, status) {
            if (status === window.kakao.maps.services.Status.OK) {

                let result = results[0];

                const center = {
                    lat: result.y,
                    lng: result.x
                }
                setPosition(center)

            }
        })

    }

    const handleClick = (e) => {
        open({ onComplete: handleComplete })
    }


    return (
        <div>
            <h1>주소검색</h1>
            <input type="text" value={address} placeholder="주소" readOnly />
            <input type="button" onClick={handleClick} value="주소검색" />
           {position !== null && (<Map
                center={position}
                style={{
                    width: '400px',
                    height: '400px'
                }}
                level={3}
            >
            <MapMarker
                position={position}
            ></MapMarker>
            </Map>)}
        </div>
    )
}

export default MyMap3;