<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta name="_csrf" content="${_csrf.token}"/>
<!-- default header name is X-CSRF-TOKEN -->
<meta name="_csrf_header" content="${_csrf.headerName}"/>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<meta charset="ISO-8859-1">
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/assets/img/favicon.png" />
<title>Product</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath}/resources/assets/css/dashboard.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css"/>
<link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/assets/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet">
<style>
		input.parsley-error
		{
		  color: #B94A48 !important;
		  background-color: #F2DEDE !important;
		  border: 1px solid #EED3D7 !important;
		}
		
	</style>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
		<!-- DASHBOARD -->
			<nav class="col-md-2 d-none d-md-block bg-primary sidebar">
				<div class="sidebar-sticky">
					<ul class="nav flex-column">
						<li class="nav-item"><a class="nav-link text-white" href="#">
								 Dashboard	
						</a></li>
						<li class="nav-item"><a class="nav-link text-white" href="#"> Master
						</a></li>
						<li class="nav-item"><a class="nav-link bg-danger text-white" href="http://localhost:8433/maven-project/product">
								Products
						</a></li>
						<li class="nav-item"><a class="nav-link text-white" href="http://localhost:8433/maven-project/design"> Transaction	
						</a></li>
						<li class="nav-item"><a class="nav-link text-white" href="${logoutUrl}" > Logout	
						</a></li>
					</ul>
					</div>
			</nav><!-- END DASHBOARD -->
			<div role="main" class="col-md-8 ml-sm-auto col-lg-10">
				<div class="card text-white bg-primary mb-3">
					<div class="card-header">Product</div>
				</div>
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item"><a href="#">Master</a></li>
						<li class="breadcrumb-item active" aria-current="page">Product</li>
					</ol>
				</nav>
				<table id="inputTable">
				<thead>
					<tr>
						<th colspan="6"><p id="notif" style="width: 70%;display:none" class="text-white bg-info border rounded form-control"></p></th>
						<th><button class="btn btn-primary" id="addBtn" type="submit" style="width:100px;">Add</button></th>
					</tr>
					<tr>
						<th></th>
						<th><input type="text" class="form-control" placeholder="Product Code" id="data1" data-index="1" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control" placeholder="Product Name" id="data2" data-index="2" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control"	placeholder="Description" id="data3" data-index="3" style="padding-right:10px;"></th>
						<th><input type="text" class="form-control" placeholder="Created By" id="data4" data-index="4" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control" placeholder="Created Date" id="data5" data-index="5" style="padding-right: 10px;"></th>
						<th><a class="btn btn-danger" id="searchBtn" href="#" style="width:100px;">Search</a>
						<a class="btn btn-danger" id="resetBtn" href="#" style="width:100px;display:none">Reset</a></th>
					</tr>
				</thead>
				</table>
				<table id="productTable" class="table DataTable">
				<thead class="thead-light">
					<tr>
						<th>No.</th>
						<th>Product Code</th>
						<th>Product Name</th>
						<th>Description</th>
						<th>Created By</th>
						<th>Created Date</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
			</div>
		</div>
	<%@include file="/WEB-INF/pages/modal/add-product.html"%>
	<%@include file="/WEB-INF/pages/modal/delete-product.html"%>
    <%@include file="/WEB-INF/pages/modal/view-product.html"%>
    <%@include file="/WEB-INF/pages/modal/update-product.html"%>
	</div>
	
