<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SOUVENIR REQUEST</title>
</head>
<!-- css bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!-- css resource icon -->
<link href="${pageContext.request.contextPath}/resources/assets/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet">
<!-- css datepicker -->
<%-- <link href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css" rel="stylesheet" /> --%>
<!-- css data table -->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css"/>
<link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css" rel="stylesheet" type="text/css" />

<!-- parsley style -->
<style>
	input.parsley-error
	{
		color : #B94A48 !important;
		background-color : #F2DEDE !important;
		border : 1px solid #EED3D7 !important;
	}

</style>
<body>
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
						<li class="nav-item"><a class="nav-link bg-warning text-white" href="#">
								Souvenir
						</a></li>
						<li class="nav-item"><a class="nav-link text-white" href="#"> Transaction	
						</a></li>
						<li class="nav-item"><a class="nav-link text-white" href="${logoutUrl}" > Logout	
						</a></li>
					</ul>
					</div>
			</nav><!-- END DASHBOARD -->
			
			<div role="main" class="col-md-8 ml-sm-auto col-lg-10">
				<div class="card text-white bg-primary mb-3">
					<div class="card-header">List Souvenir Request</div>
				</div>
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item"><a href="#">Master</a></li>
						<li class="breadcrumb-item active" aria-current="page">List Souvenir Request</li>
					</ol>
				</nav>
				<table id="inputTable">
				<thead>
					<tr>
						<th colspan="8"><p id="notif" style="width: 70%;display:none; padding-bottom: 10px; margin-bottom: 5px;" class="text-white bg-info border rounded form-control"></p></th>
						<th><button class="btn btn-primary" id="addBtn" type="submit" style="width:100px; padding-bottom: 10px; margin-bottom: 5px;">Add</button></th>
					</tr>
					<tr>
						<th></th>
						<th><input type="text" class="form-control" placeholder="Transaction Code" id="data1" data-index="1" style="padding-right:10px; width:100%;"></th>
						<th><input type="text" class="form-control" placeholder="Request By" id="data2" data-index="2" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control"	placeholder="Request Date" id="data3" data-index="3" style="padding-right:10px;"></th>
						<th><input type="text" class="form-control"	placeholder="Due Date" id="data4" data-index="4" style="padding-right:10px;"></th>
						<th><input type="text" class="form-control" placeholder="Status" id="data5" data-index="5" style="padding-right:10px;width:100%;">
						</th>
						<th><input type="text" class="form-control" placeholder="Created Date" id="data6" data-index="6" style="padding-right:10px;"></th>
						<th><input type="text" class="form-control" placeholder="Created By" id="data7" data-index="7" style="padding-right: 10px;"></th>
						
						<th><a class="btn btn-warning" id="searchBtn" href="#" style="width:100px;">Search</a></th>
					</tr>
				</thead>
				</table>
				<table id="listTransTable" class="table DataTable ">
				<thead class="thead-light">
					<tr>
						<th>No.</th>
						<th>Transaction Code</th>
						<th>Request By</th>
						<th>Request Date</th>
						<th>Due Date</th>
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
	
	
		
</body>

<!-- jquery link -->
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<!--  PerfectScrollbar Library -->
<script src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<%-- <script src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
<script src="https://cdnjs.cloudfare.com/ajax/libs/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script> --%>
<!--  Notifications Plugin    -->
<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
<!-- Material Dashboard javascript methods -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js" type="text/javascript"></script>

<!-- INCLUDE FILE -->
<%@include file="/WEB-INF/pages/modal/modal_transaksi_souvenir_request.jsp" %>

<!-- CODE JAVA SCRIPT START HERE -->
<script type="text/javascript">

