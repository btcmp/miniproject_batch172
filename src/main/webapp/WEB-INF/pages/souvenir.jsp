<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SOUVENIR</title>
<!-- css bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!-- css data tables -->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css"/>

<!-- css date picker -->
<link href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css" rel="stylesheet" /> 
<!-- css icon -->
<link href="${pageContext.request.contextPath}/resources/assets/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet">
<!-- dropdown -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css" rel="stylesheet" type="text/css" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
	<div id = "container" style="width : 1000px; margin: auto">
		<!-- HEADER -->		
		<div class="card text-white bg-primary mb-3" style="width: 100%;">
  			<div class="card-header">List Souvenir</div>
		</div>
		
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
		        <a class="nav-link" href="#">List Souvenir <span class="sr-only">(current)</span></a>
		      </li>
		    </ul>
		  </div>
		</nav>
		
		<!-- BUTTON ADD -->
		<div class="row" style="float:right; padding-bottom:10px; padding-top:10px">
			<div class="col">
				<a class="btn btn-primary" id="btn-add-souvenir" href="#">Add</a>
			</div>
		</div>
		
		<!-- FORM Search -->		
		<form>
			<div class="row" style="width: 100%; margin : auto">
   				<div class="col">
      				<input type="text" class="form-control" placeholder="Souvenir Code" id="data1" data-index="1" style="padding-right:10px;width:100%;">
   				</div>
    			<div class="col">
      				<input type="text" class="form-control" placeholder=" Souvenir Name" id="data2" data-index="2" style="padding-right:10px;width:100%;">
    			</div>
				<div class="col">
      				<input type="text" class="form-control" placeholder="Select Unit Souvenir" id="data3" data-index="3" style="padding-right:10px;width:100%;">
    			</div>
    			<div class="col">
      				<input type="text" class="form-control" placeholder="Created Date" id="data4" data-index="4" style="padding-right:10px;width:100%;">
    			</div>
    			<div class="col">
      				<input type="text" class="form-control" placeholder="Created By" id="data5" data-index="5" style="padding-right:10px;width:100%;">      				
    			</div>
    			<a class="btn btn-warning" id="btn-search" href="#">Search</a>	
  			</div>
		</form> 
		<hr/>
		
		<!-- TABLE -->
		<table class="table table-striped table-hover" id="souvenirTable" style="width : 100%">
			<thead>
				<tr>
					<th>No</th>
					<th>Souvenir Code</th>
					<th>Souvenir Name</th>
					<th>Unit</th>
					<th>Created Date</th>
					<th>Created By</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				
			</tbody>
		</table>
	</div>


<!-- include file -->
<%@include file="/WEB-INF/pages/modal/add-souvenir.html"%>
<%@include file="/WEB-INF/pages/modal/souvenir-view.html"%>

</body>