</body>
<!--   Core JS Files   -->
<script src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<!--  Charts Plugin -->
<script src="${pageContext.request.contextPath}/resources/assets/js/chartist.min.js"></script>
<!--  Dynamic Elements plugin -->
<script src="${pageContext.request.contextPath}/resources/assets/js/arrive.min.js"></script>
<!--  PerfectScrollbar Library -->
<script src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js" type="text/javascript"></script>
<!--  Notifications Plugin    -->
<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
<!-- Material Dashboard javascript methods -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	//datepicker
	$('#data5').datepicker({
		format:'yyyy-mm-dd',
		autoclose:true,
		uiLibrary: 'bootstrap4'
	});
	//addvalidate
     Parsley.addValidator('namecheck',{
    	validateString: function(value){
    	var namesplitcek = value.split(" ");
    	splitcek = namesplitcek[0];
    	 xhr= $.ajax({
    			url : '${pageContext.request.contextPath}/product/getbyname/'+splitcek,
    			dataType : 'json',
    			type : 'GET'
    		});
    	 return xhr.then(function(data){
    		 if($('#nameUpdate').val()==$('#nameUpdateCheck').val()){
    			 $('#nameUpdateCheck').val(0)
    		 	 return true
    	   	 }else if(data.length==0){
    			 return true 
    		 }else{
    			 return $.Deferred().reject()
    		 }
    	 });
    	}
    	});
    
	//load
	loadData();
	//search
	oTable = $('#productTable').DataTable({
		'sDom':'tip',
		'ordering':false
	});
	$('#searchBtn').on( 'click', function () {
		for(var i = 1 ; i <= 5; i++){
			oTable
            .column( $('#data'+ i).data('index') )
            .search( $('#data'+ i).val() )
            .draw();
			$('#data'+i).val("");
		}
		$('#searchBtn').hide();
		$('#resetBtn').show();
    });
	$('#resetBtn').on( 'click', function () {
		for(var i = 1 ; i <= 5; i++){
			oTable
            .column( $('#data'+ i).data('index') )
            .search( $('#data'+ i).val() )
            .draw();
			$('#data'+i).val("");
		}
		$('#resetBtn').hide();
		$('#searchBtn').show();
    });
	//view
	$(document).on('click','.btn-view-product',function(){
								var id = $(this).attr('id');
								$.ajax({
									url : '${pageContext.request.contextPath}/product/getbyid/'+id,
									type : 'GET',
									success : function(data) {
										$('#codeView').val(data.code);
										$('#nameView').val(data.name);
										$('#descView').val(data.description);
									},
									dataType : 'json'
								});
								$('#viewProductModal').modal();
							});
	//update
	$(document).on('click','.btn-update-product',function(){
								var id = $(this).attr('id');
								$.ajax({
									url :'${pageContext.request.contextPath}/product/getbyid/'+id,
									type:'GET',
									success: function(data){
										$('#idUpdate').val(data.id);
										$('#codeUpdate').val(data.code);
										$('#nameUpdate').val(data.name);
										$('#nameUpdateCheck').val(data.name);
										$('#descUpdate').val(data.description);
										$('#crUpdate').val(data.createdBy);
										$('#dateUpdate').val(data.createdDate);
									},
									dataType:'json'
								});
								$('#updateForm').parsley().reset();
								$('#updateProductModal').modal();
	});
	$('#updateBtnModal').click(function(){
		var validate = $('#updateForm').parsley();
    	validate.validate()
	});
	$('#updateForm').parsley().on('form:success',function(){
		var product ={
				id:parseInt($('#idUpdate').val()),
				code:$('#codeUpdate').val(),
				name:$('#nameUpdate').val(),
				description:$('#descUpdate').val(),
				'delete' : false,
				createdBy:$('#crUpdate').val(),
				createdDate:$('#dateUpdate').val()
		}
		$.ajax({
			url :'${pageContext.request.contextPath}/product/update',
			type:'POST',
			contentType:'application/json',
			data:JSON.stringify(product),
			success:function(data){
				loadData();
				$('#updateProductModal').modal('hide');
				
			},
			error : function(){
				console.log("data error");
			}
		});
		document.getElementById("notif").innerHTML = "Data dengan kode "+ product.code +" telah diupdate";
		$('#notif').show('slow').delay(2000).hide('slow');
	});
	//delete product
	$(document).on('click','.btn-delete-product',function(){
								var id = $(this).attr('id');
								$.ajax({
									url : '${pageContext.request.contextPath}/product/getbyid/'+id,
									type : 'GET',
									success : function(data) {
										$('#idDelete').val(data.id);
										$('#codeDelete').val(data.code);
										$('#nameDelete').val(data.name);
										$('#descDelete').val(data.description);
										$('#isDelete').val(data.isDelete);
										$('#crDelete').val(data.createdBy);
										$('#dateDelete').val(data.createdDate);
									},
									dataType : 'json'
								});
								$('#deleteProductModal').modal();
							});
	$('#btnDeleteModal').click(function(){
		var product ={
				id:parseInt($('#idDelete').val()),
				code:$('#codeDelete').val(),
				name:$('#nameDelete').val(),
				description:$('#descDelete').val(),
				'delete' : true,
				createdBy:$('#crDelete').val(),
				createdDate:$('#dateDelete').val()
		}
		$.ajax({
			url : '${pageContext.request.contextPath}/product/delete',
			type : 'POST',
			contentType : 'application/json',
			data : JSON.stringify(product),
			success : function(data){
				console.log("data di delete");

				loadData();
				$('#deleteProductModal').modal('hide');
			},
			error : function(){
				console.log("data error");
			}
		});
		document.getElementById("notif").innerHTML = "Data dengan kode "+ product.code +" telah dihapus";
		$('#notif').show('slow').delay(2000).hide('slow');
	});
	//get code send to modal
	$(document).on('click','#addBtn',function(){
		 $.ajax({
			 url : '${pageContext.request.contextPath}/product/getcode',
			 type: 'GET',
			 success : function(data){
				 $('#productcode').val(data);
			 },
			 dataType: 'json'
		 })
		 $('#addForm').parsley().reset();
		 $('#productname').val("");
	     $('#description').val("");
	  	 $('#nameUpdateCheck').val(0);
		 $('#addProductModal').modal();
	 });
	//add product
 	 $('#addBtnModal').on('click', function(ev){	
 		validate = $('#addForm').parsley();
 		validate.validate();
 	});
 	//validasi
 	$('#addForm').parsley().on('form:success', function() {
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
 				loadData();
 				$('#addProductModal').modal('hide');
 			},
 			error : function(){
 				console.log("data error");
 			}
 		});	
 		document.getElementById("notif").innerHTML = "Data dengan kode "+ product.code +" telah ditambah";
		$('#notif').show('slow').delay(2000).hide('slow');
 	});
	//Load Data
	function loadData(){
		$.ajax({
			url : '${pageContext.request.contextPath}/product/getall',
			type : 'GET',
			success : function(data){
				console.log(data);
				convertToTable(data);
				
			},
			error : function(){
				console.log("data error");
			},
			dataType : 'json'
		});
	}
	//convert to table
	function convertToTable(data){
		    oTable = $('#productTable').DataTable();
// 		var tBody = oTable.find('tBody');
// 		tBody.find('tr').remove();
		oTable.rows( 'tr' ).remove();
		$.each(data,function(index,product){	
			index++;
			var tRow ='<a id="'+product.id+'" href="#" class="btn-update-product"><span class="oi oi-pencil"></span></a>';
			tRow +=' ';
			tRow +='<a id="'+product.id+'" href="#" class="btn-view-product"><span class="oi oi-magnifying-glass"></span></a>';
			tRow +=' ';
			tRow +='<a id="'+product.id+'" href="#" class="btn-delete-product"><span class="oi oi-trash"></span></a>';
			oTable.row.add([index,product.code,product.name,product.description,product.createdBy,product.createdDate,tRow]);
		});
		oTable.draw();
	}
})
	
</script>
</html>