<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
	<div id="container" style="width: 90%; margin: auto">
		<!-- start navbar -->
		<nav class="navbar navbar-expand-lg navbar-light bg-primary">
			<a class="navbar-brand" href="#">MARCOMM172</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-item nav-link active" href="#">Home</a> <a
						class="nav-item nav-link" href="#">Product</a> <a
						class="nav-item nav-link" href="#">Logout</a>
				</div>
			</div>
			<form class="form-inline">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</nav>
		<!-- end navbar -->
		<!-- start add and search button -->
		<div class="row" style="height: 50px;"></div>
		<div class="row justify-content-md-end" style="padding-bottom:10px">
			<button type="button" class="btn btn-primary"
				id="addBtn" style="width:80px">Add</button>
		</div>
		<div class="row justify-content-md-end" style="padding-bottom:10px">
			<button type="button" class="btn btn-primary" data-toggle="modal"
				data-target="#searchProductModal" style="width:80px">Search</button>
		</div>
		<!-- end of add and search button -->
		<hr />
		<table id="userTable" class="table">
			<thead class="thead-light">
				<tr>
					<th>No</th>
					<th>Employee</th>
					<th>Role</th>
					<th>Company</th>
					<th>username</th>
					<th>Created Date</th>
					<th>Created By</th>
					<th>Action</th>				
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
	<%@include file="/WEB-INF/pages/modal/add-user.html"%>
	<%@include file="/WEB-INF/pages/modal/edit-user.html"%>
	<%@include file="/WEB-INF/pages/modal/view-user.html"%>
</body>
<script type="text/javascript">
$(document).ready(function(){
	loadData();
	
	$(document).on('click','.btn-view-user',function(){
		var id = $(this).attr('id');
		$.ajax({
			url : '${pageContext.request.contextPath}/user/getbyid/'+id,
			type : 'GET',
			success : function(data) {
				 ;
				 $('#employeeView').val(data.mEmployeeId);
				 $('#roleView').val(data.mRoleId);
				 $('#usernameView').val(data.username);
				 $('#passwordView').val(data.password);
				 $('#rpasswordView').val(data.password);
				console.log(data);
				$('#viewUserModal').modal();
			},
			dataType : 'json'
		});
	
	});
	
	
	
	
	//membuka edit modal dan getby id from controller
	
		$(document).on('click','.btn-edit-user',function(){
								var id = $(this).attr('id');
								$.ajax({
									url : '${pageContext.request.contextPath}/user/getbyid/'+id,
									type : 'GET',
									success : function(data) {
										$('#EditId').val(data.id);
										/* $('#EditCreatedDate').val(data.createdDate); */
										$('#EditCreatedBy').val(data.createdBy);
										 $('#employeeEdit').val(data.mEmployeeId);
										 $('#roleEdit').val(data.mRoleId);
										 $('#usernameEdit').val(data.username);
										 $('#passwordEdit').val(data.password);
										console.log(data);
										$('#editUserModal').modal();
									},
									dataType : 'json'
								});
							
							});
	
	
		 $('#editButnModal').on('click', function(){
				var user = {
						 
						id : $('#EditId').val(),
						/* createdDate : $('#EditCreatedDate').val(), */
						createdBy : $('#EditCreatedBy').val(),
						username : $('#usernameEdit').val(),
						password : $('#passwordEdit').val(),
						mEmployeeId : $('#employeeEdit').val(),
						mRoleId : $('#roleEdit').val()
				 
				}
				$.ajax({
					url : '${pageContext.request.contextPath}/user/update',
					type : 'POST',
					contentType : 'application/json',
					data : JSON.stringify(user),
					success : function(data){
						console.log("data telah diupdate");
						$('#editUserModal').modal('hide');
						loadData();
					},
					error : function(){
						console.log("data error");
					}
				});
			}); 
	
 
	//delete user

	 $(document).on('click', '.btn-delete-user', function(){
		 var conf = confirm("Are you sure delete this data ?");
		 console.log("anda masuk delete");
		 if(conf == true){
			 var id = $(this).attr("id");
			/*  var user ={
						id: parseInt(id)
				} */
			 var id = $(this).attr("id");
			 
			 
			 $.ajax({
				 url : '${pageContext.request.contextPath}/user/delete/'+id,
				 type: 'DELETE',
				 success: function(data){
					 window.location = "${pageContext.request.contextPath}/user";
				 }, error : function(){
					 alert('delete data failed..!!');
					 console.log(id);
				 }
			 });
		 }
		 
		 return false;
	 }); 
	
	///*memanggil add modal*/
	$("#addBtn").on('click', function(){	 
		$('#addUserModal').modal();
	 });
	/*menutup add modal dan men save user ke controller  */
	 $('#addButnModal').on('click', function(){
		var user = {
				username : $('#username').val(),
				password : $('#password').val(),
				mEmployeeId : $('#employee').val(),
				mRoleId : $('#role').val()
		 
		}
		$.ajax({
			url : '${pageContext.request.contextPath}/user/save',
			type : 'POST',
			contentType : 'application/json',
			data : JSON.stringify(user),
			success : function(data){
				console.log("data telah disimpan");
				$('#addUserModal').modal('hide');
				loadData();
			},
			error : function(){
				$('#addUserModal').modal('hide');
				console.log("data error");
			}
		});
	}); 
	 /* ini adalah fungsi get all dr controller */
	function loadData(){
		$.ajax({
			url : '${pageContext.request.contextPath}/user/getall',
			type : 'GET',
			success : function(data){
				convertToTable(data);
			},
			 
			dataType : 'json'
		});
	}
	/* ini adalah fungsi memasukin all user ke tabel */
	function convertToTable(data){
		var oTable = $('#userTable');
		var tBody = oTable.find('tBody');
		tBody.find('tr').remove();
		$.each(data,function(index,user){
			index++;
			var tRow = '<tr>';
			tRow +='<td>';
				tRow +=index;
			tRow +='</td>';
			tRow +='<td>';
				tRow +=user.mEmployeeId; 
 			tRow +='</td>';
			tRow +='<td>';
				tRow +=user.mRoleId;
			tRow +='</td>';
			tRow +='<td>';
				tRow +=user.mRoleId;
			tRow +='</td>';
			tRow +='<td>';
				tRow +=user.username;
			tRow +='</td>';
			tRow +='<td>';
				tRow +=user.createdDate;
			tRow +='</td>';
			tRow +='<td>';
				tRow +=user.createdBy;
			tRow +='</td>';
			tRow +='<td>';
			tRow +='<a id="'+user.id+'" href="#"  class="btn btn-warning btn-edit-user" style="color: #e01616;">E</a>';/*  */
			tRow +=' ';
			tRow +='<a id="'+user.id+'" href="#"   class="btn btn-warning btn-view-user" style="color: #e01616;">V</a>';/* */
			tRow +=' ';
			tRow +='<a id="'+user.id+'" href="#"  class="btn btn-warning btn-delete-user" style="color: #e01616;">D</a>';/*  */
			tRow +='</td>';
			tRow +='</tr>';
			tBody.append(tRow);
		});
	}
})
	
</script>
</html>