$(document).ready(function(){
	/* DATE PICKER */
	loadData();
	//due date
	$('#data4').datepicker({
		format : 'yyyy-mm-dd',
		autoclose : true,
		uiLibrary : 'bootstrap4'
	});
	//request date
	$('#data3').datepicker({
		format : 'yyyy-mm-dd',
		autoclose : true,
		uiLibrary : 'bootstrap4'
	});
	//created date
	$('#data6').datepicker({
		format : 'yyyy-mm-dd',
		autoclose : true,
		uiLibrary : 'bootstrap4'
	});
	//load data list souvenir request
	function loadData(){
		$.ajax({
			url : '${pageContext.request.contextPath}/souvenirrequest/getall',
			type : 'GET',
			dataType : 'json',
			success :function(data){
				console.log(data);
				convertToTable(data);
			}
		});
	};
		//convert to table list request
		function convertToTable(data){
			oTable = $('#listTransTable').DataTable();
			oTable.rows( 'tr' ).remove();
			$.each(data,function(increment,transaksiSouvenir){
				increment++;
				var tRow='<a id="'+transaksiSouvenir.id+'" href="#" class="btn-view-transaksiR"><span class="oi oi-magnifying-glass"></span></a>';
				tRow +='';
				tRow +='<a id="'+transaksiSouvenir.id+'" href="#" class="btn-edit-transaksiR"><span class="oi oi-pencil"></span></a>';
				oTable.row.add([increment,transaksiSouvenir.code,transaksiSouvenir.requestBy,transaksiSouvenir.requestDate,transaksiSouvenir.requestDueDate,transaksiSouvenir.status,transaksiSouvenir.createdDate,transaksiSouvenir.createdBy,tRow]);
			});
			oTable.draw();
		};
		
	/* BUTTON POP UP ADD */
	var Id = 1; //digunakan untuk menentukan id pada saat additem modal
	var index=0;
	$(document).on('click', '#addBtn', function(){
		//get code
		$.ajax({
			url : '${pageContext.request.contextPath}/transaksisouvenir/getcode',
			type : 'GET',
			success : function(data){
				$('#transactionCode').val(data);
			},
			dataType : 'json'
		});	
		//get date
		var now = new Date();
		var tahun = now.getFullYear();
		var bulan = now.getMonth();
		var tanggal = now.getDate();
		var formatTanggal = ("0"+tanggal).slice(-2);
		$('#requestDate').val(tahun+'-'+bulan+'-'+formatTanggal);
		//date picker due date
		$('#requestDueDate').datepicker({
				format:'yyyy-mm-dd',
				autoclose:true,
				uiLibrary: 'bootstrap4'
			});
		//get requested by
		
		$('#addTranSouReqModal').modal();
	});
	
	//add item modal
	$(document).on('click', '#btnAddItems', function(){
		Id++; //increment id add item modal
		index++;
		var oTable = $('#modalTableSouReqTrans');
		var tBody = oTable.find('tbody');
		var tRow = '<tr id="items'+Id+'">';
			tRow += '<td><select class="custom-select" id="souvenirItem'+Id+'" name="details['+index+'].mSouvenirId" style="width:150px">'+
					'<option value="" selected>Select Souvenir</option>'+
					'<c:forEach var="souvenir" items="${souvenirs}">'+
					'<option value="${souvenir.id}">${souvenir.name}</option>'+
					'</c:forEach>'+
					'</select></td>';
			tRow += '<td><input type="number" class="form-control" id="qty'+Id+'"  placeholder="Qty"></td>';
			tRow += '<td><input type="text" class="form-control" id="note'+Id+'" placeholder="Note"></td>';
			tRow += '<td><a id="'+Id+'" href="#" class="editBtnModalTransSR"><span class="oi oi-pencil"></span></a>'+' ';
			tRow +=	'<a id="'+Id+'" href="#" class="deleteBtnModalTransSR"><span class="oi oi-trash"></span></a></td>';
			tRow += '</tr>';
			tBody.append(tRow);
	});
	
	//remove added item
	$(document).on('click', '.deleteBtnModalTransSR', function(){
		var id = $(this).attr('id');
		$('#items'+id).remove();
		});	

	//buton save add
	$(document).on('click', '#saveAddBtnModal', function(e){
		var transaksiSouvenirItems =[];
		$('.tableBody tr').each(function(){
			tRow =$(this).find('td :input');
			var items = {
					masterSouvenir:{
						id:tRow.eq(0).val()
					},
					qty:tRow.eq(1).val(),
					note:tRow.eq(2).val()
				}
			transaksiSouvenirItems.push(items);
		});
		 //console.log(transaksiSouvenirItems);
		var transaksiSouvenir = {
				code :$('#transactionCode').val(),
				transaksiEvent :{
					id:parseInt($('#eventId').val())
				},
				//requestBy :$('#requestBy').val(),
				//requestDate :$('#requestDate').val(),
				requestDueDate:$('#requestDueDate').val(),
				note :$('#note').val(),
				transaksiSouvenirItems:transaksiSouvenirItems
		}
		
		//console.log(transaksiSouvenir);
		//console.log(JSON.stringify(transaksiSouvenir));
		$.ajax({
			url : '${pageContext.request.contextPath}/souvenirrequest/saveall',
			type : 'POST',
			contentType :'application/json',
			dataType : 'json',
			data:JSON.stringify(transaksiSouvenir),
			success:function(data){
				console.log(data);
				//$('#addTranSouReqModal').modal('hide');
			}
		});
		loadData();
		$('#addTranSouReqModal').modal('hide');
	});

	/* BUTTON EDIT */
	
}) /* batas akhir ready function */

</script> 

</html>