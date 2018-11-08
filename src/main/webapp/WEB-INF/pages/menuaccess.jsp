<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Menu Access</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css">
<link href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/assets/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet">
<link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<style>
input.parsley-error
		{
		  color: #ff99ff !important;
		  background-color: #F2DEDE !important;
		  border: 1px solid #EED3D7 !important;
		}
</style>
</head>
<body>
	<div id = "container" style="width : 1000px; margin: auto">
	
	<!-- HEADER -->
	<div class="card text-white bg-primary mb-3" style="width: 100%;">
  			<div class="card-header">List Menu Access</div>
		</div>
		<div class="row">
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
		        <a class="nav-link" href="#">List Menu Access<span class="sr-only">(current)</span></a>
		      </li>
		    </ul>
		  </div>
		</nav>
		
		<!-- BUTTON ADD -->
		<table id="tableInput">
	<thead>
			<tr>
				<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
				<th><a class="btn btn-primary" id="btnadd" href="#">Add</a></th>
				</tr>
	<!-- BUTTON SEARCH -->
		<tr>
    			<th></th>
						<th><input type="text" class="form-control" placeholder="Select Role Code" id="data1" data-index="1" style="padding-right:10px;width:90%;"></th>
						<th><input type="text" class="form-control" placeholder="Select Role Name" id="data2" data-index="2" style="padding-right:10px;width:90%;"></th>
						<th><input type="text" class="form-control" placeholder="Created Date" id="data3" data-index="4" style="padding-right:10px;width:90%;"></th>
						<th><input type="text" class="form-control" placeholder="Created By" id="data4" data-index="5" style="padding-right:10px;width:90%;"></th>
    			<th><a class="btn btn-warning" id="btn-search" href="#">Search</a></th>
    			</tr>
    			</thead>
    			</table>
    			<!-- TABLE -->
    			<table class="table table-striped table-hover DataTable" id="menuTable" style="width : 125%">
			<thead>
				<tr>
					<th>No</th>
					<th>Role Code</th>
					<th>Role Name</th>
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
	<%@include file="/WEB-INF/pages/modal/add-menuaccess.jsp" %>
	<%@include file="/WEB-INF/pages/modal/update-menuaccess.jsp" %>
	<%@include file="/WEB-INF/pages/modal/delete-menuaccess.jsp" %>
	<%@include file="/WEB-INF/pages/modal/view-menuaccess.jsp" %>
