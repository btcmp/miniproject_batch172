<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Menu Access</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css">
<link href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/assets/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet">
<link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<style>
input.parsley-error
		{
		  color: #ff99ff !important;
		  background-color: #F2DEDE !important;
		  border: 1px solid #EED3D7 !important;
		}
</style>
</head>
<body>
	<div id = "container" style="width : 1000px; margin: auto">
	
	<!-- HEADER -->
	<div class="card text-white bg-primary mb-3" style="width: 100%;">
  			<div class="card-header">List Menu Access</div>
		</div>
		<div class="row">
		<!-- NAV -->
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item">
		        <a class="nav-link" href="#">Home</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link disabled" href="#">/</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#">Master</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link disabled" href="#">/</a>
		      </li>
		      <li class="nav-item active">
		        <a class="nav-link" href="#">List Menu Access<span class="sr-only">(current)</span></a>
		      </li>
		    </ul>
		  </div>
		</nav>
		
		<!-- BUTTON ADD -->
		<table id="tableInput">
	<thead>
			<tr>
				<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
				<th><a class="btn btn-primary" id="btnadd" href="#">Add</a></th>
				</tr>
	<!-- BUTTON SEARCH -->
		<tr>
    			<th></th>
						<th><input type="text" class="form-control" placeholder="Select Role Code" id="data1" data-index="1" style="padding-right:10px;width:120%;"></th>
						<th><input type="text" class="form-control" placeholder="Select Role Name" id="data2" data-index="2" style="padding-right:10px;width:120%;"></th>
						<th><input type="text" class="form-control" placeholder="Created Date" id="data3" data-index="4" style="padding-right:10px;width:120%;"></th>
						<th><input type="text" class="form-control" placeholder="Created By" id="data4" data-index="5" style="padding-right:10px;width:120%;"></th>
    			<th><a class="btn btn-warning" id="btn-search" href="#">Search</a></th>
    			</tr>
    			</thead>
    			</table>
    			<!-- TABLE -->
    			<table class="table table-striped table-hover DataTable" id="menuTable" style="width : 125%">
			<thead>
				<tr>
					<th>No</th>
					<th>Role Code</th>
					<th>Role Name</th>
					<th>Created Date</th>
					<th>Created By</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
		</div>
	</div>
	<%@include file="/WEB-INF/pages/modal/add-menuaccess.jsp" %>
</body>

	<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
    
	
	<script type="text/javascript">
	
	$(document).ready(function(){
		$('#data3').datepicker();
		//loadData();
		
		/* BUTTON POP UP */
		$('#btnadd').on('click',function(){
			$.ajax({
				url:'${pagecontext.request.contextPath}/menu/getcode',
				type:'GET',
				success : function(data){
					$('#menucode').val(data);
				},
				dataType:'json'
			});
			$('#addModal').modal();
		});
	});
	
	</script>
</html>