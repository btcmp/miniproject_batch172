<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Event Request</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css"/>
<link href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/assets/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css" rel="stylesheet" type="text/css" />

<c:url value="/j_spring_security_logout" var="logoutUrl" />

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
	<div id="container">
		<!-- HEADER -->
		<div class="card text-white bg-primary mb-3" style="width: 100%">
  			<div class="card-header">List Event Request</div>
		</div>
		
		<!-- NAV -->
		<nav class="navbar navbar-expand-lg navbar-light bg-light" style="width: 100%">
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
		        <a class="nav-link" href="#">List Event Request <span class="sr-only">(current)</span></a>
		      </li>
		    </ul>
		  </div>
		</nav>
		

			<div class="form-row" style="padding-left:25px; padding-top:10px">
				<p id="user-login" id="username" class="text-primary">Selamat Datang User!</p>
				<form action="${logoutUrl}" method="post" id="logoutForm" style="width: 100%; padding: 5px">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					<input style="float: right; width: 100px;" class="btn btn-warning" type="submit" value="logout" />
				</form>
			</div>
		
		
		<!-- BUTTON ADD DAN NOTIFICATION -->
		<div class="form-row" style="float:right; padding:5px;">
			<a class="btn btn-primary" id="btn-add" href="#" style="width:100px;">Add</a>
		</div>
		<div class="form-row" style="float:left; padding:10px;">
			<a id="notification" class="text-white bg-info border rounded"></a>
			<a id="notification2" class="text-white bg-danger border rounded"></a>
		</div>
		
		<!-- FORM -->
		<form>
		  <div class="form-row" style="width: 100%; margin:auto;">
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Transaction Code" id="data1" data-index="1">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Request By" id="data2"data-index="2">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Request Date" id="data3"data-index="3">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Status" id="data4" data-index="4">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Created Date" id="data5" data-index="5">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Created By" id="data6" data-index="6">
		    </div>
		     <a class="btn btn-warning" id="btn-search" href="#" style="width:100px;">Search</a>
		  </div>
		</form>
		
		<!-- TABLE INPUT -->
		<!-- <table id="inputTable" style="width: 95%; margin: auto">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th><button class="btn btn-primary" id="btn-add" type="submit" style="width:100%;">Add</button></th>
			</tr>
			<tr>
				<th></th>
				<th><input type="text" class="form-control" placeholder="Transaction Code" id="data1" data-index="1" style="padding-right:10px;width:100%;"></th>
				<th><input type="text" class="form-control" placeholder="Request By" id="data2"data-index="2" style="padding-right:10px;width:100%;"></th>
				<th><input type="text" class="form-control" placeholder="Request Date" id="data3" data-index="3" style="padding-right:10px;width:70%;"></th>
				<th><input type="text" class="form-control" placeholder="Status" id="data4" data-index="4" style="padding-right:10px;width:100%;"></th>
				<th><input type="text" class="form-control" placeholder="Created Date" id="data5" data-index="5" style="padding-right:10px;width:70%;"></th>
				<th><input type="text" class="form-control" placeholder="Created By" id="data6" data-index="6" style="padding-right:10px;width:100%;"></th>
				<th><button class="btn btn-warning" id="btn-search" type="submit" style="width:100%;">Search</button></th>
			</tr>
		</thead>
		</table> -->
		
		<!-- TABLE TAMPILAN -->
		<table class="table table-striped table-hover" id="eventTable" style="width: 100%; margin-top: 5px ">
			<thead>
				<tr>
					<th>No</th>
					<th>Transaction Code</th>
					<th>Request by</th>
					<th>Request Date</th>
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

	<%@include file="/WEB-INF/pages/modal/event-add.html"%>
	<%@include file="/WEB-INF/pages/modal/event-view.html"%>
	<%@include file="/WEB-INF/pages/modal/event-edit.html"%>

</body>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>	
<script src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
<script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js" type="text/javascript"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>

<script type="text/javascript">

