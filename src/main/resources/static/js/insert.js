var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        })
    },
    save : function () {                    //json 타입으로 데이터를 보냄
        var data = {
            menu : $("#menu").val(),
            price : $("#price").val(),
            img : $("#img").val()
        };

        $.ajax({
            type : 'POST',
            url : '/api/v1/insert',
            dataType : 'json',
            contentType : 'application/json; charset=utf-8',
            data : JSON.stringify(data)
        }).done(function () {
            alert('메뉴가 정상적으로 등록되었습니다.');
            window.location.href = '/select';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        })
    }
};

main.init();