<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

		<title>地址管理</title>

		<link href="/static/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
		<link href="/static/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="/static/css/personal.css" rel="stylesheet" type="text/css">
		<link href="/static/css/addstyle.css" rel="stylesheet" type="text/css">
		<script src="/static/AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
		<%--<script src="/static/AmazeUI-2.4.2/assets/js/amazeui.js"></script>--%>


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

					<div class="user-address">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">地址管理</strong> / <small>Address&nbsp;list</small></div>
						</div>
						<hr/>
						<ul class="am-avg-sm-1 am-avg-md-3 am-thumbnails">
							<li class="user-addresslist defaultAddr">
								<span class="new-option-r"><i class="am-icon-check-circle"></i>默认地址</span>
								<p class="new-tit new-p-re">
									<span class="new-txt">${userMessage.name}</span>
									<span class="new-txt-rd2">${address.phone}</span>
								</p>
								<div class="new-mu_l2a new-p-re">
									<p class="new-mu_l2cw">
										<span class="title">地址：</span>
										<span class="province">${address.province}</span>
										<span class="city">${address.city}</span>
										<span class="dist">${address.district}</span>
										<span class="street">${address.detailaddress}</span></p>
								</div>
								<div class="new-addr-btn">
									<a href="#"><i class="am-icon-edit"></i>编辑</a>
									<span class="new-addr-bar">|</span>
									<a href="javascript:void(0);" onclick="delClick(this);"><i class="am-icon-trash"></i>删除</a>
								</div>
							</li>
						</ul>


						<div class="clear"></div>
						<a class="new-abtn-type" data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0}">添加新地址</a>
						<!--例子-->
						<div class="am-modal am-modal-no-btn" id="doc-modal-1">

							<div class="add-dress">

								<!--标题 -->
								<div class="am-cf am-padding">
									<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">新增地址</strong> / <small>Add&nbsp;address</small></div>
								</div>
								<hr/>

								<div class="am-u-md-12 am-u-lg-8" style="margin-top: 20px;">

									<form class="am-form am-form-horizontal" action="/person/personaldata/updateAddress" method="post">

										<div class="am-form-group">
											<label for="user-name" class="am-form-label">收货人</label>
											<div class="am-form-content">
												<input type="text" id="user-name" name="consignee" placeholder="收货人">
                                                <input type="hidden" name="userLoginId" value="${address.userLoginId}">
											</div>
										</div>

										<div class="am-form-group">
											<label for="user-phone" class="am-form-label">手机号码</label>
											<div class="am-form-content">
												<input id="user-phone" placeholder="手机号必填" name="phone" type="text">
											</div>
										</div>
										<div class="am-form-group">

											<label id="user-address" class="am-form-label">所在地</label>
											<div class="am-form-content address">

												<select id="prov2" name="prov" >
													<option>--省份--</option>
												</select>
												<!--城市选择-->
												<select id="city2" name="city1" >
													<option>--市--</option>
												</select>
												<!--县区选择-->
												<select id="country" name="county">
													<option>--县--</option>
												</select>

											</div>
										</div>

										<div class="am-form-group">
											<label for="user-intro" class="am-form-label">详细地址</label>
											<div class="am-form-content">
												<textarea class="" rows="3" id="user-intro"  name="detailaddress" placeholder="输入详细地址"></textarea>
												<small>100字以内写出你的详细地址/static.</small>
											</div>
										</div>

										<div class="am-form-group">
											<div class="am-u-sm-9 am-u-sm-push-3">
                                                <input type="submit" value="保存" class="am-btn am-btn-danger">
												<a href="javascript: void(0)" class="am-close am-btn am-btn-danger btn met1" id="button-show" data-am-modal-close >取消</a>
											</div>
										</div>
									</form>
								</div>

							</div>

						</div>

					</div>


					<script type="text/javascript">
						$(document).ready(function(){
							$(".new-option-r").click(function() {
								$(this).parent('.user-addresslist').addClass("defaultAddr").siblings().removeClass("defaultAddr");
							});
							var $ww = $(window).width();
							if($ww>640) {
								$("#doc-modal-1").removeClass("am-modal am-modal-no-btn")
							}

						});
					</script>

					<div class="clear"></div>

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
				<jsp:param name="menu" value="address"/>
			</jsp:include>
		</div>

        <script src="/static/AmazeUI-2.4.2/assets/js/city.min.js"></script>
        <script>

            $(function () {
                //循环省份再省份下拉框中获取数组中的值
                for(var index in aProvince){
                    $("#prov2").append("<option value = "+index+">"+aProvince[index].name+"</option>");
                }

                //通过省份获取市的值
                $("#prov2").change(function(){
                    $("#city2").html("<option>--市--</option>");//清空选框中的值，让他显示为‘市’
                    var pname = $(this).find("option:selected").text();//获取被选中的select中的当前值
                    for(var index in aProvince){
                        if(pname == aProvince[index].name){//判断获取的值是否和省份值相同
                            var citys = aProvince[index].city;//通过省份索引得到所有的市
                            //console.log(citys);
                            for(var ci in citys){
                                 $("#city2").append("<option value = "+ci+">"+citys[ci].name+"</option>");
                            }
                            break;
                        }
                    }

                });

                $("#city2").change(function(){
                    $("#country").html("<option>--县--</option>");
                    var cname = $(this).find("option:selected").text();//获取市的select text当前值
                    //console.log(cname);
                    for(var ai in aProvince){
                            var citys = aProvince[ai].city;//通过省获取所有的市
                            //console.log(citys);
                            for(var ci in citys){
                                //console.log("xxxxxxxxxx"+citys[ci].name);
                                if(cname == citys[ci].name){
                                    for(var xi in citys[ci].districtAndCounty){
                                        $("#country").append("<option value = "+ci+">"+citys[ci].districtAndCounty[xi]+"</option>");
                                    }
                                    break;
                                }
                            }
                    }
                });

            });
        </script>


	</body>

</html>