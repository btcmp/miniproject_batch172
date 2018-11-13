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
<link href="${pageContext.request.contextPath}/resources/assets/css/dashboard.css" rel="stylesheet" />
<script src='http://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js'></script>
<link href="${pageContext.request.contextPath}/resources/assets/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="container-fluid">
		<div class="row">
		<!-- DASHBOARD -->
			<nav class="col-md-2 d-none d-md-block bg-primary sidebar">
				<div class="sidebar-sticky">
					<ul class="nav flex-column">
						<li class="nav-item"><a class="nav-link text-white" href="#">
								Dashboard </a></li>
						<li class="nav-item"><a class="nav-link text-white master" id="masterMenu"
							href="#"> Master</a>
							<ul class=" nav flex-column" id="selectMenu" data-index="1" style="width :100%; display: none;" >
							</ul>
						</li>
						<li class="nav-item"><a class="nav-link text-white master" id="masterMenu2"
							href="#"> Transaksi</a>
							<ul class=" nav flex-column" id="selectMenu2" data-index="1" style="width :100%; display: none;" >
							</ul>
						</li>
						<li class="nav-item"><a class="nav-link text-white"
							href="${logoutUrl}"> Logout </a></li>
					</ul>
				</div>
			</nav>
			<!-- END DASHBOARD -->
			<div role="main" class="col-md-8 ml-sm-auto col-lg-10">
				<div class="card text-white bg-primary mb-3">
					<div class="card-header">User</div>
				</div>
			 
			<a href="#"><p style="float: left; width: 40%;" id="user-login" id="username" class="text-primary">Selamat
			Datang User!</p></a>
					
				</nav>
		 
		 <div class="form-row" style="float:left; padding:10px;">
			<a id="notification" class="text-white bg-info border rounded"></a>
		</div>
		<br>
		 
				
				
				
				
				 <table style="width:100%"  >
			<thead>
				
				
				<thead>
			 
				<tr>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th>
						<div>
							<a class="btn btn-primary  " id="addBtn" href="#"
								style="float: right; padding: 5px; width: 100%;">Add</a>
						</div>
					</th>
				</tr>
				<tr>
					<th></th>
					<th><select class="form-control" id="data1" data-index="1"
						style="padding-right: 10px; width: 100%;">
							<option value="" selected>-select employee here-</option>
							<c:forEach var="employee" items="${allEmployee}">
								<option value="${employee.employeeName}">${employee.employeeName}</option>
							</c:forEach>
					</select></th>

					<th><select class="form-control" id="data2" data-index="2"
						style="padding-right: 10px; width: 100%;">
							<option value="" selected>-select role here-</option>
							<c:forEach var="role" items="${roles}">
								<option value="${role.roleName}">${role.roleName}</option>
							</c:forEach>
					</select></th>
					<th><select class="form-control" id="data3" data-index="3"
						style="padding-right: 10px; width: 100%;">
							<option value="" selected>-select cmpny-</option>
							<c:forEach var="company" items="${compenies}">
								<option value="${company.name}">${company.name}</option>
							</c:forEach>
					</select></th>
					<th><input type="text" class="form-control"
						placeholder="User Name" id="data4" data-index="4"
						style="padding-right: 10px; width: 100%;"></th>
					<th><input type="text" class="form-control date-picker"
						placeholder="Created Date" id="data5" data-index="5"
						style="padding-right: 10px; width: 75%;"></th>
					<th><input type="text" class="form-control"
						placeholder="Created By" id="data6" data-index="6"
						style="padding-right: 10px; width: 100%;"></th>
					<th><a class="btn btn-warning" id="btn-search" href="#"
						style="float: right; padding: 5px; width: 100%;">Search</a></th>
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
		</div>
 
	<%@include file="/WEB-INF/pages/modal/add-user2.jsp"%>
	<%@include file="/WEB-INF/pages/modal/edit-user.html"%>
	<%@include file="/WEB-INF/pages/modal/view-user.html"%>
	</div>
	 
</body>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script> 
<script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js" type="text/javascript"></script>


