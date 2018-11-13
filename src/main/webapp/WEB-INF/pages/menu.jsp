<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta name="_csrf" content="${_csrf.token}"/>
<!-- default header name is X-CSRF-TOKEN -->
<meta name="_csrf_header" content="${_csrf.headerName}"/>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<meta charset="ISO-8859-1">
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/assets/img/favicon.png" />
<title>Menu</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css">
<link href="${pageContext.request.contextPath}/resources/assets/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet">
<link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css" rel="stylesheet" type="text/css" />
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
	 <div class = "container-fluid">
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
			</nav><!-- END DASHBOARD --> 
	
		<!-- HEADER -->		
		<div role="main" class="col-md-8 ml-sm-auto col-lg-10">
		<div class="card text-white bg-primary mb-3" style="width: 100%;">
  			<div class="card-header">List Menu</div>
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
		        <a class="nav-link" href="#">List Menu <span class="sr-only">(current)</span></a>
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
				<th><a class="btn btn-primary" id="btn-add" href="#">Add</a></th>
				</tr>
				<th><p id="notif" style="width:100%; display:none" class="text-white bg-info border rounded"></p></th>
		<!-- BUTTON SEARCH -->		
				<tr>
    			<th></th>
						<th><input type="text" class="form-control" placeholder="Menu Code" id="data1" data-index="1" style="padding-right:10px;"></th>
						<th><input type="text" class="form-control" placeholder="Menu Name" id="data2" data-index="2" style="padding-right:10px;"></th>
						<th><input type="text" class="form-control" placeholder="Created Date" id="data3" data-index="4" style="padding-right:10px;"></th>
						<th><input type="text" class="form-control" placeholder="Created By" id="data4" data-index="5" style="padding-right:10px;"></th>
    			<th><a class="btn btn-warning" id="btn-search" href="#">Search</a></th>
    			</tr>
    			</thead>
    			</table>	
		 <!-- TABLE -->
		<table class="table table-striped table-hover DataTable" id="menuTable" style="width : 125%">
			<thead>
				<tr>
					<th>No</th>
					<th>Code</th>
					<th>Menu Name</th>
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
	
	<!-- MODAL SAVE-->
		 <div class="modal fade" id="addMenuModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle">Add Menu</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <form id="saveForm" data-parsley-validate>
		      <div class="modal-body">
		      
		        <input type="hidden" id="AddButton"/>
		        <div class="form-group">
				    <div class="col">
				    	<label for="menucode">Menu Code</label>
 						<input type="text" id="menucode" class="form-control" placeholder="Auto Generated" readonly>
 						</div>
				    <div class="col">
				    	<label for="menuname">Menu Name</label>
				      <input type="text" id="menuname" class="form-control" placeholder="Type Menu Name" required>
				      <div class="invalid-feedback">
				      harus isi woy!!!!
				      </div>
				    </div>
				</div>
				<div class="form-group" style="margin-top: 10px">
				    <div class="col">
				    	<label for="menucontroller">Controller</label>
				      	<input type="text" id="menucontroller" class="form-control" placeholder="Type Controller" required>
				      	<div class="invalid-feedback">
				      harus isi woy!!!!
				      </div>
 						</div>
				    <div class="col">
				    	<label for="menuparent">Parent</label>
				      <input type="text" id="menuparent" class="form-control" placeholder="">
				    </div>
				</div>
				<div class="modal-footer">
		        <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
		        <button type="submit" class="btn btn-primary btn-add-menu">Save</button>
		      </div>
		    </div>
		    </form>
		  </div>
		</div> 
		</div>
		
		<!-- MODAL UPDATE -->
		 <div class="modal fade" id="updatemodal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle">Update Menu</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <form id="updateform" data-parsley-validate>
		      <div class="modal-body">
		        <input type="hidden" id="Updateid"/>
		        <div class="form-group" >
				    <div class="col">
				    	<label for="menucode">Menu Code</label>
 						<input type="text" id="updatecode" class="form-control" placeholder="Auto Generated" readonly>
 						</div>
				    <div class="col">
				    	<label for="menuname">Menu Name</label>
				      <input type="text" id="updatename" class="form-control" placeholder="Type Menu Name" required>
				    </div>
				</div>
				<div class="form-group" style="margin-top: 10px">
				    <div class="col">
				    	<label for="menucontroller">Controller</label>
				      	<input type="text" id="updatecontroller" class="form-control" placeholder="Type Controller" required>
 						</div>
				    <div class="col">
				    	<label for="menuparent">Parent</label>
				      <input type="text" id="updateparent" class="form-control" placeholder="">
				    </div>
				</div>
				</div>
				<div class="modal-footer">
		        <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
		        <button type="button" class="btn btn-primary" id="btnUpdate">Update</button>
		      </div>
		      </form>
		    </div>
		  </div>
		</div> 
		</div>
		
		<!-- MODAL VIEW -->
		<div class="modal fade" id="viewMenuModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle">View Menu</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <input type="hidden" id="ViewButton"/>
		        <div class="form-group">
				    <div class="col">
				    	<label for="viewcode">Menu Code</label>
 						<input type="text" id="viewcode" class="form-control" readonly>
 						</div>
				    <div class="col">
				    	<label for="viewname">Menu Name</label>
				      <input type="text" id="viewname" class="form-control" readonly>
				    </div>
				</div>
				<div class="form-group" style="margin-top: 10px">
				    <div class="col">
				    	<label for="viewcontroller">Controller</label>
				      	<input type="text" id="viewcontroller" class="form-control" readonly>
 						</div>
				    <div class="col">
				    	<label for="viewparent">Parent</label>
				      <input type="text" id="viewparent" class="form-control" readonly>
				    </div>
				</div>
				<div class="modal-footer">
		        <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
		      </div>
		    </div>
		  </div>
		</div>
		</div>
		
		<!-- MODAL DELETE -->
		<div class="modal fade" id="deleteMenuModal" tabindex="-1" role="dialog" aria-labelledby="centerTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="centerTitle">you want to delete?
        <input type="hidden" id="idDelete"/>
        <input type="hidden" id="codeDelete"/>
        <input type="hidden" id="nameDelete"/>
        <input type="hidden" id="controllerDelete"/>
        <input type="hidden" id="isDelete"/>
        <input type="hidden" id="crDelete"/>
        <input type="hidden" id="dateDelete"/>
        </h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