<!-- jquery link -->
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<!-- data tables -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js" type="text/javascript"></script>
<!--  Notifications Plugin    -->
<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
<!--  PerfectScrollbar Library -->
<script src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<%-- <script src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
<script src="https://cdnjs.cloudfare.com/ajax/libs/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script> --%>
	<script type="text/javascript">
	
	$(document).ready(function(){
		//datepicker
		$('#data4').datepicker({
			format:('yyyy-mm-dd')
		});
		
		
	loadData();
	
	//search
	oTable = $('#souvenirTable').DataTable({
		'sDom':'tip',
		'ordering':false
	});
	$('#btn-search').on( 'click', function () {
		for(var i = 1 ; i <= 5; i++){
			oTable
            .column( $('#data'+ i).data('index') )
            .search( $('#data'+ i).val() )
            .draw();			
		}
		
    } );	
	
	//-- BUTTON POP UP ADD -->
		$('#btn-add-souvenir').on('click', function(){
			 $.ajax({
				url:'${pageContext.request.contextPath}/souvenir/getcode',
				type: 'GET',
				success : function(data){
					console.log(data);
					$('#souvenircode').val(data);
				},
				dataType: 'json'
			});
			$('#add-souvenir-modal').modal();
			
		});
	});
	
	//SAVE and validasi
	$('#btn-add-sv').on('click',function(ev){
		//Fetch form to apply custom Bootstrap validation
 		ev.preventDefault();
 	    var validate = $('#addForm').parsley();
 	    if (validate.validate()){
 	    	var souvenir= {
 	   			code:$('#souvenircode').val(),
 	   			name:$('#souvenirname').val(),
 	   			masterUnit : {
					id :$('#add-unit').val()
				},
 	   			//mUnitId:$('#unit').val(),
 	   			description:$('#souvenirdescription').val()
 	   		}
 	   		console.log(souvenir);
 	   		$.ajax({
 	   			url:'${pageContext.request.contextPath}/souvenir/save',
 	   			type: 'POST',
 	   			contentType: 'application/json',
 	   			data : JSON.stringify(souvenir),
 	   			beforeSend: function () {
 	   				console.log('before sending data');
 	   			},
 	   			success: function (data) {
 	   				console.log('data saved successfully')
 	   				loadData();
 	   				$('#souvenircode').val('');
 	   				$('#souvenirname').val('');
 	   				$('#add-unit').val('');
 	   				$('#souvenirdescription').val('');
 	   				$('#add-souvenir-modal').modal('hide');
 	   			},
 	   			error : function () {
 	   				console.log('failed to save data')
 	   			}
 	   		});
 	    }
		
		
	});
	
	//VIEW POP UP BUTTON
	$(document).on('click', '.btn-view-souvenir', function(){
			var id =$(this).attr('id');
			console.log(id);
			 $.ajax({
				url:'${pageContext.request.contextPath}/souvenir/getbyid/'+id,
				type: 'GET',
				success : function(outview){
					console.log(outview);
					$('#souvenircodeview').val(outview.code);
					$('#souvenirnameview').val(outview.name);
					$('#souvenirunitview').val(outview.masterUnit.name);
					$('#souvenirdescriptionview').val(outview.description);
					document.getElementById("viewTitle").innerHTML = "View Souvenir - "+outview.name+" ("+outview.code+") ";
				},
				dataType: 'json'
			});
			 
			 $('#view-souvenir-modal').modal();
		});
	
	//EDIT POP UP button
	$(document).on('click', '.btn-edit-souvenir', function(){
			var id =$(this).attr('id');
			console.log(id);
			 $.ajax({
				url:'${pageContext.request.contextPath}/souvenir/getbyid/'+id,
				type: 'GET',
				success : function(outedit){
					console.log(outedit);
					
					$('#editsvnrid').val(outedit.id);
					$('#editsvnrcode').val(outedit.code);
					$('#editsvnrname').val(outedit.name);
					$('#edit-souvenir').val(outedit.masterUnit.id);
					$('#editsvnrdescription').val(outedit.description);
					$('#editsvnrquantity').val(outedit.quantity);
					$('#editsvnrcreaatedby').val(outedit.createdBy);
					$('#editsvnrcreateddate').val(outedit.createdDate);
					document.getElementById("editTitle").innerHTML = "Edit Souvenir - "+outedit.name+" ("+outedit.code+") ";
				},
				dataType: 'json'
			});
			 $('#edit-souvenir-modal').modal();
		}); 
	//ngesave EDIT
	 $('#btn-edit-sv').on('click',function(){
		var validate = $('#editForm').parsley();
	 	if (validate.validate()){
	 		var svnr= {
	 				id:parseInt($('#editsvnrid').val()),
	 				code:$('#editsvnrcode').val(),
	 				name:$('#editsvnrname').val(),
	 				masterUnit : {
						id :$('#edit-souvenir').val()
					},
	 				description:$('#editsvnrdescription').val(),
	 				quantity:parseInt($('#editsvnrquantity').val()),
	 				createdBy:$('#editsvnrcreaatedby').val(),
	 				createdDate:$('#editsvnrcreateddate').val(),
	 				//'delete':false
	 				
	 			};
	 		console.log(svnr);
			$.ajax({
				url:'${pageContext.request.contextPath}/souvenir/update',
				type: 'POST',
				contentType: 'application/json',
				data : JSON.stringify(svnr),
				beforeSend: function () {
					console.log('before sending data');
				},
				success: function (data) {
					console.log('data saved successfully')
					loadData();
					$('#edit-souvenir-modal').modal('hide');
				},
				error : function () {
					console.log('error')
				}
			});
			
	 	}
		
		
	});
 	//DElETE button
 	$(document).on('click', '.btn-delete-souvenir', function(){
			var id =$(this).attr('id');
			console.log(id);
			 $.ajax({
				url:'${pageContext.request.contextPath}/souvenir/getbyid/'+id,
				type: 'GET',
				success : function(outDelete){
					console.log(outDelete);
					
					$('#deleteSvnrId').val(outDelete.id);
					$('#deleteSvnrCode').val(outDelete.code);
					$('#deleteSvnrName').val(outDelete.name);
					$('#deleteSnvrUnit').val(outDelete.masterUnit.id);
					$('#deleteSvnrDescription').val(outDelete.description);
					$('#deleteSvnrQuantity').val(outDelete.quantity);
					$('#deleteSvnrCreatedBy').val(outDelete.createdBy);
					$('#deleteSvnrCreatedDate').val(outDelete.createdDate);
					$('#deleteSvnrUpdatedBy').val(outDelete.updatedBy);
					$('#deleteSvnrUpdatedDate').val(outDelete.updatedDate);
				},
				dataType: 'json'
			});
			 $('#delete-souvenir-modal').modal();
		}); 
 	$('#btnDeleteSv').on('click',function(){
		var svDelete= {
			id:parseInt($('#deleteSvnrId').val()),
			code:$('#deleteSvnrCode').val(),
			name:$('#deleteSvnrName').val(),
			masterUnit : {
				id :parseInt($('#deleteSnvrUnit').val())
			},
			description:$('#deleteSvnrDescription').val(),
			quantity:parseInt($('#deleteSvnrQuantity').val()),
			createdBy:$('#deleteSvnrCreatedBy').val(),
			createdDate:$('#deleteSvnrCreatedDate').val(),
			updatedBy:$('#deleteSvnrUpdatedBy').val(),
			updatedDate:$('#deleteSvnrUpdatedDate').val(),
			//'delete':false
			
		};
		console.log(svDelete);
		$.ajax({
			url:'${pageContext.request.contextPath}/souvenir/delete/',
			type: 'POST',
			contentType: 'application/json',
			data : JSON.stringify(svDelete),
			beforeSend: function () {
				console.log('before sending data');
				console.log(svDelete);
			},
			success: function (data) {
				console.log('data delete successfully')
				loadData();
			},
			error : function () {
				console.log('failed to delete data')
			}
		});
		$('#delete-souvenir-modal').modal('hide');
	});
	//LOAD DATA
	function loadData() {
		 $.ajax({
			url:'${pageContext.request.contextPath}/souvenir/list',
			type: 'GET',
			success : function(output){
				console.log(output);
				convertToTable(output);
			},
			dataType:'json'
		}); 
	};
	
	//convertToTable fungsi 
	function convertToTable(data) {
		oTable=$('#souvenirTable').DataTable();
		/* var tBody=oTable.find('tbody');
		tBody.find('tr').remove(); */
		
		//isi data ke table row
		oTable.rows('tr').remove();
		$.each(data, function(index, mastersouvenir){
			
			index++;
			var tRow = '<a id="'+mastersouvenir.id+'" href="#" class="btn btn-warning btn-view-souvenir"><span class="oi oi-magnifying-glass"></span></a>';
			tRow += ' ';
			tRow += '<a id="'+mastersouvenir.id+'" href="#" class="btn btn-warning btn-edit-souvenir"><span class="oi oi-pencil"></span></a>';
			tRow += ' ';
			tRow += '<a id="'+mastersouvenir.id+'" href="#" class="btn btn-warning btn-delete-souvenir"><span class="oi oi-trash"></span></a>';
			oTable.row.add([index, mastersouvenir.code, mastersouvenir.name, mastersouvenir.masterUnit.name,
				 mastersouvenir.createdDate, mastersouvenir.createdBy, tRow]);
				 //mastersouvenir.unit,
			//console.log(index, mastersouvenir);
			/* var tableRow ="<tr>";
				tableRow += "<td>";
					tableRow += index;
				tableRow += "</td>";
				tableRow += "<td>";
					tableRow += mastersouvenir.code;
				tableRow += "</td>";
				tableRow += "<td>";
					tableRow += mastersouvenir.name;
				tableRow += "</td>";
				tableRow += "<td>";
					tableRow += mastersouvenir.unit;
				tableRow += "</td>";
				tableRow += "<td>";
					tableRow += mastersouvenir.createdDate;
				tableRow += "</td>";
				tableRow += "<td>";
					tableRow += mastersouvenir.createdBy;
				tableRow += "</td>";
				tableRow += "<td>";
					tableRow += '<a id="'+mastersouvenir.id+'" href="#" class="btn btn-warning btn-view-souvenir">view</a>';
					tableRow += " ";
					tableRow += '<a id="'+mastersouvenir.id+'" href="#" class="btn btn-warning btn-edit-souvenir">edit</a>';
					tableRow += " ";
					tableRow += '<a id="'+mastersouvenir.id+'" href="#" class="btn btn-warning btn-delete-souvenir">delete</a>';
				tableRow += "</td>";
			tableRow += "</tr>";
		tBody.append(tableRow); */
		});
		oTable.draw();
	};

	</script>
	
</html>