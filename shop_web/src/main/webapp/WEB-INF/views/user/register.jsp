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
        <div class="login-banner-bg"><span></span><img src="/static/images/big.jpg"/></div>
        <div class="login-box">

            <div class="am-tabs" id="doc-my-tabs">
                <ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
                    <li class="${param.msg!='phone'?'am-active':''}"><a href="">邮箱注册</a></li>
                    <li class="${param.msg=='phone'?'am-active':''}"><a href="">手机号注册</a></li>
                </ul>

                <div class="am-tabs-bd">
                    <div class="am-tab-panel ${param.msg!='phone'?'am-active':''}">
                        <form method="post" class="layui-form" action="/user/toregisteremail" id="form1">

                            <div class="user-email">
                                <label for="email"><i class="am-icon-envelope-o"></i></label>
                                <input type="email" name="username" lay-verify="required|email" id="email"
                                       placeholder="请输入邮箱账号" lay-verType="tips">
                            </div>
                            <div class="user-pass">
                                <label for="password"><i class="am-icon-lock"></i></label>
                                <input type="password" name="password1" lay-verify="pass" id="password"
                                       placeholder="设置密码" lay-verType="tips">
                            </div>
                            <div class="user-pass">
                                <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
                                <input type="password" name="password2" lay-verify="pass" id="passwordRepeat"
                                       placeholder="确认密码" lay-verType="tips">
                            </div>

                            <%--<input name="testchk" id="reader-me4" type="checkbox" style="zoom: 1%"> 点击表示您同意商城《服务协议》
                        --%>
                            <input id="formOne" style="display: none" type="submit" lay-submit lay-filter="fOne" name=""
                                   value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">

                        </form>

                        <div class="login-links">
                            <label for="reader-me">
                                <input class="form1" form="form1" id="reader-me" type="checkbox" lay-filter="checkbox1">
                                点击表示您同意商城《服务协议》
                            </label>
                        </div>
                        <div class="am-cf">
                            <input id="submit1" type="submit" name="" value="注册"
                                   class="am-btn am-btn-primary am-btn-sm am-fl">
                        </div>

                    </div>

                    <div class="am-tab-panel ${param.msg=='phone'?'am-active':''}">
                        <form id="form2" method="post" class="layui-form" action="/user/toregisterphone">
                            <div class="user-phone">
                                <label for="phone"><i class="am-icon-mobile-phone am-icon-md"></i></label>
                                <input type="tel" class="tel" name="username" id="phone" lay-verify="required|phone" placeholder="请输入手机号" lay-verType="tips">
                            </div>
                            <div class="verification">
                                <label for="code"><i class="am-icon-code-fork"></i></label>
                                <input type="text" style="width: 183px" name="code" id="code" lay-verify="required" lay-verType="tips"
                                       placeholder="请输入验证码">
                                <button class="btn2 layui-btn"
                                   >
                                    获取验证码</button>
                            </div>
                            <div class="user-pass">
                                <label for="password"><i class="am-icon-lock"></i></label>
                                <input type="password" name="password1" id="password2" lay-verify="pass" placeholder="设置密码" lay-verType="tips">
                            </div>
                            <div class="user-pass">
                                <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
                                <input type="password" name="password2" id="passwordRepeat2" lay-verify="pass" placeholder="确认密码" lay-verType="tips">
                            </div>

                            <input id="formTwo" style="display: none" type="submit" lay-submit lay-filter="fTwo" name=""
                                   value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">

                        </form>

                        <div class="login-links">
                            <label for="reader-me">
                                <input form="formTwo" class="form2" id="reader-me2" type="checkbox"> 点击表示您同意商城《服务协议》
                            </label>
                        </div>
                        <div class="am-cf">
                            <input id="submit2" type="submit" name="" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">
                        </div>

                        <hr>
                    </div>

                    <script>
                        $(function () {
                            $('#doc-my-tabs').tabs();
                        })
                    </script>

                </div>
            </div>

        </div>
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

    let code = '';
    $(function () {
        //触发email注册
        $("#submit1").click(function () {
            $('#formOne').trigger("click");
        });
        //触发phone注册
        $("#submit2").click(function () {
            $('#formTwo').trigger("click");
        });

        //注册——手机验证码发送处理start-----------------
        let time = 60;

        let btn = $('.btn2');
        function timeCount() {
            time -= 1;
            if (time > 0) {
                btn.text(time + "秒后重发");
                setTimeout(timeCount, 1000);
            } else {
                time = 60;
                btn.text("重新发送");
                btn.removeAttr("disabled");
                btn.prop("class", "layui-btn");
            }
        }
        //事件处理函数
        btn.click(function () {
            $(this).prop("disabled",true); //防止多次点击
            $(this).prop("class", "layui-btn layui-btn-disabled"); //防止多次点击
            //此处可添加 ajax请求 向后台发送 获取验证码请求
            let tel = $('.tel').val();
            console.log(tel);
            $.ajax({
                type: 'post'
                , url: '/user/sendmessage'
                ,data:{tel:tel}
                , success: function (json) {
                    code = json;
                    console.log(code);
                }
            });

            timeCount();
        })
    });
    //注册——手机验证码发送处理end-----------------


    //layui表单验证start------------------------
    layui.use(['form', 'layer', 'laydate'], function () {
        let form = layui.form;
        let layer = layui.layer;

        <c:if test="${param.msg!=null}">
        layer.msg("您已注册过，去登录吧",{
            icon:3
            , offset: ['32%', '63%']
        });
        </c:if>

        let testArr = [];
        //自定义验证规则
        form.verify({
            pass: [
                /^[\S]{6,16}$/
                , '密码必须6到16位，且不能出现空格'
            ]
        });

        form.on('submit(fOne)', function (data) {		// 根据选中的复选框对应的值存成数组判断数组长度代替验证


            console.log($('.form1').prop('checked'));
            console.log(data.field.password1);

            if(data.field.password1!=data.field.password2){
                layer.msg('两次密码输入不一致', {
                    time: 2000
                    , offset: ['32%', '63%']
                });
                return false;
            }


            if ($('.form1').prop('checked') == true) {
                return true;
            } else {
                layer.msg('请阅读服务协议并勾选', {
                    time: 2000
                    , offset: ['32%', '63%']
                });
                return false;
            }
        });
        form.on('submit(fTwo)', function (data) {		// 根据选中的复选框对应的值存成数组判断数组长度代替验证

            //console.log($('.form2').prop('checked'));
            //console.log(data.form.childNodes);

            if(data.field.password1!=data.field.password2){
                layer.msg('两次密码输入不一致', {
                    time: 2000
                    , offset: ['32%', '63%']
                });
                return false;
            }
            if(data.field.code!=code){
                layer.msg('验证码错误', {
                    time: 2000
                    , offset: ['32%', '63%']
                });
                return false;
            }

            if ($('.form2').prop('checked') == true) {
                return true;
            } else {
                layer.msg('请阅读服务协议并勾选', {
                    time: 2000
                    , offset: ['32%', '63%']
                });
                return false;
            }
        });
    });
    //layui表单验证end------------------------


</script>

</body>

</html>