<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>***TRANSAKSI SOUVNEIR***</title>
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
<!-- link css dashboard -->
<link href="${pageContext.request.contextPath}/resources/assets/css/dashboard.css" rel="stylesheet" />

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
					<div class="card-header">List Souvenir Stock</div>
				</div>
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item"><a href="#">Master</a></li>
						<li class="breadcrumb-item active" aria-current="page">List Souvenir Stock</li>
					</ol>
				</nav>
				<table id="inputTable">
				<thead>
					<tr>
						<th colspan="6"><p id="notif" style="width: 70%;display:none; padding-bottom: 10px; margin-bottom: 5px;" class="text-white bg-info border rounded form-control"></p></th>
						<th><button class="btn btn-primary" id="addBtn" type="submit" style="width:100px; padding-bottom: 10px; margin-bottom: 5px;">Add</button></th>
					</tr>
					<tr>
						<th></th>
						<th><input type="text" class="form-control" placeholder="Transaction Code" id="data1" data-index="1"></th>
						<th><input type="text" class="form-control" placeholder="Received By" id="data2" data-index="2"></th>
						<th><input type="text" class="form-control"	placeholder="Received Date" id="data3" data-index="3" ></th>
						<th><input type="text" class="form-control" placeholder="Created " id="data4" data-index="4"></th>
						<th><input type="text" class="form-control" placeholder="Created By" id="data5" data-index="5"></th>
						<th><a class="btn btn-warning" id="searchBtn" href="#" style="width:100px;">Search</a></th>
					</tr>
				</thead>
				</table>
				<table id="transSouTable" class="table DataTable mt-1">
				<thead class="thead-light">
					<tr>
						<th>No.</th>
						<th>Transaction Code</th>
						<th>Received By</th>
						<th>Received Date</th>
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
<%@include file="/WEB-INF/pages/modal/modal_transaksi_souvenir.jsp" %>

<!-- CODE JAVA SCRIPT START HERE -->
<script type="text/javascript">

