<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	var cnt = 0;
	function doFunction() {
		jQuery
				.ajax({
					type : "GET",
					url : "http://localhost:8080/ShoppingCartApplication/products",
					contentType : "application/json; charset=utf-8",
					dataType : "json",
					success : function(data, status, jqXHR) {
						var parsed = $.parseJSON(JSON.stringify(data));
						var newHTML = [];

						for (i = 0; i < parsed.listOfProducts.length; i++) {

							newHTML
									.push("<div class='col-sm-4 col-lg-4 col-md-4'><div class='thumbnail'><div class='imgcls'>"
											+ "<img src='<c:url value='/resources/images/"+parsed.listOfProducts[i].productId+".jpg' />' alt=''>"
											+ "</div><div class='caption'><h4 class='pull-right'>"
											+ parsed.listOfProducts[i].productPrice
											+ "</h4><h4><a onclick='showProduct("
											+ parsed.listOfProducts[i].productId
											+ ")'>"
											+ parsed.listOfProducts[i].productName
											+ "</a></h4><a href='#' onclick='addCardCount()' class='btn btn-info btn-sm pull-right'><span class='glyphicon glyphicon-shopping-cart'>"
											+ "</span> Add to Cart</a></div></div></div>");
						}
						$("#content").html(newHTML);
						$("#productview").hide();
						$("#content").show();
						
					},

					error : function(jqXHR, status) {
						// error handler
					}
				});
	}

	function showProduct(id) {
		jQuery
				.ajax({
					type : "GET",
					url : "http://localhost:8080/ShoppingCartApplication/product/"
							+ id,
					contentType : "application/json; charset=utf-8",
					dataType : "json",
					success : function(data, status, jqXHR) {
						var respObj = $.parseJSON(JSON.stringify(data));
						$("#content").hide();
						$("#productview")
								.html(
										"<div class='row'><div id='imgdiv' class='col-sm-4 col-lg-4 col-md-4'>"
												+ "<img class='img-responsive img-rounded' src='<c:url value='/resources/images/"+respObj.productId+".jpg' />' alt=''>"
												+ "</div><div class='col-md-4'><b><h2>"
												+ respObj.productName
												+ "</h2></b><h4>"
												+ respObj.productPrice
												+ "</h4>" + "<p id='proddesc'>"
												+ respObj.productDecription
												+ "</p></div></div><div class='nxtpgbt'><a href='#' onclick='addCardCount()' class='btn btn-info btn-lg'><span class='glyphicon glyphicon-shopping-cart'>"
												+ "</span> Add to Cart</a></div>");
						$("#productview").show();
					},

					error : function(jqXHR, status) {
						// error handler
					}
				});
	}

	function addCardCount() {
		cnt = cnt + 1;
		$("#itemcount").html("<b>" + cnt + "</b>");
	}

	function resetCount(){
		cnt = 0;
		$("#itemcount").html("<b>" + cnt + "</b>");
	}
</script>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>EKart- Online</title>


<!-- Bootstrap Core CSS -->
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="<c:url value="/resources/css/shop-homepage.css" />"
	rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body onload="doFunction()">
	<c:set var="count" value="0" scope="application" />
	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li>
					<!-- <a href="#" onclick="doFunction()">Home</a> --> <a href="#"
					onclick="doFunction()" class="btn btn-default btn-md"> <span
						class="glyphicon glyphicon-home"></span> Home
				</a>
				</li>
				<li class="carticon"><span
					class="btn btn-default btn-lg glyphicon glyphicon-shopping-cart"><span
						class="btn btn-default btn-xs" id="itemcount"></span></span><span
					class="btn btn-default btn-sm glyphicon glyphicon-refresh" title="Clear Cart" onclick="resetCount()"></span></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container --> </nav>

	<!-- Page Content -->
	<div class="container">

		<div class="row">

			<div class="col-md-9">

				<div class="row" id="content"></div>
				<div class="row" id="productview"></div>

			</div>

		</div>

	</div>

	<!-- jQuery -->
	<script src="<c:url value="/resources/js/jquery.js" />"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</body>

</html>
