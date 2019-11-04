<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>修改密码</title>

		<link href="/static/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="/static/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="/static/css/personal.css" rel="stylesheet" type="text/css">
		<link href="/static/css/stepstyle.css" rel="stylesheet" type="text/css">

		<script type="text/javascript" src="/static/js/jquery-1.7.2.min.js"></script>
		<script src="/static/AmazeUI-2.4.2/assets/js/amazeui.js"></script>

	</head>

	<body>
		<!--头 -->
		<header>
			<article>
				<div class="mt-logo">
					<!--顶部导航条 -->
					<div class="am-container header">
						<ul class="message-l">
							<div class="topMessage">
								<div class="menu-hd">
									<a href="#" target="_top" class="h">亲，请登录</a>
									<a href="#" target="_top">免费注册</a>
								</div>
							</div>
						</ul>
						<ul class="message-r">
							<div class="topMessage home">
								<div class="menu-hd"><a href="/home/home" target="_top" class="h">商城首页</a></div>
							</div>
							<div class="topMessage my-shangcheng">
								<div class="menu-hd MyShangcheng"><a href="/person/index" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
							</div>
							<div class="topMessage mini-cart">
								<div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
							</div>
							<div class="topMessage favorite">
								<div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>

							</div>
						</ul>
						</div>

						<!--悬浮搜索框-->

						<div class="nav white">
							<div class="logoBig">
								<li><img src="/static/images/logobig.png" /></li>
							</div>

							<div class="search-bar pr">
								<a name="index_none_header_sysc" href="#"></a>
								<form>
									<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
									<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
								</form>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
			</article>
		</header>
            <div class="nav-table">
					   <div class="long-title"><span class="all-goods">全部分类</span></div>
					   <div class="nav-cont">
							<ul>
								<li class="index"><a href="#">首页</a></li>
                                <li class="qc"><a href="#">闪购</a></li>
                                <li class="qc"><a href="#">限时抢</a></li>
                                <li class="qc"><a href="#">团购</a></li>
                                <li class="qc last"><a href="#">大包装</a></li>
							</ul>
						    <div class="nav-extra">
						    	<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
						    	<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
						    </div>
						</div>
			</div>
			<b class="line"></b>
		<div class="center">
			<div class="col-main">

				<div class="main-wrap">

					<div class="am-cf am-padding">
						<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">修改密码</strong> / <small>Password</small></div>
					</div>
					<hr/>
					<!--进度条-->
					<div class="m-progress">

						<div class="m-progress-list">
							<span class="step-1 step">
                                <em class="u-progress-stage-bg"></em>
                                <i class="u-stage-icon-inner">1<em class="bg"></em></i>
                                <p class="stage-name">重置密码</p>
                            </span>

							<span class="step-2 step">
                                <em class="u-progress-stage-bg"></em>
                                <i class="u-stage-icon-inner oe2">2<em class="bg"></em></i>
                                <p class="stage-name">完成</p>
                            </span>
							<span class="u-progress-placeholder"></span>
						</div>

						<div class="u-progress-bar total-steps-2">
							<div class="u-progress-bar-inner"></div>
						</div>
					</div>
					<%--进度条end--%>

					<form class="am-form am-form-horizontal" action="/person/personaldata/updatePwd" method="post">

						<div class="am-form-group">
							<label for="oldpassword" class="am-form-label">原密码</label>
							<div class="am-form-content">
								<%--<input type="password" name="password"  id="user-old-password" placeholder="请输入原登录密码">--%>
									<input type='password' id="oldpassword"  name="oldpassword"/><div style="display: inline" id="tip1"></div>
									<input type="hidden" name="id" value="${userLogin.id}">
							</div>
						</div>

						<div class="am-form-group">
							<label for="password1" class="am-form-label">新密码</label>
							<div class="am-form-content">
								<input type='password' id="password1" name="password" placeholder="length must be 6-18"/><div style="display: inline" id="tip2"></div>
								<%--<input type="password" name="password" class="pw1" id="user-new-password" placeholder="由数字、字母组合，不能与原密码相同">--%>
							</div>
						</div>

						<div class="am-form-group">
							<label for="password2" class="am-form-label">确认密码</label>
							<div class="am-form-content">
								<input type='password' id="password2" name="password2" placeholder="must match with the first"/><div style="display: inline" id="tip3"></div>
								<%--<input type="password" name="password" class="pw2" id="user-confirm-password" placeholder="请再次输入上面的密码">--%>
							</div>
						</div>

						<div class="info-btn">
							<%--<div class="am-btn am-btn-danger">保存修改</div>--%>
							<input type="submit" value="保存修改" id="btn" class="am-btn am-btn-danger">

						</div>

					</form>

				</div>
				<!--底部-->
				<div class="footer">
					<div class="footer-hd">
						<p>
							<a href="#">恒望科技</a>
							<b>|</b>
							<a href="#">商城首页</a>
							<b>|</b>
							<a href="#">支付宝</a>
							<b>|</b>
							<a href="#">物流</a>
						</p>
					</div>
					<div class="footer-bd">
						<p>
							<a href="#">关于恒望</a>
							<a href="#">合作伙伴</a>
							<a href="#">联系我们</a>
							<a href="#">网站地图</a>
							<em>© 2015-2025 Hengwang.com 版权所有. 更多模板 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></em>
						</p>
					</div>
				</div>
			</div>

			<jsp:include page="../left/left.jsp">
				<jsp:param name="menu" value="password"/>
			</jsp:include>
		</div>

		<script>
			$(document).ready(function(){
				$("#oldpassword").blur(function(){
					var param=$("#oldpassword").val();
					$.ajax({
						url:"/person/personaldata/updatePwd",
						data:{password:param},
						success:function(e){
							if(e.code==1){
								$("#tip1").html("<font color=\"green\" size=\"2\">  Correct</font>");
							}
							else{
								$("#tip1").html("<font color=\"red\" size=\"2\">  Wrong</font>");
							}
						}
					});
				});
				$("#password1").blur(function(){
					var num=$("#password1").val().length;
					if(num<6){
						$("#tip2").html("<font color=\"red\" size=\"2\">  too short</font>");
					}
					else if(num>18){
						$("#tip2").html("<font color=\"red\" size=\"2\">  too long</font>");
					}
					else{
						$("#tip2").html("<font color=\"green\" size=\"2\"> Accept</font>");
					}
				}) ;
				$("#password2").blur(function(){
					var tmp=$("#password1").val();
					var num=$("#password2").val().length;
					if($("#password2").val()!=tmp){
						$("#tip3").html("<font color=\"red\" size=\"2\">  Wrong</font>");
					}
					else{
						if(num>=6&&num<=18){
							$("#tip3").html("<font color=\"green\" size=\"2\">  Correct</font>");
						}
						else{
							$("#tip3").html("<font color=\"red\" size=\"2\">  invalid</font>");
						}
					}
				});
				$("#btn").click(function(){
					var flag=true;
					var old=$("#oldpassword").val();
					var pass=$("#password1").val();
					var pass2=$("#password2").val();
					var num1=$("#password1").val().length;
					var num2=$("#password2").val().length;
					$(".oe2").show().css({"background-color": "green"})
					if(num1!=num2||num1<6||num2<6||num1>18||num2>18||pass!=pass2){
						flag=false;
					}
					else{
						flag=true;
					}
					if(flag){
						$.ajax({
							url:"/person/personaldata/updatePwd",
							data:{oldpassword:old,password:pass},
							success:function(e){
								if(e.code==1){
									$("#oldpassword").val("");
									$("#password1").val("");
									$("#password2").val("");
									$("#tip1").empty();
									$("#tip2").empty();
									$("#tip3").empty();
								}

							}
						});
					}
				});
			});
		</script>
	</body>

</html>