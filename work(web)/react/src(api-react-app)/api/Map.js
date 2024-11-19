
import React, { useState } from 'react'
import { Map, MapInfoWindow, MapMarker } from 'react-kakao-maps-sdk'

function MyMap() {

    const [result, setResult] = useState("");

    //지도에 표시될 마커들의 리스트 state
    const [markers, setMarkers] = useState([]);

    //활성화된 마커 id를 관리하는 state
    const [activeMarker, setActiveMarker] = useState(null);


    //지도의 중심좌표
    const center = {
        lat: 37.492177797688356, // 위도 좌표
        lng: 126.72397165063684 // 경도 좌표
    }


    //지도 클릭시 마커 추가
    const handleMapClick = (event, mouseEvent) => {
        const latlng = mouseEvent.latLng // 좌표를 저장
        setResult(`클릭한 위치의 위도는 ${latlng.getLat()}이고, 경도는 ${latlng.getLng()}입니다.`)
        const newMarkers = {
            id: markers.length,
            position: {
                lat: latlng.getLat(),
                lng: latlng.getLng()
            },
            info: `마커위치: (${latlng.getLat()},${latlng.getLng()})`
        }
        setMarkers([...markers, newMarkers]);
    }

    //마커에 마우스를 올렸을 때 인포윈도우 활성화하기
    const handleMouseOver = (id) => {
        setActiveMarker(id);
    }


    // //마커에 마우스를 뺐을 때 인포윈도우 비활성화
    // const handleMouseOut = () => {
    //     setActiveMarker(null);
    // }



    return (
        <div>
            <Map
                center={center} //지도 중심 좌표 lat:위도 lng:경도
                style={{ width: '600px', height: '600px' }} //지도의 너비와 높이
                level={1} //지도 확대 정도 숫자가 작을수록 크게, 클수록 작게보임
                onClick={handleMapClick}
            >

                {markers.map(marker => (
                    <MapMarker
                        key={marker.id}
                        position={marker.position}
                        onClick={()=> handleMouseOver(marker.id)}
                        // onMouseOver={() => handleMouseOver(marker.id)} 
                        // onMouseOut={handleMouseOut}
                    >
                        {/* 마커에 자식요소를 넣으면 자동으로 info로 들어간다. */}
                        {activeMarker === marker.id && (
                            <div style={{ padding: "5px", color: "#000" }}>
                                {marker.info}
                            </div>
                        )}


                    </MapMarker>
                ))}



                {/* 마커는 좌표위에 생성이 된다.
            <MapMarker 
                // position={position ?? center} position에 값이 없으면 center를 사용해라
                position={markers ?? center}/> */}

                {/* 인포윈도우 생성하기*/}

                <MapInfoWindow //인포윈도우를 생성하고 지도에 표시한다. 
                    position={center} //인포 윈도우가 표시될 위치
                    removable={true} //인포윈도우를 닫을 수 있는 x버트 표시
                >
                    <div style={{ padding: '5px', color: '#000' }}>Hello World!</div>
                </MapInfoWindow>
            </Map>
            <p>지도를 클릭해주세요!</p>
            <p id='result'>{result}</p>
        </div>
    )
}

export default MyMap;