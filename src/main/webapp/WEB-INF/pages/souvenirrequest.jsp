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
			<div class="form-row" style="float:left; padding:10px;">
				<a id="notification" class="text-white bg-info border rounded"></a>
			</div>	
			</div>
		</div>
	</div>
	


<!-- INCLUDE FILE -->
<%@include file="/WEB-INF/pages/modal/modal_transaksi_souvenir_request.jsp" %>
<%@include file="/WEB-INF/pages/modal/modal-approvedsr.jsp" %>

		
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
		//$('#requestBy').val(userlogin.employee.name);
		$('#addTranSouReqModal').modal();
	});
	
	//add item modal
	$(document).on('click', '#btnAddItems', function(){
		Id++; //increment id add item modal
		index++;
		var oTable = $('#modalTableSouReqTrans');
		var tBody = oTable.find('tbody');
		var tRow = '<tr id="items'+Id+'">';
			tRow += '<td><select class="custom-select" id="souvenirItem'+Id+'" name="details['+index+'].mSouvenirId" style="width:150px" disabled>'+
					'<option value="" selected>Select Souvenir</option>'+
					'<c:forEach var="souvenir" items="${souvenirs}">'+
					'<option value="${souvenir.id}">${souvenir.name}</option>'+
					'</c:forEach>'+
					'</select></td>';
			tRow += '<td><input type="number" class="form-control" id="qty'+Id+'"  placeholder="Qty" disabled></td>';
			tRow += '<td><input type="text" class="form-control" id="note'+Id+'" placeholder="Note" disabled></td>';
			tRow += '<td><a id="'+Id+'" href="#" class="editBtnModalTransSR"><span class="oi oi-pencil"></span></a>'+' ';
			tRow +=	'<a id="'+Id+'" href="#" class="deleteBtnModalTransSR"><span class="oi oi-trash"></span></a></td>';
			tRow += '</tr>';
			tBody.append(tRow);
	});
	//icon edit item
	$(document).on('click','.editBtnModalTransSR',function(){
		var id =$(this).attr('id');
		$("#items"+id).find(':input').prop('disabled', false);
	});
	//icon remove added item
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
				tEventId :{
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
				loadData();
				//$('#addTranSouReqModal').modal('hide');
			}
		});
		
		$('#addTranSouReqModal').modal('hide');
		document.getElementById("notification").innerHTML = "Data Saved! Transaction Souvenir request has been added with code: "+transaksiSouvenir.code+"!";
		$('#notification').show('slow').delay(1500).hide('slow');
	});
	
	/* BUTTON SEARCH */
	$('#btn-search').on('click', function(){
		for(var i = 1; i <= 7; i++){
			oTable
			.column($('#data'+i).data('index'))
			.search($('#data'+i).val())
			.draw()
		}
	});

	/* ICON EDIT TRANSAKSI SOUVENIR*/
	$(document).on('click', '.btn-edit-transaksiR', function(){
		var id =$(this).attr('id');
		$.ajax({
			url : '${pageContext.request.contextPath}/souvenirrequest/getitemsbyid/'+id,
			type : 'GET',
			dataType : 'json',
			success : function(data){
				console.log(data);
				var keys=Object.keys(data);
				Id=keys.length;
				$('#editTransactionCode').val(data[0].transaksiSouvenir.code);
				$('#editEventCode').val(data[0].transaksiSouvenir.tEventId.code);
				//$('#editEventId').val(data[0].transaksiSouvenir.tEventId.id);
				$('#editRequestBy').val(data[0].transaksiSouvenir.requestBy.employeeName);
				$('#editRequestDate').val(data[0].transaksiSouvenir.requestDate);
				$('#editDueDate').val(data[0].transaksiSouvenir.requestDueDate);
				$('#editNote').val(data[0].transaksiSouvenir.note);
				$('#editStatus').val(data[0].transaksiSouvenir.status);
				
				$('#editTransaksiId').val(data[0].transaksiSouvenir.id);
				$('.tableBodyEdit').empty();
				viewOldItems(Id,data);
			}
		});
		//created date
		$('#editDueDate').datepicker({
			format : 'yyyy-mm-dd',
			autoclose : true,
			uiLibrary : 'bootstrap4'
		});
		$('#editTranSouReqModal').modal();
		//index = 0;
	});
	/* fungsi menampilkan iten lama editItems */
	function viewOldItems(banyak,data){
		index2=0;
		for (var i=1; i<=banyak; i++){
			//console.log(data[i].id);
			var oTable = $('#modalTableEditItems');
			var tBody = oTable.find('tbody');
			var tRow = '<tr id="itemsEdit-'+i+'">';
			tRow += '<td><select class="custom-select" id="souvenirItem'+i+'" style="width:150px" disabled>'+
					'<option value="'+data[index2].masterSouvenir.id+'" selected>'+data[index2].masterSouvenir.name+'</option>'+
					'<c:forEach var="souvenir" items="${souvenirs}">'+
					'<option value="${souvenir.id}">${souvenir.name}</option>'+
					'</c:forEach>'+
					'</select></td>';
			tRow += '<td><input type="number" class="form-control" id="qty'+i+'"  value="'+-data[index2].qty+'" placeholder="Qty" disabled></td>';
			tRow += '<td><input type="text" class="form-control" id="note'+i+'" value="'+data[index2].note+'" placeholder="Note" disabled></td>';
			tRow += '<td><input type="hidden" class="form-control" id="itemIdEdit'+i+'" value="'+data[index2].id+'" ></td>';
			tRow += '<td><input type="hidden" class="form-control" id="itemDeleteEdit'+i+'" value=false ></td>';
			tRow += '<td><a id="'+i+'" href="#" class="editBtnModalEdit"><span class="oi oi-pencil"></span></a>'+' ';
			tRow +=	'<a id="'+i+'" href="#" class="deleteBtnModalEdit"><span class="oi oi-trash"></span></a></td>';
			tRow += '</tr>';
			index2++;
			tBody.append(tRow);
		}
	};
	//add items button
	 $('#btnAddItemEdit').on('click',function(){
		 Id++;
		 index++;
		 //console.log(Id);
		 var oTable = $('#modalTableEditItems');
			var tBody = oTable.find('tbody');
			var tRow ='<tr id="itemsEdit-'+Id+'">';
			tRow += '<td><select class="custom-select" id="souvenirItem'+Id+'" style="width:150px" disabled>'+
					'<option value="" selected>Select Souvenir</option>'+
					'<c:forEach var="souvenir" items="${souvenirs}">'+
					'<option value="${souvenir.id}">${souvenir.name}</option>'+
					'</c:forEach>'+
					'</select></td>';
			tRow += '<td><input type="number" class="form-control" id="qty'+Id+'" placeholder="Qty" disabled></td>';
			tRow += '<td><input type="text" class="form-control" id="note'+Id+'" placeholder="Note" disabled></td>';
			tRow += '<td><input type="hidden" class="form-control" id="itemIdEdit'+Id+'" value="999999" ></td>';
			tRow += '<td><input type="hidden" class="form-control" id="itemDeleteEdit'+Id+'" value=false ></td>';
			tRow += '<td><a id="'+Id+'" href="#" class="editBtnModalEdit"><span class="oi oi-pencil"></span></a>'+' ';
			tRow +=	'<a id="'+Id+'" href="#" class="deleteBtnModalEdit"><span class="oi oi-trash"></span></a></td>';
			tRow += '</tr>';
			tBody.append(tRow);
	 });
	//icon edit items
	$(document).on('click','.editBtnModalEdit',function(){
			var id =$(this).attr('id');
			$("#itemsEdit-"+id).find(':input').prop('disabled', false);
		});
	//icon delete items
	$(document).on('click','.deleteBtnModalEdit',function(){
			var id =$(this).attr('id');
			$("#itemDeleteEdit"+id).val(true);
			$('#items-edit-'+id).remove();
		});
	//button SAVE UPDATE
	$(document).on('click', '#saveUpdateBtnModal', function(e){
		var transaksiSouvenirItems =[];
		$('.tableBodyEdit tr').each(function(){
			tRow =$(this).find('td :input');
			var items = {
					masterSouvenir:{
						id:parseInt(tRow.eq(0).val())
					},
					qty:parseInt(tRow.eq(1).val()),
					note:tRow.eq(2).val(),
					id:parseInt(tRow.eq(3).val()),
					'delete':tRow.eq(4).val()
				}
			transaksiSouvenirItems.push(items);
		});
		 //console.log(transaksiSouvenirItems);
		var transaksiSouvenir = {
				//code :$('#editTransactionCode').val(),
				/* tEventId :{
					id:parseInt($('#editEventId').val())
				}, */
				//requestBy :$('#requestBy').val(),
				//requestDate :$('#editRequestDate').val(),
				requestDueDate:$('#editDueDate').val(),
				note :$('#editNote').val(),
				transaksiSouvenirItems:transaksiSouvenirItems
		}
		
		var idTras = parseInt($('#editTransaksiId').val());
		console.log(idTras);
		console.log(transaksiSouvenir);
		console.log(JSON.stringify(transaksiSouvenir));
		$.ajax({
			url : '${pageContext.request.contextPath}/souvenirrequest/update/'+idTras,
			type : 'POST',
			contentType :'application/json',
			dataType : 'json',
			data:JSON.stringify(transaksiSouvenir),
			success:function(data){
				console.log(data);
				loadData();
				//$('#addTranSouReqModal').modal('hide');
			}
		});
		
		$('#addTranSouReqModal').modal('hide');
		document.getElementById("notification").innerHTML = "Data Updated! Transaction Souvenir request  with code: "+transaksiSouvenir.code+" has been added!";
		$('#notification').fadeIn(3000).delay(1500).fadeOut(3000);
	});
	
	/* //load data list souvenir request */
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
				var status="";
				if(transaksiSouvenir.status==1){
					status="Submitted";
				} else if(transaksiSouvenir.status==2){
					status="In Progress";
				} else if(transaksiSouvenir.status==3){
					status="Approved";
				}
					
				var tRow='<a id="'+transaksiSouvenir.id+'" href="#" class="btn-view-transaksiR"><span class="oi oi-magnifying-glass"></span></a>';
				tRow +='';
				tRow +='<a id="'+transaksiSouvenir.id+'" href="#" class="btn-edit-transaksiR"><span class="oi oi-pencil"></span></a>';
				oTable.row.add([increment,transaksiSouvenir.code,transaksiSouvenir.requestBy.employeeName,transaksiSouvenir.requestDate,transaksiSouvenir.requestDueDate,status,transaksiSouvenir.createdDate,transaksiSouvenir.createdBy.employeeName,tRow]);
			});
			oTable.draw();
		};
		
		/* Button Pop Up Approvel (REZA)*/
		$(document).on('click', '.btn-view-transaksiR', function(){
			$('#approveTranSouReqModal').modal();
		});
		
		
		
}) /* batas akhir ready function */

</script> 

</html>