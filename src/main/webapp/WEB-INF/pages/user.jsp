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

<style>input.parsley-error
		{
		  color: #B94A48 !important;
		  background-color: #F2DEDE !important;
		  border: 1px solid #EED3D7 !important;
		}

</style>

<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css"/>
<meta charset="ISO-8859-1">
<title>User</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css" rel="stylesheet" />
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
						class="nav-item nav-link" href="#">User</a>
				</div>
			</div>

		</nav>
		<br>
		<!-- end navbar -->
		<!-- start add and search button -->
		<!-- <div class="row" style="height: 50px;"></div>
				<div class="row" style="float:right; padding-bottom:10px; padding-top:10px">
			<div class="col">
				<a class="btn btn-primary" id="addBtn" href="#">Add</a>
			</div>
		</div> 

			<form>
			<div class="row" style="width: 100%; margin : auto">
   				<div class="col">
      				<input type="text" class="form-control" placeholder="Select Unit Code">
   				</div>
    			<div class="col">
      				<input type="text" class="form-control" placeholder="Select Unit Name">
    			</div>
    			<div class="col">
      				<input type="text" class="form-control" placeholder="Created">
    			</div>
    			<div class="col">
      				<input type="text" class="form-control" placeholder="Created By">
    			</div>
    			<a class="btn btn-warning" id="btn-search" href="#">Search</a>	
  			</div>
		</form> -->
		
		<p id="user-login" id="username" style="width: 50%;" class="text-primary" >Selamat Datang User!</p>
		<form action="${logoutUrl}" method="post" id="logoutForm">
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" /> <input class="btn btn-warning" type="submit"   value="logout" />
					</form>
					<br>
										 
		<table>
			<thead>
				<tr class="justify-content-end">
					<th >     </th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th  ><a class="btn btn-primary justify-content-end"
						id="addBtn" href="#">Add</a></th>
				</tr>
				<tr>
					<th></th>
					<th style="padding-left: 55px; padding-right: 5px;"><input
						type="text" class="form-conthol" placeholder="Employee"
						id="data1" data-index="1"
						style="padding-right: 45px; width: 100%;"></th>
					<th style="padding-left: 10px; padding-right: 5px;"><input
						type="text" class="form-conthol" placeholder="Role" id="data2"
						data-index="2" style="padding-right: 45px; width: 100%;"></th>
					<th style="padding-left: 10px; padding-right: 5px;"><input
						type="text" class="form-conthol" placeholder="Company"
						id="data3" data-index="3"
						style="padding-right: 45px; width: 100%;"></th>
					<th style="padding-left: 10px; padding-right: 5px;"><input
						type="text" class="form-conthol" placeholder="User Name"
						id="data4" data-index="4"
						style="padding-right: 45px; width: 100%;"></th>
					<th style="padding-left: 10px; padding-right: 5px;"><input
						type="text" class="form-conthol date-picker" placeholder="Created Date"
						id="data5" data-index="5"
						style="padding-right: 45px; width: 100%;"></th>
					<th style="padding-left: 10px; padding-right: 5px;"><input
						type="text" class="form-conthol" placeholder="Created By"
						id="data6" data-index="6"
						style="padding-right: 45px; width: 100%;"></th>
					<th style="padding-left: 10px;"><a class="btn btn-warning"
						id="btn-search" href="#">Search</a></th>
				</tr>
			</thead>
		</table>

		<br>











		<!-- end of add and search button -->
		<hr />
		<table id="userTable" class="table DataTable">
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
	
	<%@include file="/WEB-INF/pages/modal/add-user2.jsp"%>
	<%@include file="/WEB-INF/pages/modal/edit-user.html"%>
	<%@include file="/WEB-INF/pages/modal/view-user.html"%>
</body>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
 
<script type="text/javascript">
$(document).ready(function(){
	loadData();
	getUser();
	/* date picker */
	/* $('#createdDate').datepicker(); */
	 $('.date-picker').datepicker({
    format: 'yyyy-mm-dd' 
}); 
	
	/* membuat objek tabel */
	oTable = $('#userTable').DataTable({
		'sDom':'tip',
		'ordering':false
	});
	
	
	/* search */
		$('#btn-search').on( 'click', function () {
		for(var i = 1 ; i <= 6; i++){
			oTable
            .column( $('#data'+ i).data('index') )
            .search( $('#data'+ i).val() )
            .draw();			
		}
    } );
	
	
	
	
	$(document).on('click','.btn-view-user',function(){
		var id = $(this).attr('id');
		$.ajax({
			url : '${pageContext.request.contextPath}/user/getbyid/'+id,
			type : 'GET',
			success : function(data) {
				 ;
				 $('#employeeView').val(data.mEmployeeId);
				 $('#roleView').val(data.mRole.id);
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
										 $('#roleEdit').val(data.mRole.id);
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
						mRole :{
							id: $('#roleEdit').val()
						} 
						
				 
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
		
		var validate= 		 $('#addUserForm').parsley();
		
		 if(validate.validate()){
			 var user = {
						username : $('#username').val(),
						password : $('#password').val(),
						mEmployeeId : $('#employee').val(),
						mRole :{
							id: $('#role').val()
						}
				 
				}
				$.ajax({
					 headers: {
					        'X-CSRFToken': $('meta[name="token"]').attr('content')
					    },
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
		}
		
	}); 
	
	
	 /* ini adalah fungsi get user login dr controller */
		function getUser(){
			$.ajax({
				url : '${pageContext.request.contextPath}/fungsi/getuserlogin',
				type : 'GET',
				success : function(data){
				 	$('#user-login').val(data);
					 
					 document.getElementById("user-login").innerHTML="Selamat Datang " +data+ "!";
				}
			}) 
		 }
	
	 /* ini adalah fungsi get all dr controller */
	function loadData(){
		$.ajax({
			 headers: {
			        'X-CSRFToken': $('meta[name="token"]').attr('content')
			    },
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
		oTable = $('#userTable').DataTable();
		oTable.rows( 'tr' ).remove();
		$.each(data,function(index,user){	
			index++;
			var tRow ='<a id="'+user.id+'" href="#" class="btn btn-warning btn-edit-user" style="color: #e01616;">E</a>';
			tRow +=' ';
			tRow +='<a id="'+user.id+'" href="#" class="btn btn-warning btn-view-user" style="color: #e01616;">V</a>';
			tRow +=' ';
			tRow +='<a id="'+user.id+'" href="#" class="btn btn-warning btn-delete-user" style="color: #e01616;">D</a>';
			 oTable.row.add([index,user.mEmployeeId, user.mRole.roleName,user.mEmployeeId,user.username,user.createdDate,user.createdBy,tRow]);
		
/* 		var oTable = $('#userTable');
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
			tRow +='<a id="'+user.id+'" href="#"  class="btn btn-warning btn-edit-user" style="color: #e01616;">E</a>'; 
			tRow +=' ';
			tRow +='<a id="'+user.id+'" href="#"   class="btn btn-warning btn-view-user" style="color: #e01616;">V</a>'; 
			tRow +=' ';
			tRow +='<a id="'+user.id+'" href="#"  class="btn btn-warning btn-delete-user" style="color: #e01616;">D</a>';
			tRow +='</td>';
			tRow +='</tr>';
			tBody.append(tRow); */
		});
		oTable.draw();
	}
})
	
</script>
</html>