<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>个人资料</title>

		<link href="/static/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="/static/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="/static/css/personal.css" rel="stylesheet" type="text/css">
		<link href="/static/css/infstyle.css" rel="stylesheet" type="text/css">
		<script src="/static/AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
		<script src="/static/AmazeUI-2.4.2/assets/js/amazeui.js" type="text/javascript"></script>
			
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

					<div class="user-info">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small></div>
						</div>
						<hr/>

						<!--头像 -->
						<div class="user-infoPic">

							<div class="filePic">
								<input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*">
								<img class="am-circle am-img-thumbnail" src="/static/images/getAvatar.do.jpg" alt="" />
							</div>

							<p class="am-form-help">头像</p>

							<div class="info-m">
								<div><b>用户名：<i>${userMessage.name}</i></b></div>
								<div class="u-level">
									<span class="rank r2">
							             <s class="vip1"></s><a class="classes" href="#">铜牌会员</a>
						            </span>
								</div>
								<div class="u-safety">
									<a href="safety.jsp">
									 账户安全
									<span class="u-profile"><i class="bc_ee0000" style="width: 60px;" width="0">60分</i></span>
									</a>
								</div>
							</div>
						</div>

						<!--个人信息 -->
						<div class="info-main">
							<form class="am-form am-form-horizontal" action="/person/personaldata/update" method="post">

								<div class="am-form-group">
									<label for="user-name2" class="am-form-label">昵称</label>
									<div class="am-form-content">

										<input type="text" id="user-name2" name="name" value="${userMessage.name}" placeholder="nickname">




									</div>
								</div>

								<div class="am-form-group">
									<label for="user-name1" class="am-form-label">姓名</label>
									<div class="am-form-content">

										<input type="text" id="user-name1" name="username" value="${userLogin.username}" placeholder="name">
										<input type="hidden" name="userLoginId" value="${userMessage.userLoginId}">




									</div>
								</div>

								<div class="am-form-group">
									<label class="am-form-label">性别</label>
									<div class="am-form-content sex">
										<label class="am-radio-inline">
											<input type="radio" name="sex" class="m" value="男" data-am-ucheck> 男
										</label>
										<label class="am-radio-inline">
											<input type="radio" name="sex" class="fm" value="女" data-am-ucheck> 女
										</label>
										<label class="am-radio-inline">
											<input type="radio" name="sex" class="bm" value="保密" data-am-ucheck> 保密
										</label>
									</div>
								</div>

								<div class="am-form-group">
									<label id="user-birth" class="am-form-label">生日</label>

									<div class="am-form-content birth">

										<div class="birth-select">
											<select name="sel1" id="sel1">
												<option value="year" ></option>
											</select>
                                            <%--<select name="year" onchange="selectYear(this.value)">
                                                <option value="" name="birthday"></option>
                                            </select>
											--%>
											<em>年</em>
										</div>

										<div class="birth-select2">
                                            <%--<select name="month" onchange="selectMonth(this.value)">
                                                <option value="" name="birthday"></option>
                                            </select>--%>
											<select name="sel2" id="sel2">
												<option value="month"></option>
											</select>
											<em>月</em></div>

										<div class="birth-select2">
											<%--<select name="day">
                                            <option value="" name="birthday"></option>
                                        </select>--%>
											<select name="sel3" id="sel3">
												<option value="day" ></option>
											</select>
											<em>日</em></div>

										<span id="result"></span>
										<input type="hidden" name="birthday" value="${userMessage.birthday}" class="bd">
									</div>
							
								</div>

								<div class="am-form-group">
									<label for="user-phone" class="am-form-label">电话</label>
									<div class="am-form-content">
										<input id="user-phone" placeholder="telephonenumber" name="tel" value="${userMessage.tel}" type="tel">

									</div>
								</div>
                                <div class="am-form-group">
                                    <label for="user-email" class="am-form-label">电子邮件</label>
                                    <div class="am-form-content">
                                        <input id="user-email" placeholder="Email" name="email" value="${userMessage.email}" type="email">

                                    </div>
                                </div>

                                <div class="am-form-group address">
                                    <label id="user-address" class="am-form-label">收货地址</label>
                                    <div class="am-form-content address">
                                        <a href="address.jsp">
                                            <p class="new-mu_l2cw">
                                                <span class="province">湖北</span>省
                                                <span class="city">武汉</span>市
                                                <span class="dist">洪山</span>区
                                                <span class="street">雄楚大道666号(中南财经政法大学)</span>
                                                <span class="am-icon-angle-right"></span>
                                            </p>
                                        </a>

                                    </div>
                                </div>
                                <div class="am-form-group safety">
                                    <label id="user-safety" class="am-form-label">账号安全</label>
                                    <div class="am-form-content safety">
                                        <a href="/person/personaldata/safety">

                                            <span class="am-icon-angle-right"></span>

                                        </a>

                                    </div>
                                </div>

								<div class="info-btn">
									<%--<div class="am-btn am-btn-danger">保存修改</div>--%>
										<input type="submit" value="保存修改" class="am-btn am-btn-danger">
								</div>

							</form>

						</div>

					</div>

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
				<jsp:param name="menu" value="information"/>
			</jsp:include>
		</div>


        <script>
			$(function () {
				$(".m").click().val(),
				$(".fm").click().val(),
				$(".bm").click().val();
				$(".bd").click().val();

			});
			//生成日期
			function creatDate()
			{
				//生成1900年-2100年
				for(var i = 2020; i >= 1950; i--)
				{
					//创建select项
					var option = document.createElement('option');
					option.setAttribute('value',i);
					option.innerHTML = i;
					sel1.appendChild(option);
				}
				//生成1月-12月
				for(var i = 1; i <=12; i++){
					var option1 = document.createElement('option');
					option1.setAttribute('value',i);
					option1.innerHTML = i;
					sel2.appendChild(option1);
				}
				//生成1日—31日
				for(var i = 1; i <=31; i++){
					var option2 = document.createElement('option');
					option2.setAttribute('value',i);
					option2.innerHTML = i;
					sel3.appendChild(option2);
				}
			}
			creatDate();
			//保存某年某月的天数
			var days;

			//年份点击 绑定函数
			sel1.onclick = function()
			{
				//月份显示默认值
				sel2.options[0].selected = true;
				//天数显示默认值
				sel3.options[0].selected = true;
			}
			//月份点击 绑定函数
			sel2.onclick = function()
			{
				//天数显示默认值
				sel3.options[0].selected = true;
				//计算天数的显示范围
				//如果是2月
				if(sel2.value == 2)
				{
					//判断闰年
					if((sel1.value % 4 === 0 && sel1.value % 100 !== 0)  || sel1.value % 400 === 0)
					{
						days = 29;
					}
					else
					{
						days = 28;
					}
					//判断小月
				}else if(sel2.value == 4 || sel2.value == 6 ||sel2.value == 9 ||sel2.value == 11){
					days = 30;
				}else{
					days = 31;
				}

				//增加或删除天数
				//如果是28天，则删除29、30、31天(即使他们不存在也不报错)
				if(days == 28){
					sel3.remove(31);
					sel3.remove(30);
					sel3.remove(29);
				}
				//如果是29天
				if(days == 29){
					sel3.remove(31);
					sel3.remove(30);
					//如果第29天不存在，则添加第29天
					if(!sel3.options[29]){
						sel3.add(new Option('29','29'),null)
					}
				}
				//如果是30天
				if(days == 30){
					sel3.remove(31);
					//如果第29天不存在，则添加第29天
					if(!sel3.options[29]){
						sel3.add(new Option('29','29'),null)
					}
					//如果第30天不存在，则添加第30天
					if(!sel3.options[30]){
						sel3.add(new Option('30','30'),null)
					}
				}
				//如果是31天
				if(days == 31){
					//如果第29天不存在，则添加第29天
					if(!sel3.options[29])
					{
						sel3.add(new Option('29','29'),null)
					}
					//如果第30天不存在，则添加第30天
					if(!sel3.options[30])
					{
						sel3.add(new Option('30','30'),null)
					}
					//如果第31天不存在，则添加第31天
					if(!sel3.options[31])
					{
						sel3.add(new Option('31','31'),null)
					}
				}
			}

			//结果显示 设置好日期时间后 弹窗通知
			box.onclick = function()
			{
				//当年、月、日都已经为设置值时
				if(sel1.value !='year' && sel2.value != 'month' && sel3.value !='day')
				{
					alert("日期时间已经设定好");
				}
			}

		</script>
	</body>

</html>