<script type="text/javascript">
$(document).ready(function(){
	loadData();
	getUser();
	/* date picker */
	/* $('#createdDate').datepicker(); */
	 $('.date-picker').datepicker({
    format: 'yyyy-mm-dd' ,
    autoclose: true,
	uiLibrary: 'bootstrap4',
}); 
	
	//
	//addvalidate
      Parsley.addValidator('namecheck',{
    	validateString: function(value){
    	var namesplitcek = value.split(" ");
    	splitcek = namesplitcek[0];
    	 xhr= $.ajax({
    			url : '${pageContext.request.contextPath}/user/getbyname/'+splitcek,
    			dataType : 'json',
    			type : 'GET'
    		});
    	 return xhr.then(function(data){
    		 var nama=$('#nameEditCheck').val();
    		 if(nama==$('#usernameEdit').val()){
    			 $('#nameEditCheck').val(1)
    		 	 return true
    	   	 }else if(data.length==0){
    			 return true 
    		 }else{
    			 return $.Deferred().reject()
    		 }
    	 });
    	}
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
				 $('#employeeView').val(data.employee.employeeName);
				 $('#roleView').val(data.mRole.roleName);
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
								 $('#addEditForm').parsley().reset();
								$.ajax({
									url : '${pageContext.request.contextPath}/user/getbyid/'+id,
									type : 'GET',
									success : function(data) {
										$('#EditId').val(data.id);
										/* $('#EditCreatedDate').val(data.createdDate); */
										$('#EditCreatedBy').val(data.createdBy);
										 $('#employeeEditPost').html(data.employee.employeeName).val(data.employee.id);
										 $('#roleEdit').val(data.mRole.id);
										 $('#usernameEdit').val(data.username);
										 $('#nameEditCheck').val(data.username);
										 $('#passwordEdit').val(data.password);
										 $('#rpasswordEdit').val(data.password);
										console.log(data);
										$('#editUserModal').modal();
									},
									dataType : 'json'
								});
								loadEmployeesNotUse();
							
							});
	
	//menutup edit modal dan melempar data ke kontroller
	 $('#editButnModal').on('click', function(){
		
		var validate= 		 $('#addEditForm').parsley();
		validate.validate();		
	}); 
	
	$('#addEditForm').parsley().on('form:success', function(){
		var user = {
				 
				id : $('#EditId').val(),
				/* createdDate : $('#EditCreatedDate').val(), */
				createdBy : $('#EditCreatedBy').val(),
				username : $('#usernameEdit').val(),
				password : $('#passwordEdit').val(), 
				employee :{
					id: $('#employeeEdit').val()
				} ,
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
				console.log(data);
				$('#editUserModal').modal('hide');
				loadData();
				document.getElementById("notification").innerHTML = "Data Saved! New User has been edite with username: "+user.username+"!";
				$('#notification').show('slow').delay(3500).hide('slow');
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
					 loadData();
					 /* window.location = "${pageContext.request.contextPath}/user"; */
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
		$('#addUserModal').modal('show');
		 $('#addUserForm').parsley().reset();
		loadEmployeesNotUse();
	 });
	/*menutup add modal dan men save user ke controller  */
	 $('#addButnModal').on('click', function(){
		
		var validate= 		 $('#addUserForm').parsley();
		validate.validate();		
	}); 
	
	$('#addUserForm').parsley().on('form:success', function(){
		 var user = {
					username : $('#username').val(),
					password : $('#password').val(),
					
					employee :{
						id: $('#employee').val()
					},
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
					$('#addUserForm').trigger("reset");
					/*  window.location = "${pageContext.request.contextPath}/user"; */
					document.getElementById("notification").innerHTML = "Data Saved! New User has been added with code: "+user.username+"!";
					$('#notification').show('slow').delay(5500).hide('slow');
					loadData();  

				},
				error : function(){
					$('#addUserModal').modal('hide'); 
					console.log("data error");
				}
			});
	
	});
	
	
	
	
	
	 /* ini adalah fungsi get user login dr controller */
		function getUser(){
			$.ajax({
				url : '${pageContext.request.contextPath}/user/getrole',/* fungsi/getuserlogin *//*user/getrole*/
				type : 'GET',
				success : function(data){
				 	$('#user-login').val(data);
					 
					 document.getElementById("user-login").innerHTML="Selamat Datang role " +data+ "!";
				}
			}) 
		 }
	 
	 
		 /* get Employee Not Use */
		
		 function  loadEmployeesNotUse(){
			$.ajax({

				 url : '${pageContext.request.contextPath}/employee/getemployeesnotuse',
				type : 'GET',
				dataType : 'json',
			 success : function(data){
					console.log(data);
					$('.employee').empty();
					 $('#employee').append('<option value="" selected>Choose...</option>')	; 		 
					 $.each(data,function(idx, vl){
					$('.employee').append('<option value="'+ vl.id+'">'+vl.employeeName+'</option>')	 
					 
					 });
			 }	 
			});	 
		}
		 
		 function createSelectEmployee(data){
			 $.each(data,function(index,employee){	
				 $('#employee').append("<option value="+employee.id+">"+employee.employeeName+"</option>");				 
			 });
		 
			/* $("p").append("Some appended text."); */
			/*  $('select .employee').append("<option value="+employee.id+">"+employee.employeeName+"</option>");
	 			 */
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
			var tRow ='<a id="'+user.id+'" href="#" class="btn-edit-user"><span class="oi oi-pencil"></span></a>';
			tRow +=' ';
			tRow +='<a id="'+user.id+'" href="#" class="btn-view-user"><span class="oi oi-magnifying-glass"></span></a>';
			tRow +=' ';
			tRow +='<a id="'+user.id+'" href="#" class="btn-delete-user"><span class="oi oi-trash"></span></a>';
			 oTable.row.add([index,user.employee.employeeName, user.mRole.roleName,user.employee.company.name,user.username,user.createdDate,user.createdBy,tRow]);
		
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
		
		/* DROPDOWN MENU */
		
	$.ajax({
		url : '${pageContext.request.contextPath}/access/getall',
		type : 'GET',
		success : function(data4) {
			
			 if(data4[0].role.roleName == 'Administrator'){
				  var idMenu=0;
				  idMenu=data4[0].id;
				   getMenubyRole(idMenu);
				   
				  
			 }
		},
		dataType : 'json'
	});
		
	function getMenubyRole(idMenu){
		
		 $.ajax({
				url : '${pageContext.request.contextPath}/access/getmenuaccess/'+idMenu,
				type : 'GET',
				success : function(data2) {
					$('#selectMenu').empty();
					$('#selectMenu2').empty();
					/* $('#selectMenu').append('<option value="" selected> Menu Anda</option>');	 */
					var tinggi=0;
					var tinggi2=0;
					 $.each(data2.menus,function(index,menu){
						 
						
						  if(menu.parentId==1){
							$('#selectMenu').append('<li   class="nav-item"><a class="nav-link text-black  " href="${pageContext.request.contextPath}/'+menu.controller+'"> '+menu.name+'</a></li>');						 
						/* 	$('#selectMenu').height(tinggi);
							tinggi=tinggi+80; */
						  }else if(menu.parentId==2){
							 $('#selectMenu2').append('<li   class="nav-item"><a class="nav-link text-black  " href="${pageContext.request.contextPath}/'+menu.controller+'"> '+menu.name+'</a></li>');
							/*  $('#selectMenu2').height(tinggi2);
							tinggi2=tinggi2+100000; */
							  
						  }
						 /* $('#selectMenu').append('<form action="${pageContext.request.contextPath}/'+menu.controller+'"><input type="submit" value="'+menu.name+'"/></form>'); */
						 
							/* <a id="'+user.id+'" href="#" class="btn-delete-user"><span class="oi oi-trash"></span></a> */
					 
							
							 
					 });
					 
					 
						  
						  
					 
				},
				dataType : 'json'
			});
		
	}	
	
	$('#masterMenu').click(function(){
		$('#selectMenu').toggle();
	});
	$('#masterMenu2').click(function(){
		$('#selectMenu2').toggle();
	});
	
		
})
	
</script>
</html>