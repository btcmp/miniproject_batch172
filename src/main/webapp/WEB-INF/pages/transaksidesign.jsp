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
<title>Design</title>
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
		@media (min-width: 768px) {
  			.modal-xl {
   				 width: 95%;
  				 max-width:1800px;
  			}
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
						<li class="nav-item"><a class="nav-link text-white" href="http://localhost:8433/maven-project/product">
								Products
						</a></li>
						<li class="nav-item"><a class="nav-link bg-danger text-white" href="http://localhost:8433/maven-project/design"> Transaction	
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
						<li class="breadcrumb-item"><a href="#">Transaction</a></li>
						<li class="breadcrumb-item active" aria-current="page">Design</li>
					</ol>
				</nav>
				<table id="inputTable">
				<thead>
					<tr>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th><button class="btn btn-primary" id="addBtn" type="submit" style="width:100px;">Add</button></th>
					</tr>
					<tr>
						<th></th>
						<th><input type="text" class="form-control" placeholder="Transaction Code" id="data1" data-index="1" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control" placeholder="Request By" id="data2" data-index="2" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control"	placeholder="Request Date" id="data3" data-index="3" style="padding-right:10px;"></th>
						<th><input type="text" class="form-control" placeholder="-Assign To-" id="data4" data-index="4" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control" placeholder="Status" id="data5" data-index="5" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control" placeholder="Created" id="data6" data-index="6" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control" placeholder="Created By" id="data7" data-index="7" style="padding-right:10px;width:100%;"></th>
						<th><a class="btn btn-danger" id="searchBtn" href="#" style="width:100px;">Search</a></th>
					</tr>
				</thead>
				</table>
				<table id="designTable" class="table DataTable">
				<thead class="thead-light">
					<tr>
						<th>No.</th>
						<th>Transaction Code</th>
						<th>Request By</th>
						<th>Request Date</th>
						<th>Assign To</th>
						<th>Status</th>
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
	</div>
	<%@include file="/WEB-INF/pages/modal/add-transaksidesign.jsp" %>
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
	$('#designTable').DataTable({
		'sDom':'tip',
		'ordering':false
	});
	$('#duedate1').datepicker({
		format:'yyyy-mm-dd',
		autoclose:true,
		uiLibrary: 'bootstrap4'
	});
	$('#startdate1').datepicker({
		format:'yyyy-mm-dd',
		autoclose:true,
		uiLibrary: 'bootstrap4'
	});
	$('#enddate1').datepicker({
		format:'yyyy-mm-dd',
		autoclose:true,
		uiLibrary: 'bootstrap4'
	});
	var Id = 1;
	var index = 0;
	loadData();
	$(document).on('click','#addBtn',function(){
		$.ajax({
			url : '${pageContext.request.contextPath}/design/getcode',
			type : 'GET',
			dataType : 'json',
			success : function(data){
				$('#transactionCode').val(data);
			}
		});
		$.ajax({
			url : '${pageContext.request.contextPath}/design/getrequestby',
			type : 'GET',
			dataType : 'json',
			success : function(data){
				$('#requestBy').val(data);
			}
		})
		var now = new Date();
		var tahun = now.getFullYear();
		var bulan = now.getMonth();
		var tanggal = now.getDate();
		var formatTanggal = ("0"+tanggal).slice(-2);
		$('#requestDate').val(tahun+'-'+bulan+'-'+formatTanggal);
		$('#addDesignTransactionModal').modal();
	});	
	$('#addItemBtn').on('click',function(){
		    Id++;
		    index++;
		  	var oTable = $('#itemsTable');
		    var tBody = oTable.find('tbody');
		    var tRow =	'<tr id="items-'+Id+'">';
			tRow += '<td><select class="custom-select" id="productItem'+Id+'" name="details['+index+'].mProductId" style="width:150px">'+
							'<option value="" selected>Choose...</option>'+
								'<c:forEach var="product" items="${products}">'+
								'<option value="${product.id}">${product.name}</option>'+
							'</c:forEach>'+
						'</select></td>';
			tRow += '<td><input type="text" class="form-control description" id="description'+Id+'" placeholder="description" readonly></td>';
			tRow += '<td><input type="text" class="form-control" placeholder="Title"></td>';
			tRow += '<td><input type="text" class="form-control" placeholder="Request PIC"></td>';
			tRow += '<td><input type="text" class="form-control" id="duedate'+Id+'" placeholder="Due Date"></td>';
			tRow += '<td><input type="text" class="form-control" id="startdate'+Id+'" placeholder="Start Date" disabled></td>';
			tRow += '<td><input type="text" class="form-control" id="enddate'+Id+'" placeholder="End Date" disabled></td>';
			tRow += '<td><input type="text" class="form-control" name="details['+index+'].note" placeholder="Note"></td>';
			tRow += '<td><a id="'+Id+'" href="#" class="btn-update-design"><span class="oi oi-pencil"></span></a>';
			tRow += '<a id="'+Id+'" href="#" class="btn-delete-design"><span class="oi oi-trash"></span></a></td>';
			tRow +=	'</tr>';
			tBody.append(tRow);
			$('#duedate'+Id).datepicker({
				format:'yyyy-mm-dd',
				autoclose:true,
				uiLibrary: 'bootstrap4'
			});
			$('#startdate'+Id).datepicker({
				format:'yyyy-mm-dd',
				autoclose:true,
				uiLibrary: 'bootstrap4'
			});
			$('#enddate'+Id).datepicker({
				format:'yyyy-mm-dd',
				autoclose:true,
				uiLibrary: 'bootstrap4'
			});
			$('#productItem'+Id).on('change',function(){
				var select = this;
				var productId = select[select.selectedIndex].value;
				$.ajax({
					url : '${pageContext.request.contextPath}/product/getbyid/'+productId,
					type : 'GET',
					success : function(data){
						$('#description'+Id).val(data.description);
					}
				});
			});
	});
	$('#addBtnModal').on('click',function(e){
		var transaksiDesignItems=[];
		$('.tableBody tr').each(function(){
			tRow = $(this).find('td :input');
			var items = {
					masterProduct:{
						id:tRow.eq(0).val()
					},
					titleItem:tRow.eq(2).val(),
					requestPic:tRow.eq(3).val(),
					requestDueDate:tRow.eq(4).val(),
					note:tRow.eq(10).val()
			}
			transaksiDesignItems.push(items);
		});
		console.log(transaksiDesignItems);
		var transaksiDesign = {
				code :$('#transactionCode').val(),
				requestBy :$('#requestBy').val(),
				requestDate :$('#requestDate').val(),
				titleHeader :$('#titleHeader').val(),
				note :$('#note').val(),
				transaksiEvent :{
					id:$('#eventCode').val()
			    },
				transaksiDesignItems:transaksiDesignItems
		}
		$.ajax({
			url : '${pageContext.request.contextPath}/design/save',
			type : 'POST',
			contentType:'application/json',
			dataType:'json',
			data:JSON.stringify(transaksiDesign),
			success:function(data){
				loadData();
				$('#addDesignTransactionModal').modal('hide');
			}
		});	
	});

	$(document).on('click','.btn-delete-design',function(){
		var id = $(this).attr('id');
		$('#items-'+id).remove();
	});
	$('#productItem1').on('change',function(){
		var select = this;
		var productId = select[select.selectedIndex].value;
		$.ajax({
			url : '${pageContext.request.contextPath}/product/getbyid/'+productId,
			type : 'GET',
			success : function(data){
				$('#description1').val(data.description);
			}
		});
	});
	function loadData(){
		$.ajax({
			url : '${pageContext.request.contextPath}/design/getall',
			type : 'GET',
			dataType : 'json',
			success : function(data){
				console.log(data);
				convertToTable(data);
			}
		});
	}
	function convertToTable(data){
		oTable = $('#designTable').DataTable();
		oTable.rows( 'tr' ).remove();
		$.each(data,function(increment,design){
			increment++;
			var tRow ='<a id="'+design.id+'" href="#" class="btn-view-product"><span class="oi oi-magnifying-glass"></span></a>';	
			tRow +=' ';
			tRow +='<a id="'+design.id+'" href="#" class="btn-update-product"><span class="oi oi-pencil"></span></a>';
			oTable.row.add([increment,design.code,design.requestBy,design.requestDate,design.assignTo,design.status,design.createdDate,design.createdBy,tRow]);
		});
		oTable.draw();
	}
});

</script>
</html>