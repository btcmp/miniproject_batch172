<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Company</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css"/>
<link href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/assets/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css" rel="stylesheet" type="text/css" />
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

<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>	
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
<script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js" type="text/javascript"></script>
	
	<div id = "container">
		<!-- HEADER -->		
		<div class="card text-white bg-primary mb-3" style="width: 100%">
  			<div class="card-header">List Company</div>
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
		        <a class="nav-link" href="#">List Company <span class="sr-only">(current)</span></a>
		      </li>
		    </ul>
		  </div>
		</nav>
		
		<!-- BUTTON ADD DAN NOTIFICATION -->
		<div class="form-row" style="float:right; padding:5px;">
			<a class="btn btn-primary" id="btn-add" href="#" style="width:100px;">Add</a>
		</div>
		<div class="form-row" style="float:left; padding:10px;">
			<a id="notification" class="text-white bg-info border rounded"></a>
		</div>
		
		<!-- FORM -->		
		<form>
		  <div class="form-row" style="width: 100%; margin:auto;">
		    <div class="col">
		      <input type="text" class="form-control" placeholder="- Select Company Code -" id="data1" data-index="1">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="- Select Company Name -" id="data2"data-index="2">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Created Date" id="data3" data-index="3">
		    </div>
		    <div class="col">
		      <input type="text" class="form-control" placeholder="Created By" id="data4" data-index="4">
		    </div>
		     <a class="btn btn-warning" id="btn-search" href="#" style="width:100px;">Search</a>
		  </div>
		</form>
		
		<!-- TABLE INPUT 
		<table id="inputTable" style="width: 95%; margin: auto">
		<thead>
			<tr>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th><button class="btn btn-primary" id="btn-add" type="submit" style="width:100%;">Add</button></th>
			</tr>
			<tr>
				<th></th>
				<th><input type="text" class="form-control" placeholder="- Select Company Code -" id="data1" data-index="1" style="padding-right:10px;width:100%;"></th>
				<th><input type="text" class="form-control" placeholder="- Select Company Name -" id="data2"data-index="2" style="padding-right:10px;width:100%;"></th>
				<th><input type="text" class="form-control" placeholder="Created Date" id="data3" data-index="3" style="padding-right:10px;width:70%;"></th>
				<th><input type="text" class="form-control" placeholder="Created By" id="data4" data-index="4" style="padding-right:10px;width:100%;"></th>
				<th><button class="btn btn-warning" id="btn-search" type="submit" style="width:100%;">Search</button></th>
			</tr>
		</thead>
		</table>
		-->
				
		<!-- TABLE TAMPILAN -->
		<table class="table table-striped table-hover" id="companyTable" style="width: 100%">
			<thead>
				<tr>
					<th>No</th>
					<th>Company Code</th>
					<th>Company Name</th>
					<th>Created Date</th>
					<th>Created By</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>

	<%@include file="/WEB-INF/pages/modal/company-add.html"%>
	<%@include file="/WEB-INF/pages/modal/company-view.html"%>
	<%@include file="/WEB-INF/pages/modal/company-edit.html"%>
	<%@include file="/WEB-INF/pages/modal/company-delete.html"%>

