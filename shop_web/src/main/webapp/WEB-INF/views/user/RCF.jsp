<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head lang="en">
    <meta charset="UTF-8">
    <title>注册</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="stylesheet" href="/static/AmazeUI-2.4.2/assets/css/amazeui.min.css"/>
    <link href="/static/css/dlstyle.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="/static/layui/css/layui.css">

    <script src="/static/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="/static/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>


</head>

<body>

<div class="login-boxtitle">
    <a href=""><img alt="" src="/static/images/logobig.png"/></a>
</div>

<div class="res-banner">
    <div class="res-main">

        <c:if test="${msg == null}">
            <h1 style="font-size: x-large">请登录邮箱确认注册</h1>
        </c:if>

        <c:if test="${msg != null}">
            <h1 style="font-size: x-large">您已验证成功</h1>
            <a href="/user/login" style="font-size: x-large">点我快速登录</a>
        </c:if>

        <c:if test="${msg == 'success'}">
            <h1 style="font-size: x-large">您已注册成功</h1>
            <a href="/user/login" style="font-size: x-large">点我快速登录</a>
        </c:if>
    </div>

    <div class="footer ">
        <div class="footer-hd ">
            <p>
                <a href="# ">恒望科技</a>
                <b>|</b>
                <a href="# ">商城首页</a>
                <b>|</b>
                <a href="# ">支付宝</a>
                <b>|</b>
                <a href="# ">物流</a>
            </p>
        </div>
        <div class="footer-bd ">
            <p>
                <a href="# ">关于恒望</a>
                <a href="# ">合作伙伴</a>
                <a href="# ">联系我们</a>
                <a href="# ">网站地图</a>
                <em>© 2015-2025 Hengwang.com 版权所有. 更多模板 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a>
                    - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></em>
            </p>
        </div>
    </div>
</div>


<script src="/static/layui/layui.js"></script>
<script>

</script>

</body>

</html>