</body>

	<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
	<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script> -->
    
	
	<script type="text/javascript">
	
	$(document).ready(function(){
		$('#data3').datepicker({
			format:'yyyy-mm-dd',
			autoclose:true,
			uiLibrary:'bootstrap4'
		});
		 loadData(); 
		
		/* BUTTON POP UP */
		$('#btnadd').on('click',function(){
			$('.addId').prop('checked',false);
			$.ajax({
				/* url:'${pagecontext.request.contextPath}/menu/getcode',
				type:'GET',
				success : function(data){
					$('#menucode').val(data);
				}, */
				dataType:'json'
			});
			$('#addModal').modal();
		});
		/* save 8*/
		$('.btn-save').on('click', function(e){
			
			
			var roleId= $('#add-role').val(); 
			 var menus =[]; 
				 $('#menuId:checked').each(function (){
				  var menuId={
						  id:$(this).val()		  
				  }
				  menus.push(menuId);
				 }); 
			
			
			/* for(var i=0;i<l;i++){ */
				var menuAccess = {
						menus :menus,
						role :{
							id: roleId		 
						}
				};
				/* document.getElementById("notif").innerHTML ="Data saved! new code has been added with code : "+role.code+"!";
				$('#notif').show('slow').delay(1000).hide('slow'); */
				 $.ajax({
					  url :'${pageContext.request.contextPath}/access/save',
					  type : 'POST',
					  contentType :'application/json',
					  data : JSON.stringify(menuAccess),
					   beforeSend : function (){
						  console.log('sebelom post');
					  },
					  success: function (data) {
						  console.log(data)
						  console.log('data saved successfully')
						   loadData(); 
					  },
					  error : function(){
						  console.log('failed to save data')
					  }
				 });
					/* } */
			
			$('#addModal').modal('hide');
			
			});
  		/*  load data */
  		function loadData(){
  			$.ajax({
  				url:'${pageContext.request.contextPath}/access/getall',
  				type:'GET',
  				beforeSend : function(){
  					console.log('before send');
  				},
  				success : function(output){
  					console.log(output);
  					convertToTable(output);
  				},
  				dataType:'json'
  			});
  		} 
  		/* convert to table */
  		function convertToTable(data){
  			oTable=$('#menuTable').DataTable();
  			oTable.rows('tr').remove();
  			$.each(data,function(index,access){
  				index++;
  				var tRow ='<a id="'+access.id+'"href="#" class="btn-update-access">U</a>';
  				tRow +=' ';
  				tRow +='<a id="'+access.id+'"href="#" class="btn-view-access">V</a>';
  				tRow +=' ';
  				tRow +='<a id="'+access.id+'"href="#" class="btn-delete-access">D</a>';
  				oTable.row.add([index,access.role.code,access.role.roleName,access.createdDate,access.createdBy,tRow]);
  			});
  			oTable.draw();
  		};
  		/* search */
  		oTable=$('#menuTable').DataTable({
  			'sDom':'tip',
  			'ordering':false
  		});
  		$('#btn-search').on('click',function(){
  		$('#btn-search').on('click',function(){
  			for(var i=1;i<5;i++){
  				oTable
  				.column($('#data'+i).data('index'))
  				.search($('#data'+i).val())
  				.draw()
  			}
  		});
  		});
  		/* view */
  		$(document).on('click','.btn-view-access',function(){
  			var id=$(this).attr('id');
  			$('.viewId').prop('checked',false);
  			
  			$.ajax({
  				url:'${pageContext.request.contextPath}/access/getmenuaccess/'+id,
  				type:'GET',
  				success:function(data){
  					/* var in= data.menu.id;*/
  					 $('#view-role').val(data.role.id);
  					$('#ViewAccess').val(data.id);
  					for(var i=0;i<data.menus.length;i++){
  						$('#'+data.menus[i].id+'').prop('checked',true);   			
  					}			
  				},
  				dataType:'json'
  			});
  			$('#viewModal').modal();
  		});
  		/* pop up update */
  		$(document).on('click','.btn-update-access',function(){
  			var id=$(this).attr('id');
  			$('.updateId').prop('checked',false);
  			
  			$.ajax({
  				url:'${pageContext.request.contextPath}/access/getmenuaccess/'+id,
  				type:'GET',
  				success:function(data){
  					/* var in= data.menu.id;*/
  					 $('#update-role').val(data.role.id);
  					$('#idAccess').val(data.id);
  					for(var i=0;i<data.menus.length;i++){
  						$('#'+data.menus[i].id+'').prop('checked',true);   			
  					}			
  				},
  				dataType:'json'
  			});
  			$('#updateModal').modal();
  		});
  		/* update data */
  		$('.btn-update').click(function(){
  			var id=$('#idAccess').val();
  			var roleId= $('#update-role').val(); 
			 var menus =[]; 
				 $('.updateId:checked').each(function (){
				  var menuId={
						  id:$(this).val()		  
				  }
				  menus.push(menuId);
				 });
				 var menuAccess = {
							menus :menus,
							role :{
								id: roleId		 
							}
					};
				 $.ajax({
					  url :'${pageContext.request.contextPath}/access/update/' +id,
					  type : 'POST',
					  contentType :'application/json',
					  data : JSON.stringify(menuAccess),
					   beforeSend : function (){
						  console.log('sebelom post');
					  },
					  success: function (data) {
						  console.log('data update successfully')
						   loadData(); 
					  },
					  error : function(){
						  console.log('failed to update data')
					  }
				 });
					
			
			$('#updateModal').modal('hide');
  		});
  		/* delete */
  		$(document).on('click','.btn-delete-access',function(){
  			var id=$(this).attr('id');
  			console.log(id);
  			$.ajax({
  				url:'${pageContext.request.contextPath}/access/getid/'+id,
  				type:'GET',
  				success:function(data){
  					$('#idDelete').val(data.id);
  					$('#mRoleDelete').val(data.role.id);
  					$('#mMenuDelete').val(data.menu.id);
  					$('#isDelete').val(data.isDelete);
  					$('#crDelete').val(data.createdBy);
  					$('#dateDelete').val(data.createdDate);
  					console.log(data);
  				},
  				dataType:'json'
  			});
  			$('#deleteModal').modal();
  		});
  		/* delete data */
  		$('#btnDelete').click(function(){
  			var access={
  					id:parseInt($('#idDelete').val()),
  					role:$('#mRoleDelete').val(),
  					menu:$('#mMenuDelete').val(),
  					isDelete:true,
  					createdBy:$('#crDelete').val(),
  					createdDate:$('#dateDelete').val()
  			}
  			console.log(JSON.stringify(access));
  			$.ajax({
  				url:'${pageContext.request.contextPath}/access/delete/' +access.id,
  				type:'DELETE',
  				contentType:'application/json',
  				data:JSON.stringify(access),
  				success:function(data){
  					console.log("data di delete");
  					loadData();
  					$('#deleteModal').modal('hide');
  				},
  				error :function(){
  					console.log("data kacau");
  				}
  			});
  		});
		});
	</script>
</html>