</body>	
<script type="text/javascript">
	
	/* var button = document.getElementById('btn-add');
	button.addEventListener('click', function(){
		console.log('ada event')
	});  */
	
	$(document).ready(function(){
		loadData();
		
		//DATEPICKER
		$('#data3').datepicker({
			format: 'yyyy-mm-dd',
			autoclose: true,
			uiLibrary: 'bootstrap4'
		});
		
		//VALIDATOR ADD UNIQUE FIRST NAME
		Parsley.addValidator('namecheck', {
			validateString : function(value){
				var splitname = value.split(" ");
				before = $.ajax({
					url: '${pageContext.request.contextPath}/company/searchnamecompany/' +splitname[0],
					dataType: 'json',
					type: 'GET',
				});
				return before.then(function(data){
					if(data.length==0){
						return true	
					} else {
						return $.Deferred().reject()
					}
				});
			}
		});
		
		//BUTTON POP UP ADD
		$(document).on('click', '#btn-add', function(){
			$.ajax({
				url:'${pageContext.request.contextPath}/company/getcodecompany',
				type: 'GET',
				success : function(data){
					$('#companycode').val(data);
				},
				dataType: 'json'
			});
			
			$.ajax({
				url : '${pageContext.request.contextPath}/company/getuser',
				type : 'GET',
				success : function(data){
					$('#createdby').val(data.mRole.roleName);
				}
			});
			
			$('#addForm').parsley().reset();
			$('#companyname').val();
			$('#companyemail').val();
			$('#companyaddress').val();
			$('#companyphone').val();
			$('#addCompanyModal').modal();
		});
		
		//BUTTON SAVE PADA MODAL ADD UNTUK SAVE DATA
		$('.btn-add-comp').on('click', function(){
			var validate = $('#addForm').parsley();
			validate.validate();
		});
		
		//SAVE WHEN VALIDATION SUCCESS
		$('#addForm').parsley().on('form:success', function(){
			var company = {
					code : $('#companycode').val(),
					name : $('#companyname').val(),
					email : $('#companyemail').val(),
					address : $('#companyaddress').val(),
					phone : $('#companyphone').val(),
					createdBy : $('#createdby').val()
			};
			
			//NOTIFICATION
			document.getElementById("notification").innerHTML = "Data Saved! New company has been added with code: "+company.code+"!";
			$('#notification').show('slow').delay(1500).hide('slow');
			
			console.log(company);
			$.ajax({
				url:'${pageContext.request.contextPath}/company/savecompany',
				type: 'POST',
				contentType: 'application/json',
				data: JSON.stringify(company),
				success: function(data){
					console.log("data berhasil disimpan");
					loadData();
					$('#companycode').val("");
					$('#companyname').val("");
					$('#companyemail').val("");
					$('#companyaddress').val("");
					$('#companyphone').val("");
				},
				error : function(){
					console.log("data gagal disimpan");
				}
			});
			$('#addCompanyModal').modal('hide');
		});
		
		
		//GETALL DATA LOAD DATA
		function loadData(){
			$.ajax({
				url: '${pageContext.request.contextPath}/company/getallcompany',
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
		
		oTable = $('#companyTable').DataTable({
			'sDom' : 'tip',
			'ordering' : false
		});
		
		function convertToTable(data){
			var oTable = $('#companyTable').DataTable();
			
			//var tBody = oTable.find('tBody');
			//tBody.find('tr').remove();
			
			oTable.rows('tr').remove();
			$.each(data, function(index, company){
				console.log(index, company);
				index++;
			var tableRow = "<a id="+company.id+" class = 'btn-view-comp'><span class='oi oi-magnifying-glass'></span></a>";
				tableRow += " ";
				tableRow += "<a id="+company.id+" class = 'btn-edit-comp'><span class='oi oi-pencil'></span></a>";
				tableRow += " ";
				tableRow += "<a id="+company.id+" class = 'btn-delete-comp'><span class='oi oi-trash'></span></a>";
				oTable.row.add([index,company.code,company.name,company.createdDate,company.createdBy,tableRow]);
				
			/* var tableRow = '<tr>';
				tableRow += '<td>';
					tableRow += index;
				tableRow += '</td>';
				tableRow += '<td>';
					tableRow += company.code;
				tableRow += '</td>';
				tableRow += '<td>';
					tableRow += company.name;
				tableRow += '</td>';
				tableRow += '<td>';
					tableRow += company.createdDate;
				tableRow += '</td>';
				tableRow += '<td>';
					tableRow += company.createdBy;
				tableRow += '</td>';
				tableRow += "<td>";
					tableRow += "<a id="+company.id+" class = 'btn btn-info btn-sm btn-view-comp'>View</a>";
					tableRow += "<a id="+company.id+" class = 'btn btn-secondary btn-sm btn-edit-comp'>Edit</a>";
					tableRow += "<a id="+company.id+" class = 'btn btn-danger btn-sm btn-delete-comp'>Delete</a>";
				tableRow += "</td>";
				tableRow += '</tr>';
			tBody.append(tableRow); */
			});
			oTable.draw();
		}
		
		//BUTTON SEARCH
		$('#btn-search').on('click', function(){
			for(var i = 1; i <= 5; i++){
				oTable
				.column($('#data'+i).data('index'))
				.search($('#data'+i).val())
				.draw()
			}
		});
		
		//BUTTON POP UP VIEW
		$(document).on('click', '.btn-view-comp', function(){
			var id = $(this).attr('id');
			console.log(id);
			
			$.ajax({
				url: '${pageContext.request.contextPath}/company/searchcompany/' +id,
				type: 'GET',
				success: function(output){
					console.log(output);
					$('#ViewButton').val(output.id);
					$('#companycodeView').val(output.code);
					$('#companynameView').val(output.name);
					$('#companyemailView').val(output.email);
					$('#companyaddressView').val(output.address);
					$('#companyphoneView').val(output.phone);
				},
				dataType: 'json'
			});
			$('#viewCompanyModal').modal();
		});
		
		
		//BUTTON POP UP EDIT
		$(document).on('click', '.btn-edit-comp', function(){
			var id = $(this).attr('id');
			console.log(id);
			
			$.ajax({
				url: '${pageContext.request.contextPath}/company/searchcompany/' +id,
				type: 'GET',
				success: function(output){
					console.log(output);
					$('#EditButton').val(output.id);
					$('#companycodeEdit').val(output.code);
					$('#companynameEdit').val(output.name);
					$('#companyemailEdit').val(output.email);
					$('#companyaddressEdit').val(output.address);
					$('#companyphoneEdit').val(output.phone);
				},
				dataType: 'json'
			});
			$.ajax({
				url : '${pageContext.request.contextPath}/company/getuser',
				type : 'GET',
				success : function(data){
					$('#updateby').val(data.mRole.roleName);
				}
			});
			
			$('#editCompanyModal').modal();
		});
		
		
		//BUTTON POP UP CONFIRM TO UPDATE
		$(document).on('click', '#btn-edit-comp', function(){			
			var validate = $('#editForm').parsley();
			if(validate.validate()){
			$.ajax({
				success: function(output){
					$('#EditButton').val(output.id);
				},
				dataType: 'json'
			});
			$('#editCompanyModal').modal('hide');
			$('#edit2CompanyModal').modal()
			}
		});
		
		//BUTTON UPDATE PADA MODAL ADD UNTUK UPDATE DATA
		$('.btn-edit2-comp').click(function(){
				var company = {
						id : $('#EditButton').val(),
						code : $('#companycodeEdit').val(),
						name : $('#companynameEdit').val(),
						email : $('#companyemailEdit').val(),
						address : $('#companyaddressEdit').val(),
						phone : $('#companyphoneEdit').val(),
						updateBy: $('#updateby').val()
					};
				console.log(company);
				
				//NOTIFICATION
				document.getElementById("notification").innerHTML = "Data Updated! Data company has been updated!";
				$('#notification').show('slow').delay(1500).hide('slow');
				
					$.ajax({
						url: '${pageContext.request.contextPath}/company/updatecompany/' +company.id,
						type: 'POST',
						contentType: 'application/json',
						data: JSON.stringify(company),
						success: function(data){
							console.log('data berhasil disimpan');
							loadData();
						}
					});
					$('#edit2CompanyModal').modal('hide');
		});
		
		//BUTTON POP UP DELETE
		$(document).on('click', '.btn-delete-comp', function(){
			var id = $(this).attr('id');
			console.log(id);
			
			$.ajax({
				url: '${pageContext.request.contextPath}/company/searchcompany/' +id,
				type: 'GET',
				success: function(output){
					$('#DeleteButton').val(output.id);
					$('#companycodeDelete').val(output.code);
				},
				dataType: 'json'
			});
			$('#deleteCompanyModal').modal();
		});
		
		//BUTTON DELETE UNTUK DELETE DATA
		$('#btn-delete-comp').click(function(){
			var company = {
				id: $('#DeleteButton').val(),
				code : $('#companycodeDelete').val()
			};
			
			//NOTIFICATION
			document.getElementById("notification").innerHTML = "Data Deleted! Data company with code " +company.code+ " has been deleted!";
			$('#notification').show('slow').delay(1500).hide('slow');
			
			$.ajax({
				url: '${pageContext.request.contextPath}/company/deletecompany/' +company.id,
				type: 'DELETE',
				data: JSON.stringify(company),
				contentType: 'application/json',
				success: function(output){
					console.log('data berhasil dihapus');
					loadData();
					$('#deleteCompanyModal').modal('hide');
				}
			});
		});
	});
	</script>			
</html>