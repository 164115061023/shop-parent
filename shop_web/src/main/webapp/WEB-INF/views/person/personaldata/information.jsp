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
											<input type="radio" name="radio10" class="m" value="male" data-am-ucheck> 男
										</label>
										<label class="am-radio-inline">
											<input type="radio" name="radio10" class="fm" value="female" data-am-ucheck> 女
										</label>
										<label class="am-radio-inline">
											<input type="radio" name="radio10" class="bm" value="secret" data-am-ucheck> 保密
										</label>
									</div>
								</div>

								<div class="am-form-group">
									<label id="user-birth" class="am-form-label">生日</label>
									<div class="am-form-content birth">
										<div class="birth-select">
                                           <%-- <select name="year" οnchange="selectYear(this.value)">
                                                <option value=""></option>
                                            </select>--%>
											<select data-am-selected >
												<option value=""></option>
											</select>
											<em>年</em>
										</div>
										<div class="birth-select2">
                                            <%--<select name="month" οnchange="selectMonth(this.value)">
                                                <option value=""></option>
                                            </select>--%>
											<select data-am-selected>
												<option value=""></option>

											</select>
											<em>月</em></div>
										<div class="birth-select2">
                                            <%--<select name="day">
                                                <option value=""></option>
                                            </select>--%>
											<select data-am-selected>
												<option value=""></option>

											</select>
											<em>日</em></div>
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
										<input type="submit" value="保存修改">
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

            /*function dateStart()

            {//月份对应天数
                MonHead = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

                //给年下拉框赋内容
                var y  = new Date().getFullYear();
                for (var i = (y-50); i < (y+50); i++) //以今年为准，前50年，后50年
                    document.date.year.options.add(new Option(" "+ i +" 年", i));

                //给月下拉框赋内容
                for (var i = 1; i < 13; i++)
                    document.date.month.options.add(new Option(" " + i + " 月", i));

                document.date.year.value = y;
                document.date.month.value = new Date().getMonth() + 1;
                var n = MonHead[new Date().getMonth()];
                if (  new Date().getMonth() ==1 && IsPinYear(yearvalue)  )
                    n++;
                writeDay(n); //赋日期下拉框
                document.date.day.value = new Date().getDate();
            }

            if(document.attachEvent)
                window.attachEvent("onload", dateStart);
            else
                window.addEventListener('load', dateStart, false);

            function selectYear(str) //年发生变化时日期发生变化(主要是判断闰平年)
            {
                var monthvalue = document.date.month.options[document.date.month.selectedIndex].value;
                if (monthvalue == "")
                {
                    var e = document.date.day;
                    optionsClear(e);
                    return;
                }
                var n = MonHead[monthvalue - 1];
                if (  monthvalue ==2 && IsPinYear(str)  )
                    n++;
                writeDay(n);
            }

            function selectMonth(str)   //月发生变化时日期联动
            {
                var yearvalue = document.date.year.options[document.date.year.selectedIndex].value;
                if (yearvalue == "")
                {
                    var e = document.date.day;
                    optionsClear(e);
                    return;
                }
                var n = MonHead[str - 1];
                if (  str ==2 && IsPinYear(yearvalue)  )
                    n++;
                writeDay(n);
            }

            function writeDay(n)   //据条件写日期的下拉框
            {
                var e = document.date.day; optionsClear(e);
                for (var i=1; i<(n+1); i++)
                    e.options.add(new Option(" "+ i + " 日", i));
            }

            function IsPinYear(year)//判断是否闰平年
            {
                return(  0 == year%4 && ( year%100 !=0 || year%400 == 0 )  );
            }

            function optionsClear(e)
            {
                e.options.length = 1;
            }*/

		</script>
	</body>

</html>