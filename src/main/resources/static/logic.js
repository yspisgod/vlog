
$(function () {
    $("#upload").click(function(){
        var file=document.querySelector("#file").files[0];
        var formdata=new FormData();
        formdata.append("file",file);
        /*var xhr=new XMLHttpRequest();
        xhr.open("post","/test");

        //回调
        xhr.onreadystatechange = function () {
             $("#process").innerText=xhr.responseText;

        }
        //获取上传的进度
        xhr.upload.onprogress = function (event) {
                var percent = event.loaded/event.total *100;
                $("#process").innerText= percent+"%";
        }
        //将formdata上传
        xhr.send(formdata);*/

        $.ajax({
            url:'/test/',
            dataType:'json',
            type:'POST',
            async: false,
            data: formdata,
            processData : false, // 使数据不做处理
            contentType : false, // 不要设置Content-Type请求头
            success: function(data) {
                console.log(data);
                $("#process").html(data.result);
            }
            // },
            // error:function(response){
            //     $("#process").html(response);
            // }
        });


    });
});