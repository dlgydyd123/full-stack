//button을 눌렀을 때 img태그의 이미지를 변경하기
//profile.jpg -> h1.jpg -> h2.jpg

document.addEventListener("DOMContentLoaded", function (e) {
    let input = document.querySelector("input");
    let image = document.querySelector("img");
    let img1 = "img/profile.jpg"
    let img2 = "img/hl 1.jpg"
    let img3 = "img/hl 2.jpg"
    input.addEventListener("click", function (e) {
        //img태그의 srd를 수정해야함
        let src = image.getAttribute("src"); //img태그의 src속성의 값을 변수에 저장
        if(src === img1){
            image.setAttribute("src", img2)
        }else if(src === img2){
            image.setAttribute("src", img3)
        }else{
            image.setAttribute("src", img1)
        }
           
    
    })
})