$(document).ready(function(){
	loadData();
	/* DATE PICKER */
	//created date
	$('#data4').datepicker({
		format : 'yyyy-mm-dd',
		autoclose : true,
		uiLibrary : 'bootstrap4'
	});
	//received date
	$('#data3').datepicker({
		format : 'yyyy-mm-dd',
		autoclose : true,
		uiLibrary : 'bootstrap4'
	});
	/* BUTTON POP UP ADD */
	var Id = 1; //digunakan untuk menentukan id pada saat additem modal
	var index = 0;
	$(document).on('click', '#addBtn', function(){
		//tulis disini fungsi get code
		$.ajax({
			url : '${pageContext.request.contextPath}/transaksisouvenir/getcode',
			type : 'GET',
			success : function(data){
				$('#transactionCode').val(data);
			},
			dataType : 'json'
		});
		 
		//get Employeee
		/* function loadAllEmployee(){
			$.ajax({
				url : '${pageContext.request.contextPath}/transaksisouvenir/getallemployee',
				type : 'GET',
				success : function(data){
					console.log(data)
					$.each(data, function(index, value){
						$('#receivedTransSBy').append('<option value="'+value.id+'">"'+value.employeeName+'"</option>')
					});
				},
				dataType : 'json'
			});	
		} */
		//datepicker
		$('#receivedTransSDate').datepicker({
			format : 'yyyy-mm-dd',
			autoclose : true,
			uiLibrary : 'bootstrap4'
		});
		
		$('#addTranSouModal').modal();
	});
	
	//add item button modal
	$(document).on('click', '#btnAddModalTransSou', function(){
		Id++; //increment id add item modal
		index++;
		var oTable = $('#modalTableSouTrans');
		var tBody = oTable.find('tbody');
		var tRow = '<tr id="items-'+Id+'">';
			tRow += '<td><select class="custom-select" id="souvenirItem'+Id+'" name="details['+index+'].mSouvenirId">'+
						'<option value=" " selected>-Select Souvenir-</option>'+
						'<c:forEach var="souvenir" items="${souvenirs}">'+
						'<option value="${souvenir.id}">${souvenir.name}</option>'+
						'</c:forEach>'+
					'</select></td>';
			tRow += '<td><input type="number" class="form-control" id="quantity'+Id+'" placeholder="Qty"></td>';
			tRow += '<td><input type="text" class="form-control" id="note'+Id+'" placeholder="Note"></td>';
			tRow += '<td><a id="'+Id+'" href="#" class="editBtnModalTransS"><span class="oi oi-pencil"></span></a>'+' ';
			tRow +=	'<a id="'+Id+'" href="#" class="deleteBtnModalTransS"><span class="oi oi-trash"></span></a></td>';
			tRow += '</tr>';
			tBody.append(tRow);
	});
	/* SAVE OR ADD DATA */
	$('#addBtnModal').on('click', function(e){
		var transaksiSouvenirItems=[];
		$('.tableBody tr').each(function(){
			tRow = $(this).find('td :input');
			var items = {
					masterSouvenir:{
						id:tRow.eq(0).val()
					},
					qty:tRow.eq(1).val(),
					note:tRow.eq(2).val()
					
			}
			transaksiSouvenirItems.push(items);
		});
		console.log(transaksiSouvenirItems);
		var transaksiSouvenir = {
				code : $('#transactionCode').val(),
				//receivedBy : $('#receivedTransSBy').val(),
				receivedDate : $('#receivedTransSDate').val(),
				note : $('#noteTransSou').val(),
				transaksiSouvenirItems:transaksiSouvenirItems
		}
		console.log(transaksiSouvenir);
		$.ajax({
			url : '${pageContext.request.contextPath}/transaksisouvenir/save',
			type : 'POST',
			contentType :'application/json',
			dataType : 'json',
			data : JSON.stringify(transaksiSouvenir),
			success : function(data){
				console.log(data);
				console.log("data berhasil disimpan...");
				//jangan lupa tambahin load data
				loadData();
				$('#addTranSouModal').modal('hide');
			}
		
		});
		
	});
	
	//remove added item
	$(document).on('click', '.deleteBtnModalTransS', function(){
		var id = $(this).attr('id');
		$('#items-'+id).remove();
		});	

	/* GET ALL STOCK DATA */
	function loadData(){
		$.ajax({
			url : '${pageContext.request.contextPath}/transaksisouvenir/getall',
			type : 'GET',
			dataType : 'json',
			success : function(data){
				console.log(data);
				convertToTable(data);
			},
			error : function(){
				console.log("tabel gagal dibuat");
			}
		});
	}
	function convertToTable(data){
		oTable = $('#transSouTable').DataTable();
		oTable.rows('tr').remove();
		$.each(data,function(increment,souvenir){
			increment++;
			var tRow = '<a id="'+souvenir.id+'" href="#" class="btn-view-souvenir"><span class="oi oi-magnifying-glass"></span></a>';
				tRow += ' ';
				tRow += '<a id="'+souvenir.id+'" href="#" class="btn-update-souvenir"><span class="oi oi-pencil"></span></a>';
			oTable.row.add([increment, souvenir.code, souvenir.receivedBy, souvenir.receivedDate, souvenir.createdDate, souvenir.createdBy.employeeName, tRow]);
		});
		oTable.draw();
	}
	
	/* VIEW  SOUVENIR STOCK*/
	
	$(document).on('click', '.btn-view-souvenir', function(){
		var id = $(this).attr('id');
		//var id2 = parseInt(id);
		console.log(id);
			$.ajax({
				url : '${pageContext.request.contextPath}/transaksisouvenir/getsouvenirbyid/'+id,
				type : 'GET',
				dataType : 'json',
				success : function(data){
					var keys=Object.keys(data);
					len=keys.length;
					
						//Data atas
						$('#viewTransCode').val(data[0].transaksiSouvenir.code);
						$('#viewReceivedTransSBy').val(data[0].transaksiSouvenir.receivedBy);
						$('#viewReceivedTransSDate').val(data[0].transaksiSouvenir.receivedDate);
						$('#viewNoteTransSou').val(data[0].transaksiSouvenir.note);
						
						$('.viewTableBody').empty();
						itemBawah(len,data);
					}
					
			});
	$('#viewTranSouModal').modal('show');
	});
	
	//fungsi edit items bawah 
	function itemBawah(banyak, data){
		idx = 0;
		for(var i=1; i<=banyak; i++){
			var oTable = $('#modalViewTableSouTrans');
			var tBody = oTable.find('tbody');
			var tRow = '<tr id="items-view-'+i+'"></tr>';
				tRow += '<td><input  class="form-control" id="viewSouItem'+i+'"  readonly value="'+data[idx].masterSouvenir.name+'"></td>';
				tRow += '<td><input  class="form-control" id="viewQtyItem'+i+'" readonly value="'+data[idx].qty+'"></td>';
				tRow += '<td><input  class="form-control" id="viewNoteItem'+i+'"  readonly value="'+data[idx].note+'"></td>';
				tRow += '</tr>';
		idx++;
		tBody.append(tRow);
		}
	};
	
	/* UPDATE */
	
}); /* batas akhir ready function */

</script>

</html>