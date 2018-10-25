<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
	<div id="container" style="width: 90%; margin: auto">
		<!-- start navbar -->
		<nav class="navbar navbar-expand-lg navbar-light bg-primary">
			<a class="navbar-brand" href="#">MARCOMM172</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-item nav-link active" href="#">Home</a> <a
						class="nav-item nav-link" href="#">Product</a> <a
						class="nav-item nav-link" href="#">Logout</a>
				</div>
			</div>
			<form class="form-inline">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</nav>
		<!-- end navbar -->
		<div class="row" style="height: 50px;"></div>
		<div class="row justify-content-md-end" style="padding-bottom:10px">
			<button type="button" class="btn btn-primary"
				id="addBtn" style="width:80px">Add</button>
		</div>
		<div class="row justify-content-md-end" style="padding-bottom:10px">
			<button type="button" class="btn btn-primary" data-toggle="modal"
				data-target="#searchProductModal" style="width:80px">Search</button>
		</div>


	</div>
	<%@include file="/WEB-INF/pages/modal/add-product.html"%>
</body>
<script type="text/javascript">
$(document).ready(function(){
	//get code send to modal
	$("#addBtn").on('click', function(){
		 var id = $(this).attr('id');
		 $.ajax({
			 url : '${pageContext.request.contextPath}/product/getcode',
			 type: 'GET',
			 success : function(data){
				 $('#productcode').val(data);
			 },
			 dataType: 'json'
		 })
		 
		$('#addProductModal').modal();
	 });
	$('#addBtnModal').on('click', function(){
		var product = {
				code : $('#productcode').val(),
				name : $('#productname').val(),
				description : $('#description').val()
		}
		$.ajax({
			url : '${pageContext.request.contextPath}/product/save',
			type : 'POST',
			contentType : 'application/json',
			data : JSON.stringify(product),
			success : function(data){
				console.log("data telah disimpan");
				$('#addProductModal').modal('hide');
			},
			error : function(){
				console.log("data error");
			}
		});
	});
})
	
</script>
</html>