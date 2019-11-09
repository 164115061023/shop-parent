<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>绑定手机</title>

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
						<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">绑定手机</strong> / <small>Bind&nbsp;Phone</small></div>
					</div>
					<hr/>
					<!--进度条-->
					<div class="m-progress">
						<div class="m-progress-list">
							<span class="step-1 step">
                                <em class="u-progress-stage-bg"></em>
                                <i class="u-stage-icon-inner">1<em class="bg"></em></i>
                                <p class="stage-name">绑定手机</p>
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
					<form class="am-form am-form-horizontal" action="/person/personaldata/changetel" method="post">
						<div class="am-form-group bind">
							<label for="user-phone" class="am-form-label">原手机号</label>
							<div class="am-form-content">
								<span id="user-phone">${userMessage.tel}</span>
							</div>
						</div>

						<%--<div class="am-form-group code">
							<label for="user-code" class="am-form-label">验证码</label>
							<div class="am-form-content">
								<input type="tel" id="user-code" name="code" placeholder="短信验证码">
							</div>
							<a class="btn" href="javascript:void(0);" onclick="sendMobileCode();" id="sendMobileCode">
								&lt;%&ndash;<div class="am-btn am-btn-danger">验证码</div>&ndash;%&gt;
								<input type="submit" class="am-btn am-btn-danger" id="code-btn" value="验证码">
							</a>
						</div>--%>

						<div class="am-form-group">
							<label for="user-new-phone" class="am-form-label">验证手机</label>
							<div class="am-form-content">
								<input type="hidden" name="userLoginId" value="${userMessage.userLoginId}">
								<input type="tel" id="user-new-phone" class="np" name="tel" placeholder="绑定新手机号">
							</div>
						</div>
						<div class="am-form-group code">
							<label for="user-new-code" class="am-form-label">验证码</label>
							<div class="am-form-content">
								<input type="tel" id="user-new-code" class="dx" name="code" placeholder="短信验证码">
							</div>
							<a class="btn" href="javascript:void(0);">
								<div class="am-btn am-btn-danger" id="code-btn">验证码</div>
								<%--<input  class="am-btn am-btn-danger" id="code-btn" value="验证码">--%>
							</a>
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
				<jsp:param name="menu" value="bindphone"/>
			</jsp:include>
		</div>

		<script>
			$(function () {
				var code = ""; //接收验证码
				$('#code-btn').click(function(){
					var count =60;
					var tel=$(".np").val();//手机号码
					$.ajax({
							type:'post',
							url:'/person/personaldata/sendCode',
							data:'tel='+tel,
							success:function (abc) {
								code=abc;
					  }
					});
					//开始计时
					$("#code-btn").attr('disabled','disabled');
					$("#code-btn").html(count + "秒");
					var timer = setInterval(function(){//设置间隔
						count--;
						$("#code-btn").html(count + "秒");
						if (count==0) {
							clearInterval(timer);//清空间隔
							$("#code-btn").attr("disabled",false);//启用按钮
							$("#code-btn").html("重新发送验证码");
							code = "";//清除验证码。如果不清除，过时间后，输入收到的验证码依然有效
						}
					},1000);
				});
				$("#btn").click(function () {
					/*$(".oe2").show().css({"background-color": "green"})*/
					/*console.log("adada"+code);
					console.log($.trim($(".dx").val()));*/
					if($.trim($(".dx").val())!=code){
						alert("请输入正确的验证码");
						return false;
					}else if($.trim($(".dx").val())==code){
						return true;
					}
				});
			});
		</script>

	</body>

</html>