<!--       <div class="modal-body"> -->
<!--       <input type="hidden" id="id-delete"/> -->
<!--       </div> -->
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
        <button type="button" class="btn btn-warning" id='btnDelete'>Yes</button>
      </div>
    </div>
  </div>
</div>
	</body>
		
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
    
	
	<script type="text/javascript">
	
	/* var button = document.getElementById('btn-add');
	button.addEventListener('click', function(){
		console.log('ada event')
	});  */
	
	$(document).ready(function(){
		//alert('DOM Html is ready');
		$('#data3').datepicker({
		format :'yyyy-mm-dd',
		autoclose:true,
		uiLibrary:'bootstrap4'
		});
		loadData();
		createMenu();
		 /* BUTTON POP UP */  
		$('#btn-add').on('click', function(){
			$.ajax({
				url:'${pageContext.request.contextPath}/menu/getcode',
				type: 'GET',
				success : function(data){
					$('#menucode').val(data);
				},
				dataType: 'json'
			});
			$('#addMenuModal').modal();
		});
		/*  SAVE ADD DATA */ 
		$('.btn-add-menu').on('click', function(){
			var validate=$('#saveForm').parsley();
			if(validate.validate()){
				var menu = {
						code : $('#menucode').val(),
						name : $('#menuname').val(),
						controller : $('#menucontroller').val(),
						parentId : $('#menuparent').val()
				};
				console.log(menu);
				document.getElementById("notif").innerHTML ="Data saved! new code has been added with code : "+menu.code+"!";
				$('#notif').show('slow').delay(1000).hide('slow');
				$.ajax({
					url:'${pageContext.request.contextPath}/menu/save',
					type: 'POST',
					contentType: 'application/json',
					data: JSON.stringify(menu),
					success: function(data){
						console.log("data berhasil disimpan");
						loadData();
						$('#menucode').val("");
						$('#menuname').val("");
						$('#menucontroller').val("");
						$('#menuparent').val("");
						 $('#addMenuModal').modal('hide'); 
					},
					error : function(){
						console.log("data gagal disimpan");
						/* $('#addMenuModal').modal('hide'); */
					}
					
			});
			}
		});
		/* load data/getall */
	function loadData(){
		$.ajax({
			url:'${pageContext.request.contextPath}/menu/getall',
			type:'GET',
			beforeSend:function(){
				console.log('before send');
			},
			success:function(output){
				console.log(output);
				convertToTable(output);
			},
			dataType:'json'
		});	
	}
		/*  search */ 
		oTable = $('#menuTable').DataTable({
			 'sDom':'tip',
			'ordering':false 
		});
		$('#btn-search').on('click',function(){
		$('#btn-search').on('click',function(){
			for(var i=1 ; i<= 5;i++){
				oTable
				.column($('#data'+i).data('index'))
				.search($('#data'+i).val())
				.draw()
			}
		});
		});
	/* convert to table */
	function convertToTable(data){
		 oTable=$('#menuTable').DataTable();
//		var tBody=oTable.find('tBody');
//		tBody.find('tr').remove();
		oTable.rows('tr').remove();
		$.each(data,function(index,menu){
//			console.log(index,menu)
			index++;
			var tRow ='<a id="'+menu.id+'" href="#" class="btn-update-menu"><span class="oi oi-pencil"></span></a>';
			tRow +=' ';
			tRow +='<a id="'+menu.id+'" href="#" class="btn-view-menu"><span class="oi oi-magnifying-glass"></span></a>';
			tRow +=' ';
			tRow +='<a id="'+menu.id+'" href="#" class="btn-delete-menu"><span class="oi oi-trash"></span></a>';
			oTable.row.add([index,menu.code,menu.name,menu.createdBy,menu.createdDate,tRow]);
			/* var tableRow="<tr>";
				tableRow +="<td>";
					tableRow += index;
				tableRow +="</td>";
				tableRow +="<td>";
					tableRow += menu.code;
				tableRow +="</td>";
				tableRow +="<td>";
					tableRow += menu.name;
				tableRow +="</td>";
				tableRow +="<td>";
					tableRow += menu.createdDate;
				tableRow +="</td>";
				tableRow +="<td>";
					tableRow += menu.createdBy;
				tableRow +="</td>";	
				tableRow +="<td>";
					tableRow += "<a id="+menu.id+" class='btn btn-danger btn-sm btn-delete-menu'>Delete</a>";
					tableRow += "<a>  </a>";
					tableRow += "<a id="+menu.id+" class='btn btn-warning btn-sm btn-update-menu'>Update</a>";
					tableRow += "<a>  </a>";
					tableRow += "<a id="+menu.id+" class='btn btn-warning btn-sm btn-view-menu'>View</a>";
				tableRow +="</td>";
			tableRow +="</tr>";
		tBody.append(tableRow);
	 */	});
		oTable.draw();
	};
	/* pop up view */
	$(document).on('click','.btn-view-menu',function(){
		var id=$(this).attr('id');
		console.log(id);
		$.ajax({
			url:'${pageContext.request.contextPath}/menu/getid/'+id,
			type:'GET',
			success:function (data){
				$('#Viewbutton').val(data.id);
				$('#viewcode').val(data.code);
				$('#viewname').val(data.name);
				$('#viewcontroller').val(data.controller);
				$('#viewparent').val(data.parentId);
				console.log(data);
			},
			dataType:'json'
		});
		$('#viewMenuModal').modal();
	});
	/* Pop up update */ 
	$(document).on('click','.btn-update-menu', function(){
		 var id=$(this).attr('id');
		console.log(id);
		$.ajax({
			url:'${pageContext.request.contextPath}/menu/getid/'+id,
			type:'GET',
			success:function (data){
			 	 $('#Updateid').val(data.id);
				$('#updatecode').val(data.code);
				$('#updatename').val(data.name);
				$('#updatecontroller').val(data.controller);
				$('#updateparent').val(data.parentId); 
				console.log(data);
			},
			dataType:'json'
		}); 
		$('#updatemodal').modal();
	});
	/* Update data */
	   $('#btnUpdate').click (function(){
		   var validate=$('#saveForm').parsley();
			if(validate.validate()){
		var menu = {
				id	: $('#Updateid').val(),
				code : $('#updatecode').val(),
				name : $('#updatename').val(),
				controller : $('#updatecontroller').val(),
				parentId : $('#updateparent').val()
		};
		console.log(menu);
		document.getElementById("notif").innerHTML ="Data saved! new code has been update with code";
		$('#notif').show('slow').delay(1000).hide('slow');
		$.ajax({
			url:'${pageContext.request.contextPath}/menu/update/' +menu.id,
			type: 'POST',
			contentType: 'application/json',
			data: JSON.stringify(menu),
			success: function(data){
				console.log("data berhasil diupdate");
				loadData();
				$('#updatemodal').modal('hide');
			}
		});
		
	};
	   });
	/* Pop up delete */
	$(document).on('click','.btn-delete-menu',function(){
		var id =$(this).attr('id');
		$.ajax({
			url:'${pageContext.request.contextPath}/menu/getid/'+id,
			type:'GET',
			success:function(data){
				$('#idDelete').val(data.id);
				$('#codeDelete').val(data.code);
				$('#nameDelete').val(data.name);
				$('#controller').val(data.controller);
				$('#isDelete').val(data.isDelete);
				$('#crDelete').val(data.createdBy);
				$('#dateDelete').val(data.createdDate);
				console.log(data);
			},
			dataType:'json'
		});
		$('#deleteMenuModal').modal();
	});
	/* Delete Data */ 
	$('#btnDelete').click(function(){
		var menu={
				id:parseInt($('#idDelete').val()),
				code:$('#codeDelete').val(),
				name:$('#nameDelete').val(),
				controller:$('#controller').val(),
				isDelete :true,
				createdBy:$('#crDelete').val(),
				createdDate:$('#dateDelete').val()
		}
		console.log(JSON.stringify(menu));
		$.ajax({
			url:'${pageContext.request.contextPath}/menu/delete/' +menu.id,
			type:'DELETE',
			contentType:'application/json',
			data:JSON.stringify(menu),
			success:function(data){
				console.log("data di delete");
				loadData();
				$('#deleteMenuModal').modal('hide');
			},
			error :function(){
				console.log("data kacau");
			}
		});
	});
	/* dropdown menu */
	function createMenu(){
		var relee=null;
		$.ajax({
			url : '${pageContext.request.contextPath}/user/getrole',/* fungsi/getuserlogin *//*user/getrole*/
			type : 'GET',
			success : function(data1){
			 
			 relee=data1;
			 console.log('Ini adalah role nya');
			 console.log(relee);
			 menusRole(relee);			  
				  
			}
		});
	 }
	
	/* DROPDOWN MENU */
	function menusRole(role22){
		$.ajax({
			url : '${pageContext.request.contextPath}/access/getall',
			type : 'GET',
			success : function(data4) {
				var role1=null;
					role1=role22;
				console.log(role1);
				console.log('harus sama');
				console.log(data4[0].role.roleName);
				 if(data4[0].role.roleName == role1){
					  var idMenu=0;
					  idMenu=data4[0].id;
					   getMenubyRole(idMenu);
					   
					  
				 }
			},
			dataType : 'json'
		});	
		}
	
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
					 $.each(data2.menus,function(index,menu ){
						 
						
						  if(menu.parentId==1){
							$('#selectMenu').append('<li   class="nav-item"><a class="nav-link text-white  " href="${pageContext.request.contextPath}/'+menu.controller+'"> '+menu.name+'</a></li>');						 
						 
						  }else if(menu.parentId==2){
							 $('#selectMenu2').append('<li   class="nav-item"><a class="nav-link text-white  " href="${pageContext.request.contextPath}/'+menu.controller+'"> '+menu.name+'</a></li>');  
						  }			 
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
	});
	</script>
</html>