$(document).ready(function(){
	loadData();
	getUser();


	//DATEPICKER
	$('#data3').datepicker({
		format: 'yyyy-mm-dd',
		autoclose: true, 
		uiLibrary: 'bootstrap4'
	});
	$('#data5').datepicker({
		format: 'yyyy-mm-dd',
		autoclose: true,
		uiLibrary: 'bootstrap4'
	});
  	$('#eventstartdate').datepicker({
		format: 'yyyy-mm-dd',
		autoclose: true,
		uiLibrary: 'bootstrap4'
	});
  	$('#eventenddate').datepicker({
		format: 'yyyy-mm-dd',
		autoclose: true,
		uiLibrary: 'bootstrap4'
	});
  	$('#eventstartdateEdit').datepicker({
		format: 'yyyy-mm-dd',
		autoclose: true,
		uiLibrary: 'bootstrap4'
	});
  	$('#eventenddateEdit').datepicker({
		format: 'yyyy-mm-dd',
		autoclose: true,
		uiLibrary: 'bootstrap4'
	});
  	
  	
	//BUTTON POP UP ADD
	$(document).on('click','#btn-add', function(){
		$.ajax({
			url : '${pageContext.request.contextPath}/event/getcodeevent',
			type : 'GET',
			success: function(data){
				$('#transactioncode').val(data);
			},
			dataType: 'json'
		});
		
		$.ajax({
			url : '${pageContext.request.contextPath}/event/getuser',
			type : 'GET',
			success : function(data){
				$('#requestby').val(data.employee.employeeName);
				$('#requestbyid').val(data.employee.id);
				$('#createdby').val(data.employee.employeeName);
			}
		});
		var now = new Date();
		var year = now.getFullYear();
		var month = now.getMonth()+1;
		var date = now.getDate();
		var formattedDate = ("0"+date).slice(-2);
		$('#eventname').val();
		$('#requestdate').val(year+'-'+month+'-'+formattedDate);
		$('#eventplace').val();
		$('#note').val();
		$('#eventstartdate').val();
		$('#eventenddate').val();
		$('#budget').val();
		$('#addEventModal').modal();
	
	});
	
	//BUTTON SAVE PADA MODAL ADD UNTUK SAVE DATA
	$('.btn-add-event').on('click', function(){
			var event = {
				code : $('#transactioncode').val(),
				createdBy : $('#createdby').val(),
				requestBy : {
					id: $('#requestbyid').val()
				},
				eventName : $('#eventname').val(),
				requestDate : $('#requestdate').val(),
				place : $('#eventplace').val(),
				note : $('#note').val(),
				startDate : $('#eventstartdate').val(),
				endDate : $('#eventenddate').val(),
				budget : $('#budget').val()
			};
			
			
			//NOTIFICATION
			document.getElementById("notification").innerHTML = "Data Saved! Transaction event request has been added with code: "+event.code+"!";
			$('#notification').show('slow').delay(1500).hide('slow');
			
			console.log(event);
			$.ajax({
				url:'${pageContext.request.contextPath}/event/saveevent',
				type: 'POST',
				contentType: 'application/json',
				data: JSON.stringify(event),
				success : function(data){
					console.log("saved data success");
					loadData();
					$('#eventname').val("");
					$('#requestdate').val("");
					$('#eventplace').val("");
					$('#note').val("");
					$('#eventstartdate').val("");
					$('#eventenddate').val("");
					$('#budget').val("");
				},
				error : function(){
					console.log("saved data failed");
				}
			});
			$('#addEventModal').modal('hide');
	});
	
	//GET ROLE NAME WHEN LOGIN
	function getUser(){
		$.ajax({
			url : '${pageContext.request.contextPath}/user/getrole',/* fungsi/getuserlogin *//*user/getrole*/
			type : 'GET',
			success : function(data){
			 	$('#user-login').val(data);
				 document.getElementById("user-login").innerHTML="Selamat Datang " +data+ "!";
			}
		}) 
		
	 }
	
	
	//GET ALL DATA LOAD DATA
	function loadData(){
		$.ajax({
			url:'${pageContext.request.contextPath}/event/getallevent',
			type: 'GET',
			beforeSend: function(){
				console.log('before send');
			},
			success: function(output){
				console.log(output);
				convertToTable(output);
			},
			dataType: 'json'
		});
	}
	
	//CONVERT TO TABLE
	
	oTable = $('#eventTable').DataTable({
			'sDom' : 'tip',
			'ordering' : false
		});
	
	function convertToTable(data){
		var oTable = $('#eventTable').DataTable();
		
		oTable.rows('tr').remove();
		$.each(data, function(index, event){
			console.log(index, event);
			index++;
			
			//CHOOSEN MODAL BASED ON STATUS AND ROLE
			//NAMED STATUS 
			var role="${rolename}"
			var modalview = "";
			var modaledit = "";
			var status="";
			if(event.status==1){
				status="Submitted";
				if(role=="Administrator"){
					modalview = "btn-acceptreject-event";
				} else{
					modalview = "btn-view-event";
					modaledit="btn-edit-event"; 
				}
			} else if(event.status==2){
				status="In Progress";
				if(role=="Administrator"){
					modalview = "btn-viewapproved-event";
				} else{
					modalview = "btn-close-event";	
				}
			} else if(event.status==3){
				status="Done";
				modalview = "btn-view-event"; 
			} else if(event.status==0){
				status="Rejected";
				modalview = "btn-view-event";
			}
			
			var tableRow = "<a id="+event.id+" class='"+modalview+"'><span class='oi oi-magnifying-glass'></span></a>";
				tableRow += " ";
				tableRow += "<a id="+event.id+" class='"+modaledit+"'><span class='oi oi-pencil'></span></a>";
				oTable.row.add([index,event.code,event.requestBy.employeeName,event.requestDate,status,event.createdDate,event.createdBy,tableRow]);
		});
				oTable.draw();
	}
	
	//BUTTON SEARCH
	$('#btn-search').on('click', function(){
		for(var i = 1; i <= 7; i++){
			oTable
			.column($('#data'+i).data('index'))
			.search($('#data'+i).val())
			.draw()
		}
	});
	
	//BUTTON POP UP EDIT
	$(document).on('click', '.btn-edit-event', function(){
		var id = $(this).attr('id');
		console.log(id);
		
		$.ajax({
			url: '${pageContext.request.contextPath}/event/searchevent/' +id,
			type: 'GET',
			success: function(output){
				console.log(output);
				$('#EditButton').val(output.id);
				$('#transactioncodeEdit').val(output.code);
				$('#eventnameEdit').val(output.eventName);
				$('#requestdateEdit').val(output.requestDate);
				$('#eventplaceEdit').val(output.place);
				$('#noteEdit').val(output.note);
				$('#eventstartdateEdit').val(output.startDate);
				$('#eventenddateEdit').val(output.endDate);
				$('#budgetEdit').val(output.budget);
				$('#statusEdit').val(output.status);
			},
			dataType: 'json'
		});
		
		$.ajax({
			url : '${pageContext.request.contextPath}/event/getuser',
			type : 'GET',
			success : function(data){
				$('#updatedby').val(data.employee.employeeName);
				$('#requestbyEdit').val(data.employee.employeeName);
			}
		});
		$('#editEventModal').modal();
	});
	
	//BUTTON UPDATE TO UPDATE DATA
	$('#btn-edit-event').on('click', function(){
		var event = {
				id: $('#EditButton').val(),
				code: $('#transactioncodeEdit').val(),
				updatedBy: $('#updatedby').val(),
				eventName: $('#eventnameEdit').val(),
				place: $('#eventplaceEdit').val(),
				note: $('#noteEdit').val(),
				startDate: $('#eventstartdateEdit').val(),
				endDate: $('#eventenddateEdit').val(),
				budget: $('#budgetEdit').val(),
				status: $('#statusEdit').val()
		};
		console.log(event);
		
		//NOTIFICATION
		document.getElementById("notification").innerHTML = "Data Updated! Transaction event request with code: "+event.code+" has been updated !";
		$('#notification').show('slow').delay(1500).hide('slow');
		
		$.ajax({
			url: '${pageContext.request.contextPath}/event/updateevent/' +event.id,
			type: 'POST',
			contentType: 'application/json',
			data: JSON.stringify(event),
			success: function(data){
				console.log("data berhasil disimpan");
				loadData();
			}
		});
		$('#editEventModal').modal('hide');
	});
	
	//BUTTON POP UP VIEW REQUEST	
	$(document).on('click', '.btn-view-event', function(){
		var id = $(this).attr('id');
		console.log(id);
		
		$.ajax({
			url: '${pageContext.request.contextPath}/event/searchevent/' +id,
			type: 'GET',
			success: function(output){
					console.log(output);
					$('#ViewButton').val(output.id);
					$('#transactioncodeView').val(output.code);
					$('#requestbyView').val(output.requestBy);
					$('#eventnameView').val(output.eventName);
					$('#requestdateView').val(output.requestDate);
					$('#eventplaceView').val(output.place);
					$('#noteView').val(output.note);
					$('#eventstartdateView').val(output.startDate);
					$('#eventenddateView').val(output.endDate);
					$('#budgetView').val(output.budget);
					$('#statusView').val(output.status);
					},
					dataType: 'json'
			});
		
		$.ajax({
			url : '${pageContext.request.contextPath}/event/getuser',
			type : 'GET',
			success : function(data){
				$('#requestbyView').val(data.employee.employeeName);

			}
		});
	
		$('#viewEventModal').modal();
		});
	
	
	//BUTTON POP UP ACCEPT-REJECT REQUEST
	$(document).on('click', '.btn-acceptreject-event', function(){
		var id = $(this).attr('id');
		console.log(id);
	
			$.ajax({
				url: '${pageContext.request.contextPath}/event/searchevent/' +id,
				type: 'GET',
				success: function(output){
					console.log(output);
					$('#ARButton').val(output.id);
					$('#transactioncodeAR').val(output.code);
					$('#requestbyAR').val(output.requestBy);
					$('#eventnameAR').val(output.eventName);
					$('#requestdateAR').val(output.requestDate);
					$('#eventplaceAR').val(output.place);
					$('#noteAR').val(output.note);
					$('#eventstartdateAR').val(output.startDate);
					$('#eventenddateAR').val(output.endDate);
					$('#budgetAR').val(output.budget);
					$('#statusAR').val(output.status);
					$('#assigntoAR').val(output.assignTo);
					$('#rejectreason').val(output.rejectReason);
				},
				dataType: 'json'
			});
			
			$.ajax({
				url : '${pageContext.request.contextPath}/event/getuser',
				type : 'GET',
				success : function(data){
					$('#approvedbyid').val(data.employee.id);
					$('#requestbyAR').val(data.employee.employeeName);

				}
			});
			$('#acceptrejectEventModal').modal();
		
	});
	
	//BUTTON APPROVED TO ACCEPT REQUEST
	$('#btn-accept-event').click(function(){
		var event = {
				id: $('#ARButton').val(),
				code: $('#transactioncodeAR').val(),
				assignTo: { 
					id: $('#assigntoAR').val()
					},
				approvedBy: {
					id: $('#approvedbyid').val()
				}
		};
		console.log(event);
		
		//NOTIFICATION
		document.getElementById("notification").innerHTML = "Data Approved! Transaction event request with code: "+event.code+" has been approved !";
		$('#notification').show('slow').delay(1500).hide('slow');
		
		$.ajax({
			url: '${pageContext.request.contextPath}/event/acceptevent/' +event.id,
			type: 'POST',
			contentType: 'application/json',
			data: JSON.stringify(event),
			success: function(data){
				console.log("data berhasil diubah");
				loadData();
				$('#assigntoAR').val("");
				$('#approvedbyid').val("");
			}
		});
		$('#acceptrejectEventModal').modal('hide');
	});
	
	//BUTTON POP UP CONFIRM TO REJECT EVENT REQUEST AND GIVE REJECT REASON
	$(document).on('click', '#btn-reject-event', function(){
		$.ajax({
			success: function(output){
				$('#ARButton').val(output.id);
			},
			dataType: 'json'
		});
		$('#acceptrejectEventModal').modal('hide');
		$('#rejectEventModal').modal();
	});
	
	//BUTTON REJECTED TO REJECT REQUEST
	$('#btn-reject2-event').click(function(){
		var event = {
				id: $('#ARButton').val(),
				code: $('#transactioncodeAR').val(),
				rejectReason: $('#rejectreason').val()
		};
		console.log(event);
		
		//NOTIFICATION
		document.getElementById("notification2").innerHTML = "Data Rejected! Transaction event request with code: "+event.code+" has been rejected by Administrator !";
		$('#notification2').show('slow').delay(1500).hide('slow')
		
		$.ajax({
			url: '${pageContext.request.contextPath}/event/rejectevent/' +event.id,
			type: 'POST',
			contentType: 'application/json',
			data: JSON.stringify(event),
			success: function(data){
				console.log("data berhasil diubah");
				loadData();
				$('#rejectreason').val("");
			}
		});
		$('#rejectEventModal').modal('hide');
	});
	
	//BUTTON POP UP VIEW AFTER APPROVED REQUEST	
	$(document).on('click', '.btn-viewapproved-event', function(){
		var id = $(this).attr('id');
		console.log(id);
		
		$.ajax({
			url: '${pageContext.request.contextPath}/event/searchevent/' +id,
			type: 'GET',
			success: function(output){
					console.log(output);
					$('#VAButton').val(output.id);
					$('#transactioncodeVA').val(output.code);
					$('#requestbyVA').val(output.requestBy);
					$('#eventnameVA').val(output.eventName);
					$('#requestdateVA').val(output.requestDate);
					$('#eventplaceVA').val(output.place);
					$('#noteVA').val(output.note);
					$('#eventstartdateVA').val(output.startDate);
					$('#eventenddateVA').val(output.endDate);
					$('#budgetVA').val(output.budget);
					$('#statusVA').val(output.status);
					$('#assigntoVA').val(output.assignTo.employeeName);
					},
					dataType: 'json'
				});
		
		$.ajax({
			url : '${pageContext.request.contextPath}/event/getuser',
			type : 'GET',
			success : function(data){
				$('#requestbyVA').val(data.employee.employeeName);

			}
		});
	
		$('#viewapprovedEventModal').modal();
		});
	
	
	//BUTTON POP UP CLOSE REQUEST
	$(document).on('click', '.btn-close-event', function(){
		var id = $(this).attr('id');
		console.log(id);
		
		$.ajax({
			url: '${pageContext.request.contextPath}/event/searchevent/' +id,
			type: 'GET',
			success: function(output){
				console.log(output);
				$('#CloseButton').val(output.id);
				$('#transactioncodeClose').val(output.code);
				$('#requestbyClose').val(output.requestBy);
				$('#eventnameClose').val(output.eventName);
				$('#requestdateClose').val(output.requestDate);
				$('#eventplaceClose').val(output.place);
				$('#noteClose').val(output.note);
				$('#eventstartdateClose').val(output.startDate);
				$('#eventenddateClose').val(output.endDate);
				$('#budgetClose').val(output.budget);
				$('#statusClose').val(output.status);
				$('#assigntoClose').val(output.assignTo);
			},
			dataType: 'json'
		});
		$('#closeEventModal').modal();
	});
	
	//BUTTON POP UP CONFIRM TO CLOSE REQUEST
	$(document).on('click', '#btn-close-event', function(){
		$.ajax({
			success: function(output){
				$('#CloseButton').val(output.id);
			},
			dataType: 'json'
		});
		$('#closeEventModal').modal('hide');
		$('#close2EventModal').modal();
	});
	
	//BUTTON CONFIRM YES TO CLOSE REQUEST
	$('.btn-close2-event').click(function(){
		var event = {
			id: $('#CloseButton').val(),
			code: $('#transactioncodeClose').val()	
		};
		
		//NOTIFICATION
		document.getElementById("notification").innerHTML = "Data Closed! Transaction event request with code: "+event.code+" has been closed !";
		$('#notification').show('slow').delay(1500).hide('slow')
		
		$.ajax({
			url: '${pageContext.request.contextPath}/event/closeevent/' +event.id,
			type: 'POST',
			contentType: 'application/json',
			data: JSON.stringify(event),
			success: function(data){
				console.log("data berhasil diubah");
				loadData();
			}
		});
		$('#close2EventModal').modal('hide');
	});
	
});
</script>
</html>