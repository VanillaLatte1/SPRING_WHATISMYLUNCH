//recommend프로그램을 실행하고 나서 데이터를 담기

$(document).ready(function(){
    $.getJSON("/api/v1/recommend", function(result){
        let html = "";
        $.each(result, function(i, field){
            // $("div").append(field + " ");
            // console.log(field.menu);
            // console.log(field['price']);
            // console.log(field.img);
            html += "<h3>" + field.menu + "</h3>";
            html += "<h5>" + field.price + "</h5>";
            html += "<img src='" + field.img + "'>";
        });
        $("#recommend").html(html);
    });
});