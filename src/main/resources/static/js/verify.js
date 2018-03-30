var randomNumber;
var phone ;
$(document).ready(function() {
    //获取实时电话号码
    $("#phoneNumber").bind('input porpertychange',function () {
        phone = $("#phoneNumber").val();
    });
});

//向短信服务发送请求的过程
function getVerify() {
    //随机生成一个4位数的随机数
    var num = 8999;
    var top = 9999;
    var bottom = 1000;
    num = parseInt(Math.random() * (top - bottom + 1) + bottom);
    randomNumber = num;
    $.post("/message", {verifyCode: num, phoneNumber: phone},function(data){
        alert(data);
    });
}

//检查表单属性是否为非空、非法值以及验证码正确性
function check() {
    var verifycode = $("#verifyNumber").val();
    var phone = $("#phoneNumber").val();
    if( verifycode == ""){
        alert("请输入手机号码");
        return false;
    }
    if(phone == ""){
        alert("请输入验证码");
        return false;
    }
    if (verifycode == randomNumber) {
        return true;
    } else {
        alert("验证码错误");
        return false;
    }
}