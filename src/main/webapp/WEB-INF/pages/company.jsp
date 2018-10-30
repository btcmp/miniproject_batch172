<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Company</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div id = "container" style="width : 1000px; margin: auto">
		<!-- HEADER -->		
		<div class="card text-white bg-primary mb-3" style="width: 100%;">
  			<div class="card-header">List Company</div>
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
		        <a class="nav-link" href="#">List Company <span class="sr-only">(current)</span></a>
		      </li>
		    </ul>
		  </div>
		</nav>
		
		<!-- BUTTON ADD -->
		<div class="row" style="float:right; padding-bottom:10px; padding-top:10px">
			<div class="col">
				<a class="btn btn-primary" id="btn-add" href="#">Add</a>
			</div>
		</div>
		
		<!-- FORM -->		
		<form>
			<div class="row" style="width: 100%; margin : auto">
   				<div class="col">
      				<input type="text" class="form-control" placeholder="Select Company Code">
   				</div>
    			<div class="col">
      				<input type="text" class="form-control" placeholder="Select Company Name">
    			</div>
    			<div class="col">
      				<input type="text" class="form-control" placeholder="Created Date">
    			</div>
    			<div class="col">
      				<input type="text" class="form-control" placeholder="Created By">
    			</div>
    			<a class="btn btn-warning" id="btn-search" href="#">Search</a>	
  			</div>
		</form>
		<hr/>
		
		<!-- TABLE -->
		<table class="table table-striped table-hover" id="compTable" style="width : 100%">
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
		
		<!-- MODAL ADD COMPANY-->
		<div class="modal fade" id="addCompanyModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		  <div class="modal-dialog modal-lg" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle">Add Data Company</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <input type="hidden" id="AddButton"/>
		        <div class="form-row">
		       		<label for="companycode" class="col-sm-2 col-form-label">Company Code</label>
		            	<div class="col-sm-4">
 							<input type="text" id="companycode" class="form-control" placeholder="Auto Generated" disabled>
 						</div>
 					<label for="companyname" class="col-sm-2 col-form-label">Company Name</label>
				    	<div class="col-sm-4">
				      		<input type="text" id="companyname" class="form-control" placeholder="Type Company Name">
				    	</div>
				</div>
				<div class="form-row" style="margin-top: 10px">
				 	<label for="companyemail" class="col-sm-2 col-form-label">Email</label>
					    <div class="col-sm-4">
					      	<input type="text" id="companyemail" class="form-control" placeholder="Type Email">
 						</div>
 				  	<label for="companyaddress" class="col-sm-2 col-form-label">Address</label>	
					    <div class="col-sm-4">
							<input style="height:100px"" type="text" id="companyaddress" class="form-control" placeholder="Type Address">
				    	</div>
				</div>
				<div class="form-row" style="margin-top: -50px">
					<label for="companyphone" class="col-sm-2 col-form-label">Phone</label>
					    <div class="col-sm-4">
					      	<input type="text" id="companyphone" class="form-control" placeholder="Type Phone">
 						</div>
				</div>
		      </div>
		      <div class="modal-footer">
		     	<button type="button" class="btn btn-primary btn-add-comp">Save</button>
		        <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		<!-- MODAL VIEW COMPANY-->
		<div class="modal fade" id="viewCompanyModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		  <div class="modal-dialog modal-lg" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle">View Data Company</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <input type="hidden" id="ViewButton"/>
		        <div class="form-row">
		       		<label for="companycode" class="col-sm-2 col-form-label">Company Code</label>
		            	<div class="col-sm-4">
 							<input type="text" id="companycodeView" class="form-control" placeholder="Auto Generated" disabled>
 						</div>
 					<label for="companyname" class="col-sm-2 col-form-label">Company Name</label>
				    	<div class="col-sm-4">
				      		<input type="text" id="companynameView" class="form-control" placeholder="Type Company Name" disabled>
				    	</div>
					</div>
				<div class="form-row" style="margin-top: 10px">
				 	<label for="companyemail" class="col-sm-2 col-form-label">Email</label>
					    <div class="col-sm-4">
					      	<input type="text" id="companyemailView" class="form-control" placeholder="Type Email" disabled>
 						</div>
 		 		  	<label for="companyaddress" class="col-sm-2 col-form-label">Address</label>	
					    <div class="col-sm-4">
					    	<input style="height:100px"" type="text" id="companyaddressView" class="form-control" placeholder="Type Address" disabled>
					   	</div>
				</div>
				<div class="form-row" style="margin-top: -50px">
					<label for="companyphone" class="col-sm-2 col-form-label">Phone</label>
					    <div class="col-sm-4">
					      	<input type="text" id="companyphoneView" class="form-control" placeholder="Type Phone" disabled>
 						</div>
 				</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		<!-- MODAL EDIT COMPANY-->
		<div class="modal fade" id="editCompanyModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		  <div class="modal-dialog modal-lg" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle">Edit Data Company</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <input type="hidden" id="EditButton"/>
		        <div class="form-row">
		       		<label for="companycode" class="col-sm-2 col-form-label">Company Code</label>
		            	<div class="col-sm-4">
 							<input type="text" id="companycodeEdit" class="form-control" placeholder="Auto Generated" disabled>
 						</div>
 					<label for="companyname" class="col-sm-2 col-form-label">Company Name</label>
				    	<div class="col-sm-4">
				      		<input type="text" id="companynameEdit" class="form-control" placeholder="Type Company Name">
				    	</div>
				</div>
				<div class="form-row" style="margin-top: 10px">
				 	<label for="companyemail" class="col-sm-2 col-form-label">Email</label>
					    <div class="col-sm-4">
					      	<input type="text" id="companyemailEdit" class="form-control" placeholder="Type Email">
 						</div>
 				  	<label for="companyaddress" class="col-sm-2 col-form-label">Address</label>	
					    <div class="col-sm-4">
							<input style="height:100px"" type="text" id="companyaddressEdit" class="form-control" placeholder="Type Address">
				    	</div>
				</div>
				<div class="form-row" style="margin-top: -50px">
					<label for="companyphone" class="col-sm-2 col-form-label">Phone</label>
					    <div class="col-sm-4">
					      	<input type="text" id="companyphoneEdit" class="form-control" placeholder="Type Phone">
 						</div>
				</div>
		      </div>
		      <div class="modal-footer">
		     	<button type="button" class="btn btn-primary btn-edit-comp">Update</button>
		        <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		<!-- MODAL DELETE COMPANY -->
		<div class="modal fade" id="deleteCompanyModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		  <div class="modal-dialog modal-sm" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle">Delete Data Company</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <input type="hidden" id="DeleteButton"/>
		        <p>Are you sure to delete this data?</p>
		      </div>
		      <div class="modal-footer">
		     	<button type="button" class="btn btn-primary" id="btn-delete-comp">Delete</button>
		        <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
		      </div>
		    </div>
		  </div>
		</div>
		
		
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	
	<script type="text/javascript">
	
	/* var button = document.getElementById('btn-add');
	button.addEventListener('click', function(){
		console.log('ada event')
	});  */
	
	$(document).ready(function(){
		loadData();
		
		//BUTTON POP UP ADD
		$('#btn-add').on('click', function(){
			$.ajax({
				url:'${pageContext.request.contextPath}/company/getcodecompany',
				type: 'GET',
				success : function(data){
					$('#companycode').val(data);
				},
				dataType: 'json'
			});
			$('#addCompanyModal').modal();
		});
		
		//BUTTON SAVE PADA MODAL ADD UNTUK SAVE DATA
		$('.btn-add-comp').on('click', function(){
			var company = {
					code : $('#companycode').val(),
					name : $('#companyname').val(),
					email : $('#companyemail').val(),
					address : $('#companyaddress').val(),
					phone : $('#companyphone').val()
			};
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
		function convertToTable(data){
			var oTable = $('#compTable');
			var tBody = oTable.find('tBody');
			
			tBody.find('tr').remove();
			
			$.each(data, function(index, company){
				console.log(index, company);
				index++;
			var tableRow = '<tr>';
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
			tBody.append(tableRow);
			});
		}
		
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
			$('#editCompanyModal').modal();
		});
		
		//BUTTON UPDATE PADA MODAL ADD UNTUK UPDATE DATA
		$('.btn-edit-comp').click(function(){
			var company = {
				id : $('#EditButton').val(),
				code : $('#companycodeEdit').val(),
				name : $('#companynameEdit').val(),
				email : $('#companyemailEdit').val(),
				address : $('#companyaddressEdit').val(),
				phone : $('#companyphoneEdit').val()
			};
				console.log(company);
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
			$('#editCompanyModal').modal('hide');
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
				},
				dataType: 'json'
			});
			$('#deleteCompanyModal').modal();
		});
		
		//BUTTON DELETE UNTUK DELETE DATA
		$('#btn-delete-comp').click(function(){
			var company = {
				id: $('#DeleteButton').val()	
			};
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
</body>
</html>