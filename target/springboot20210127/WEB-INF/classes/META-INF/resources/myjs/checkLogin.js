var yongHuJSON = JSON.parse(sessionStorage.getItem("yongHu"));
if(yongHuJSON == null) {
    alert("请先登录!");
    window.location.href="login.html";
}