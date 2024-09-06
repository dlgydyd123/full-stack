//document 객체를 대상으로 하는 이벤트리스너를 추가한다.
//이벤트의 종류는 DOMContentLoaded이다.
//DOMContentLoaded : 문서의 콘텐츠 로딩이 완료되었음을 의미하는 이벤트
document.addEventListener("DOMContentLoaded",
    function () {
        let button = document.querySelector("input");
        button.addEventListener("input",
            function (e) { // e : event에 대한 정보, 이벤트가 발생한 태그에 대한 정보
                console.log(e.target.value);
            });
    });
//<p>태그에서 인라인 이벤트 모델로 호출할 함수를 정의한다.
//함수의 이름은 hi
//alert()띄워 "hi"라는 글자를 출력하기

function hi() {
    alert("hi");
}
