<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head lang="en">
    <meta charset="UTF-8">
    <title>登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="stylesheet" href="/static/AmazeUI-2.4.2/assets/css/amazeui.css"/>

    <link rel="stylesheet" href="/static/css/dlstyle.css" type="text/css">

    <link rel="stylesheet" href="/static/layui/css/layui.css">

</head>

<body>

<div class="login-boxtitle">
    <a href="/main/home"><img alt="logo" src="/static/images/logobig.png"/></a>
</div>

<div class="login-banner">
    <div class="login-main">
        <div class="login-banner-bg"><span></span><img src="/static/images/big.jpg"/></div>
        <div class="login-box">

            <h3 class="title">登录商城</h3>

            <div class="clear"></div>

            <div class="login-form">
                <form class="layui-form" action="/user/tologin" style="height:140px">
                    <div class="user-name">
                        <label for="user"><i class="am-icon-user"></i></label>
                        <input type="text" class="username" lay-verify="required||phone" name="username" id="user" placeholder="邮箱/手机/用户名" lay-verType="tips">
                    </div>
                    <div class="user-pass" style="height:25px">
                        <label for="password"><i class="am-icon-lock"></i></label>
                        <input type="password" class="password" lay-verify="pass" name="password" id="password" placeholder="请输入6~16位密码"  lay-verType="tips">
                    </div>

                    <div class="am-cf" style="height: 52px;line-height:72px;background-color:#f8f8f8;">
                        <input type="submit" lay-submit name="" value="登 录"  class="am-btn am-btn-primary am-btn-sm">
                    </div>

                </form>

            </div>
            <div class="login-links">
                <label for="remember-me"><input id="remember-me" type="checkbox">记住密码</label>
                <a href="#" class="am-fr">忘记密码</a>
                <a href="/user/register" class="zcnext am-fr am-btn-default">注册</a>
                <br/>
            </div>
           <%-- <div class="am-cf">
                <input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm submit">
            </div>--%>
            <div class="partner">
                <h3>合作账号</h3>
                <div class="am-btn-group">
                    <li><a href="#"><i class="am-icon-qq am-icon-sm"></i><span>QQ登录</span></a></li>
                    <li><a href="#"><i class="am-icon-weibo am-icon-sm"></i><span>微博登录</span> </a></li>
                    <li><a href="#"><i class="am-icon-weixin am-icon-sm"></i><span>微信登录</span> </a></li>
                </div>
            </div>

        </div>
    </div>
</div>


<div class="footer ">
    <div class="footer-hd ">
        <p>
            <a href="#">恒望科技</a>
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
            <em>© 2015-2025 zl.com 版权所有. 更多模板 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> -
                Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></em>
        </p>
    </div>
</div>
<h1>${param.code == '200'}</h1>
<%--<script src="/static/jquery-3.4.1.min.js"></script>--%>
<script src="/static/layui/layui.js"></script>
<script>


    layui.use(['form','layer'], function () {
        var form = layui.form;
        var layer = layui.layer;
        //自定义验证规则
        form.verify({
            pass: [
                /^[\S]{6,16}$/
                ,'密码必须6到16位，且不能出现空格'
            ]
        });


        <c:if test="${param.code == '200'}">
            layer.msg("用户名或密码错误",{
                icon:5
                ,offset:['32%', '63%']
            });
        </c:if>

    });


</script>
</body>


</html>