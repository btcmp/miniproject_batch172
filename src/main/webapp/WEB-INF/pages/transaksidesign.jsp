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
<meta charset="ISO-8859-1">
<title>Design</title>
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/assets/img/favicon.png" />
<title>Product</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath}/resources/assets/css/dashboard.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css"/>
<link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/assets/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet">
<style>
textarea {
	resize: none;
}
input[type="file"] {
    display: none;
}
input.parsley-error {
	color: #B94A48 !important;
	background-color: #F2DEDE !important;
	border: 1px solid #EED3D7 !important;
}

@media ( min-width : 768px) {
	.modal-xl {
		width: 95%;
		max-width: 1800px;
}
}
</style>
<meta name="userlog" content="${userLog.mRole.roleName}"/>
</head>
<body>
<input type="hidden" id="userlog" value="${userLog.mRole.roleName}">
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
						<li class="nav-item"><a class="nav-link text-white" href="${pageContext.request.contextPath }/product">
								Products
						</a></li>
						<li class="nav-item"><a class="nav-link bg-danger text-white" href="${pageContext.request.contextPath}/design"> Transaction	
						</a></li>
						<li class="nav-item"><a class="nav-link text-white" href="${logoutUrl}" > Logout	
						</a></li>
					</ul>
					</div>
			</nav><!-- END DASHBOARD -->
			<div role="main" class="col-md-8 ml-sm-auto col-lg-10">
				<div class="card text-white bg-primary mb-3">
					<div class="card-header">Product</div>
				</div>
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item"><a href="#">Transaction</a></li>
						<li class="breadcrumb-item active" aria-current="page">Design</li>
					</ol>
				</nav>
				<table id="inputTable">
				<thead>
					<tr>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th><button class="btn btn-primary" id="addBtn" type="submit" style="width:100px;">Add</button></th>
					</tr>
					<tr>
						<th></th>
						<th><input type="text" class="form-control" placeholder="Transaction Code" id="data1" data-index="1" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control" placeholder="Request By" id="data2" data-index="2" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control"	placeholder="Request Date" id="data3" data-index="3" style="padding-right:10px;"></th>
						<th><input type="text" class="form-control" placeholder="-Assign To-" id="data4" data-index="4" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control" placeholder="Status" id="data5" data-index="5" style="padding-right:10px;width:100%;"></th>
						<th><input type="text" class="form-control" placeholder="Created Date" id="data6" data-index="6" style="padding-right:10px;width:75%;"></th>
						<th><input type="text" class="form-control" placeholder="Created By" id="data7" data-index="7" style="padding-right:10px;width:100%;"></th>
						<th><a class="btn btn-danger" id="searchBtn" href="#" style="width:100px;">Search</a></th>
					</tr>
				</thead>
				</table>
				<table id="designTable" class="table DataTable">
				<thead class="thead-light">
					<tr>
						<th>No.</th>
						<th>Transaction Code</th>
						<th>Request By</th>
						<th>Request Date</th>
						<th>Assign To</th>
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
		</div>
	</div>
	<%@include file="/WEB-INF/pages/modal/add-transaksidesign.jsp" %> 
	<%@include file="/WEB-INF/pages/modal/edit-transaksidesign.jsp" %>
	<%@include file="/WEB-INF/pages/modal/approve-transaksidesign.jsp" %>
	<%@include file="/WEB-INF/pages/modal/close-design.jsp" %>
	<%@include file="/WEB-INF/pages/modal/rejected-transaksidesignjsp.jsp" %>
	
</body>
<!--   Core JS Files   -->
<script src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<!--  Charts Plugin -->
<script src="${pageContext.request.contextPath}/resources/assets/js/chartist.min.js"></script>
<!--  Dynamic Elements plugin -->
<script src="${pageContext.request.contextPath}/resources/assets/js/arrive.min.js"></script>
<!--  PerfectScrollbar Library -->
<script src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js" type="text/javascript"></script>
<!--  Notifications Plugin    -->
<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
<!-- Material Dashboard javascript methods -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
<script type="text/javascript">	
$(document).ready(function(){
	//data table
	$('#designTable').DataTable({
		'sDom':'tip',
		'ordering':false
	});
	$('#data3').datepicker({
		format:'yyyy-mm-dd',
		autoclose:true,
		uiLibrary: 'bootstrap4'
	});
	$('#data6').datepicker({
		format:'yyyy-mm-dd',
		autoclose:true,
		uiLibrary: 'bootstrap4'
	});
	//end of data table
	//load data
	loadData();
	$('#searchBtn').on( 'click', function () {
		for(var i = 1 ; i <= 7; i++){
			oTable
            .column( $('#data'+ i).data('index') )
            .search( $('#data'+ i).val() )
            .draw();
			$('#data'+i).val("");
		}
    });
	//get add modal
	$(document).on('click','#addBtn',function(){
		$.ajax({
			url : '${pageContext.request.contextPath}/design/getcode',
			type : 'GET',
			dataType : 'json',
			success : function(data){
				$('#transactionCode').val(data);
			}
		});
		$.ajax({
			url : '${pageContext.request.contextPath}/design/getrequestby',
			type : 'GET',
			dataType : 'json',
			success : function(data){
				$('#addRequestBy').val(data.employee.employeeName);
				$('#addRequestById').val(data.employee.id);
				$('#addCreatedBy').val(data.mRole.roleName);
				$('#userlog').val(data.mRole.roleName);
			}
		});
		$('#addFormDesign').trigger('reset');
		$('#addFormDesign').parsley().reset();
		var oTable = $('#itemsTable');
	    var tBody = oTable.find('tbody');
	    	tBody.empty();
	    var tRow =	'<tr>';
		tRow += '<td><select class="custom-select productItems" style="width:150px" disabled required data-parsley-required-message="Produk harus dipilih">'+
						'<option value="" selected>Choose...</option>'+
							'<c:forEach var="product" items="${products}">'+
							'<option value="${product.id}">${product.name}</option>'+
						'</c:forEach>'+
					'</select></td>';
		tRow += '<td><input type="text" class="form-control description" placeholder="description" disabled></td>';
		tRow += '<td><input type="text" class="form-control" placeholder="Title" disabled required data-parsley-required-message="Judul item design harus ada"></td>';
		tRow += '<td><select class="custom-select requestPic" style="width:150px" disabled required data-parsley-required-message="Harus memilih PIC">'+
		'<option value="" selected>Choose PIC...</option>'+
		'<c:forEach var="pic" items="${requestPics}">'+
		'<c:if test="${pic.mRole.id == 3}">'+
		'<option value="${pic.employee.id}">${pic.employee.employeeName}</option>'+
		'</c:if>'+
		'</c:forEach>'+
		'</select></td>';
		tRow += '<td><input type="text" class="form-control duedate placeholder="Due Date" disabled required data-parsley-required-message="Pilih Due Date"></td>';
		tRow += '<td><input type="text" class="form-control startdate" placeholder="Start Date" disabled></td>';
		tRow += '<td><input type="text" class="form-control enddate" placeholder="End Date" disabled></td>';
		tRow += '<td><input type="text" class="form-control" placeholder="Note" disabled></td>';
		tRow += '<td><a href="#" class="btn-edit-design"><span class="oi oi-pencil"></span></a></td>';
		tRow += '<td><a href="#" class="btn-delete-design"><span class="oi oi-trash"></span></a></td>';
		tRow +=	'</tr>';
		tBody.append(tRow);
		Id = 1;
		loadEvent();
		var now = new Date();
		var tahun = now.getFullYear();
		var bulan = now.getMonth()+1;
		var tanggal = now.getDate();
		var formatTanggal = ("0"+tanggal).slice(-2);
		$('#requestDate').val(tahun+'-'+bulan+'-'+formatTanggal);
		$('#addDesignTransactionModal').modal();
	});	
	
	//add item on modal
	$('#addItemBtn').on('click',function(){
		    Id++;
		  	var oTable = $('#itemsTable');
		    var tBody = oTable.find('tbody');
		    var tRow =	'<tr>';
			tRow += '<td><select class="custom-select productItems" style="width:150px" disabled required data-parsley-required-message="Produk harus dipilih">'+
							'<option value="" selected>Choose...</option>'+
								'<c:forEach var="product" items="${products}">'+
								'<option value="${product.id}">${product.name}</option>'+
							'</c:forEach>'+
						'</select></td>';
			tRow += '<td><input type="text" class="form-control description" placeholder="description" disabled></td>';
			tRow += '<td><input type="text" class="form-control" placeholder="Title" disabled required data-parsley-required-message="Judul item design harus ada"></td>';
			tRow += '<td><select class="custom-select requestPic" style="width:150px" disabled required data-parsley-required-message="Harus memilih PIC">'+
			'<option value="" selected>Choose PIC...</option>'+
			'<c:forEach var="pic" items="${requestPics}">'+
			'<c:if test="${pic.mRole.id == 3}">'+
			'<option value="${pic.employee.id}">${pic.employee.employeeName}</option>'+
			'</c:if>'+
			'</c:forEach>'+
			'</select></td>';
			tRow += '<td><input type="text" class="form-control duedate" placeholder="Due Date" disabled required data-parsley-required-message="Pilih Due Date"></td>';
			tRow += '<td><input type="text" class="form-control startdate" placeholder="Start Date" disabled></td>';
			tRow += '<td><input type="text" class="form-control enddate" placeholder="End Date" disabled></td>';
			tRow += '<td><input type="text" class="form-control" placeholder="Note" disabled></td>';
			tRow += '<td><a href="#" class="btn-edit-design"><span class="oi oi-pencil"></span></a>';
			tRow += '<a href="#" class="btn-delete-design"><span class="oi oi-trash"></span></a></td>';
			tRow +=	'</tr>';
			tBody.append(tRow);
	});
	//view design
	$(document).on('click','.btn-view-design',function(){
		var id = $(this).attr('id');
		$.ajax({
			url :'${pageContext.request.contextPath}/design/getitembydesignid/'+id,
			type:'GET',
			dataType:'json',
			success:function(data){
				$('#closeDesignId').val(data[0].transaksiDesign.id);
				$('#closeCode').val(data[0].transaksiDesign.code);
				$('#closeEventCode').val(data[0].transaksiDesign.transaksiEvent.code);
				$('#closeDesignTitle').val(data[0].transaksiDesign.titleHeader);
				$('#closeStatus').val(data[0].transaksiDesign.status);
				$('#closeAssignTo').val(data[0].transaksiDesign.assignTo);
				$('#closeRequestBy').val(data[0].transaksiDesign.requestBy.employeeName);
				$('#closeRequestDate').val(data[0].transaksiDesign.requestDate);
				$('closeNote').val(data[0].transaksiDesign.note);
				closeDesign(data);
			}
		});
		$('#closeDesignModal').modal();
	});
	$('#closeBtnModal').on('click',function(){
		var transaksiDesignItems=[];
		$('.closeTableBody tr').each(function(){
			tRow = $(this).find('td :input');
			var id =$(this).find('input[type=hidden]');
			var files=$(this).find('input[type=file]');
			if(files[0].files[0]!=null){
			items={
					startDate:tRow.eq(5).val(),
					endDate:tRow.eq(7).val(),
					designItemFile:{
						tDesignItemId:{
							id:id.val()
						},
						fileName:files[0].files[0].name,
						fileSize:(files[0].files[0].size/1000)+' KB'
						}
			}
			}else{
				items={
						startDate:tRow.eq(5).val(),
						endDate:tRow.eq(7).val(),
						transaksiDesignItemFile:{
							tDesignItemId:id.val(),
							fileName:"",
							fileSize:""
							}
				}	
			}
			transaksiDesignItems.push(items);
		});
		var transaksiDesign={
				id:$('#closeDesignId').val(),
				transaksiDesignItems:transaksiDesignItems
		}
		$.ajax({
			url:'${pageContext.request.contextPath}/design/closeupdate',
			type:'POST',
			contentType:'application/json',
			data:JSON.stringify(transaksiDesign),
			success:function(data){
			},
			error:function(){
			}
		});
		var forms = new FormData($('#closeFormDesign')[0]);
		$.ajax({
			url:'${pageContext.request.contextPath}/design/upload',
			type:'POST',
			contentType:false,
			processData:false,
			data:forms,
			cache:false,
			success:function(data){
				$('#closeDesignModal').modal('hide');
			},
			error:function(e){
			}
		})
		
	})
	//edit on add modal
	$(document).on('click','.btn-edit-design',function(){
		$(this).closest('tr').find(':input').prop('disabled', false);
		$(this).closest('tr').find('.description').prop('readonly', true);
		$(this).closest('tr').find('.startdate').prop('disabled', true);
		$(this).closest('tr').find('.enddate').prop('disabled', true);
		$(this).closest('tr').find('.duedate').datepicker({
			format:'yyyy-mm-dd',
			autoclose:true,
			uiLibrary: 'bootstrap4'
		});
		$(this).closest('tr').find('.startdate').datepicker({
			format:'yyyy-mm-dd',
			autoclose:true,
			uiLibrary: 'bootstrap4'
		});
		$(this).closest('tr').find('.enddate').datepicker({
			format:'yyyy-mm-dd',
			autoclose:true,
			uiLibrary: 'bootstrap4'
		});
	});
	$(document).on('change','.productItems',function(){
		var select = this;
		var oSelect =$(this);
		var productId = select[select.selectedIndex].value;
		$.ajax({
			url : '${pageContext.request.contextPath}/product/getbyid/'+productId,
			type : 'GET',
			success : function(data){
				oSelect.closest('tr').find('.description').val(data.description);
			}
		});
	});

	$(document).on('click','.btn-delete-design',function(){
		var id =$(this).closest('tr').remove();
		//$('#items-'+id).remove();
	});
	//end of edit on add modal
	//send to database add modal
	var parsleyConfig = {
    errorsContainer: function(parsleyField) {
        return $('#tempatError');
    }
	};
	$('#addBtnModal').on('click',function(e){
		var validate=$('#addFormDesign').parsley(parsleyConfig);
		validate.validate();	
		
	});
	$('#addFormDesign').parsley().on('form:success',function(){
		var transaksiDesignItems=[];
		$('.tableBody tr').each(function(){
			tRow = $(this).find('td :input');
			var items = {
					masterProduct:{
						id:tRow.eq(0).val()
					},
					titleItem:tRow.eq(2).val(),
					requestPic:{
						id:tRow.eq(3).val(),
					},
					requestDueDate:tRow.eq(4).val(),
					note:tRow.eq(10).val()
			}
			transaksiDesignItems.push(items);
		});
		var transaksiDesign = {
				code :$('#transactionCode').val(),
				createdBy:$('#addCreatedBy').val(),
				requestBy :{
					id:$('#addRequestById').val()
				},
				requestDate :$('#requestDate').val(),
				titleHeader :$('#titleHeader').val(),
				note :$('#note').val(),
				transaksiEvent :{
					id:$('#eventCode').val()
			    },
				transaksiDesignItems:transaksiDesignItems
		}
		$.ajax({
			url : '${pageContext.request.contextPath}/design/save',
			type : 'POST',
			contentType:'application/json',
			dataType:'json',
			data:JSON.stringify(transaksiDesign),
			success:function(data){
				loadData();
				$('#addDesignTransactionModal').modal('hide');
			}
		});
	});
	//get all data
	function loadData(){
		$.ajax({
			url : '${pageContext.request.contextPath}/design/getall',
			type : 'GET',
			dataType : 'json',
			success : function(data){
				convertToTable(data);
			}
		});
	}
	function convertToTable(data){
		oTable = $('#designTable').DataTable();
		oTable.rows( 'tr' ).remove();
		var role = $('#userlog').val();
		console.log(role);
		$.each(data,function(increment,design){
			increment++;

			if(role==="Administrator"){
				var tRow ='<a id="'+design.id+'" href="#" class="btn-view-design-main"><span class="oi oi-magnifying-glass"></span></a>';	
			}else if(role==="Requester"){
				var tRow ='<a id="'+design.id+'" href="#" class="btn-view-design"><span class="oi oi-magnifying-glass"></span></a>';
			}
			tRow +=' ';
			tRow +='<a id="'+design.id+'" href="#" class="btn-update-design-main"><span class="oi oi-pencil"></span></a>';
			if(design.status==1){
				status="Submitted";
			} else if(design.status==2){
				status="In Progress";
			} else if(design.status==3){
				status="Done";
			} else if(design.status==0){
				status="Rejected";
			}
			oTable.row.add([increment,design.code,design.requestBy.employeeName,design.requestDate,design.assignTo,status,design.createdDate,design.createdBy,tRow]);
		});
		oTable.draw();
	}
	function loadEvent(){
		$.ajax({
			url : '${pageContext.request.contextPath}/design/getevent',
			type : 'GET',
			dataType :'json',
			success:function(data){
				convertToSelect(data);
			}
		});
	}
	//selected event on add modal
	function convertToSelect(data){
		$('#eventCode').empty();
		$('#eventCode').append('<option value="">Choose...</option>');
		$.each(data,function(i,event){
		$('#eventCode').append('<option value="'+event.id+'">'+event.code+'</option>');
		})	
	}
	function closeDesign(data){
		var oTable = $('#closeItemsTable');
	    var tBody = oTable.find('tbody');
	    tBody.empty();
	    $.each(data,function(i,designItem){
	    	var tRow =	'<tr>';
			tRow += '<td><input type="text" class="form-control" value="'+designItem.masterProduct.name+'"disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+designItem.masterProduct.description+'"disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+designItem.titleItem+'"disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+designItem.requestPic.employeeName+'"disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+designItem.requestDueDate+'"disabled></td>';
			tRow += '<td><input type="text" class="form-control" id="closeStartDate'+i+'" placeholder="Start Date"></td>';
			tRow += '<td><input type="text" class="form-control" id="closeEndDate'+i+'" placeholder="End Date"></td>';
			tRow += '<td><input type="text" class="form-control" value="'+designItem.note+'"disabled></td>';
			tRow += '<td><input type="hidden" value="'+designItem.id+'"></td>';
			tRow += '<td><div id="file-click'+i+'" class="btn close-file-upload btn-primary">';
			
			tRow += 'Browse</div><input type="file" name="file" id="file-upload'+i+'"></td>';
			tRow += '<td><input type="text" class="form-control" placeholder="input file" id="file-name'+i+'" style="background-color:white;" readonly></td>';
			tRow +=	'</tr>';
			tBody.append(tRow);	
			$('#closeStartDate'+i).datepicker({
				format:'yyyy-mm-dd',
				autoclose:true,
				uiLibrary: 'bootstrap4'
			});
			$('#closeEndDate'+i).datepicker({
				format:'yyyy-mm-dd',
				autoclose:true,
				uiLibrary: 'bootstrap4'
			});
			$('#file-click'+i).click(function(){
				$('#file-upload'+i).click();
			})
			$("#file-upload"+i).change(function(){
				var fileName = $('#file-upload'+i)[0].files[0].name;
				$('#file-name'+i).val(fileName);
			});
	    });
	}
	
	
	
	/*  KOLOM ANGGI*/
	  /* UNTUK EDIT */
	  /* memunculkan Modal edit */ 
	  $(document).on('click','.btn-update-design-main',function(){
		  var id = $(this).attr('id');
		   
		  	$.ajax({
				url : '${pageContext.request.contextPath}/design/getitembydesignid/'+id,
				type : 'GET',
				dataType : 'json',
				success : function(data){
					var keys=Object.keys(data);
					len=keys.length;
					$('#eventEditCode').empty();
					$('#eventEditCode').append('<option id="eventEditCodeSelected" selected></option>');
					$('#designEditId').val(data[0].transaksiDesign.id);
					$('#eventEditCodeSelected').val(data[0].transaksiDesign.transaksiEvent.id);
					document.getElementById('eventEditCodeSelected').innerHTML=data[0].transaksiDesign.transaksiEvent.code
					$('#transactionEditCode').val(data[0].transaksiDesign.code);
					$('#titleEditHeader').val(data[0].transaksiDesign.titleHeader);
					$('#statusEdit').val(statusSubmit(data[0].transaksiDesign.status));
					$('#requestEditBy').val(data[0].transaksiDesign.requestBy.employeeName);
					$('#requestEditDate').val(data[0].transaksiDesign.requestDate);
					$('#noteEdit').val(data[0].transaksiDesign.note);
				  	Id = len;  
				  	$('.tableBody').empty();
				  	itemLama(Id,data);
				  	loadEventEdit();
				  	
				}
			});
		   
		  	$('#editDesignTransactionModal').modal();
			
			index = 0;
		  
	  });
	  
	  /* memunculkan select item */
	function loadEventEdit(){
			$.ajax({
				url : '${pageContext.request.contextPath}/design/getevent',
				type : 'GET',
				dataType :'json',
				success:function(data){
					convertToSelectEdit(data);
				}
			});
		}
	  
	 function convertToSelectEdit(data){
			$.each(data,function(i,event){
			$('#eventEditCode').append('<option value="'+event.id+'">'+event.code+'</option>');
			})
		}
		 
	  
	  
	  /* memasukkan   item lama ke tabel*/
	  function itemLama(baris,data){
		  index2=0;
		  
		  for(var Ix=1;Ix<=baris;Ix++){ 
			var oTable = $('#itemsTableEdit');
			var tBody = oTable.find('tbody');
			var tRow =	'<tr id="items-edit-'+Ix+'">';
			tRow += '<td><select class="custom-select"    id="productEditItem'+Ix+'" name="details['+index+'].mProductId" style="width:150px" disabled>'+
								'<option value="'+data[index2].masterProduct.id+'" selected>'+data[index2].masterProduct.name+'</option>'+
									'<c:forEach var="product" items="${products}">'+
									'<option value="${product.id}">${product.name}</option>'+
								'</c:forEach>'+
							'</select></td>';
			tRow += '<td><input type="text" class="form-control description" id="descriptionEdit'+Ix+'" value="'+data[index2].masterProduct.description+'"	  placeholder="description" 	disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].titleItem+'" id="titleEdit'+Ix+'" 			placeholder="Title" 		disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].requestPic+'" id="requestPicEdit'+Ix+'" 	placeholder="Request PIC" 	disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].requestDueDate+'" id="duedateEdit'+Ix+'" 	placeholder="Due Date" 		disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].startDate+'" id="startdateEdit'+Ix+'" 		placeholder="Start Date" 	disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].endDate+'"id="enddateEdit'+Ix+'" 			placeholder="End Date" 		disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].note+'" id="noteEdit'+Ix+'" 				placeholder="Note" disabled></td>';
			tRow += '<td><input type="hidden" class="form-control" value="'+data[index2].id+'" id="itemIdEdit'+Ix+'" ></td>';
			tRow += '<td><input type="hidden" class="form-control" id="isDelete'+Ix+'" value=false ></td>';
			tRow += '<td><a id="'+Ix+'" href="#" class="btn-edit-design-main"><span class="oi oi-pencil"></span></a>';
			tRow += '<a id="'+Ix+'" href="#" class="btn-delete-design-main"><span class="oi oi-trash"></span></a></td>';
			tRow +=	'</tr>';
			index2++;
			tBody.append(tRow);
			datePickEdit(Ix);
		  }
	  }
	  
	  
	  /* add item BARU tabel */
	  $('#addEditItemBtn').on('click',function(){
			    Id++;
			    index++;
			     
			  	var oTable = $('#itemsTableEdit');
			    var tBody = oTable.find('tbody');
			    var tRow =	'<tr id="items-edit-'+Id+'">';
				tRow += '<td><select class="custom-select" id="productEditItem'+Id+'" name="details['+index+'].mProductId" style="width:150px" disabled>'+
								'<option value="" selected>Choose...</option>'+
									'<c:forEach var="product" items="${products}">'+
									'<option value="${product.id}">${product.name}</option>'+
								'</c:forEach>'+
							'</select></td>';
				tRow += '<td><input type="text" class="form-control description" id="descriptionEdit'+Id+'" placeholder="description" disabled></td>';
				tRow += '<td><input type="text" class="form-control" id="titleEdit'+Id+'" placeholder="Title" disabled></td>';
				tRow += '<td><input type="text" class="form-control" id="requestPicEdit'+Id+'" placeholder="Request PIC" disabled></td>';
				tRow += '<td><input type="text" class="form-control" id="duedateEdit'+Id+'" placeholder="Due Date" disabled></td>';
				tRow += '<td><input type="text" class="form-control" id="startdateEdit'+Id+'" placeholder="Start Date" disabled></td>';
				tRow += '<td><input type="text" class="form-control" id="enddateEdit'+Id+'" placeholder="End Date" disabled></td>';
				tRow += '<td><input type="text" class="form-control" id="noteEdit'+Id+'" placeholder="Note" disabled></td>';
				tRow += '<td><input type="hidden" class="form-control" id="itemIdEdit'+Id+'" value="0" ></td>';
				tRow += '<td><input type="hidden" class="form-control" id="isDelete'+Id+'" value=false ></td>';
				tRow += '<td><a id="'+Id+'" href="#" class="btn-edit-design-main"><span class="oi oi-pencil"></span></a>';
				tRow += '<a id="'+Id+'" href="#" class="btn-delete-design-main"><span class="oi oi-trash"></span></a></td>';
				tRow +=	'</tr>';
				tBody.append(tRow);
				datePickEdit(Id);
		});
	  
	  
	  
	  /* mendelete objek item tabel */
	  $(document).on('click','.btn-delete-design-main',function(){
			var id =$(this).attr('id');
			console.log(id);
			console.log($('#itemIdEdit'+id).val());
			if($('#itemIdEdit'+id).val()==0){
			$('#items-edit-'+id).remove();
			}else{
				$('#items-edit-'+id).hide();
				$('#isDelete'+id).val(true);
			}
			
		});
	  /* ini adalah function datePickerModalEdit */
	  function datePickEdit(id){
		  $('#duedateEdit'+id).datepicker({
				format:'yyyy-mm-dd',
				autoclose:true,
				uiLibrary: 'bootstrap4'
			});
			$('#startdateEdit'+id).datepicker({
				format:'yyyy-mm-dd',
				autoclose:true,
				uiLibrary: 'bootstrap4'
			});
			$('#enddateEdit'+id).datepicker({
				format:'yyyy-mm-dd',
				autoclose:true,
				uiLibrary: 'bootstrap4'
			});
			$('#productEditItem'+id).on('change',function(){
				var select = this;
				var productId = select[select.selectedIndex].value;
				$.ajax({
					url : '${pageContext.request.contextPath}/product/getbyid/'+productId,
					type : 'GET',
					success : function(data){
						$('#descriptionEdit'+id).val(data.description);
					}
				});
			});
		  
	  }
	  /* memencet tombole edit di modal */
	  $(document).on('click','.btn-edit-design-main',function(){
			var id =$(this).attr('id');
			$("#items-edit-"+id).find(':input').prop('disabled', false);
			$("#startdateEdit"+id).prop('disabled', true);
			$("#enddateEdit"+id).prop('disabled', true);
		});
	  
	  
	  /* SAVE DATA DARI MODAL EDIT */
	  $(document).on('click','#saveBtnModalEdit',function(){
		   var transaksiDesignItems=[];
			$('.tableBody tr').each(function(){
				tRow = $(this).find('td :input');
				var items = {
						masterProduct:{
							id:tRow.eq(0).val()
						},
						titleItem:tRow.eq(2).val(),
						requestPic:tRow.eq(3).val(),
						requestDueDate:tRow.eq(4).val(),
						startDate:tRow.eq(6).val(),
						endDate:tRow.eq(8).val(),
						note:tRow.eq(10).val(),
						id:tRow.eq(11).val(),
						'delete':tRow.eq(12).val()
				}
				transaksiDesignItems.push(items);
			}); 
			 
			var transaksiDesign = {
					id :$('#designEditId').val(),
					titleHeader :$('#titleEditHeader').val(),
					note :$('#noteEdit').val(),
					transaksiEvent :{
						id:$('#eventEditCode').val()
				    }  ,
					transaksiDesignItems:transaksiDesignItems
				
			};
			
			console.log(transaksiDesign);
			$.ajax({
				url : '${pageContext.request.contextPath}/design/update',
				type : 'POST',
				contentType:'application/json',
				dataType:'json',
				data:JSON.stringify(transaksiDesign),
				success:function(data){
					console.log(data);
				} 
			});	
			$('#editDesignTransactionModal').modal('hide');	
			loadData();
	  });
	  
	   
	  /* APPROVE */
	  
	  $(document).on('click','.btn-view-design-main',function(){
		  var id = $(this).attr('id');
		   
		  	$.ajax({
				url : '${pageContext.request.contextPath}/design/getitembydesignid/'+id,
				type : 'GET',
				dataType : 'json',
				success : function(data){
					var keys=Object.keys(data);
					len=keys.length;
					$('#eventEditCode2').empty();
					$('#eventEditCode2').append('<option id="eventEditCodeSelected2" selected></option>');
					$('#eventEditCodeSelected2').val(data[0].transaksiDesign.transaksiEvent.id);
					$('#approvedId').val(data[0].transaksiDesign.id);
					document.getElementById('eventEditCodeSelected2').innerHTML=data[0].transaksiDesign.transaksiEvent.code
					$('#transactionEditCode2').val(data[0].transaksiDesign.code);
					$('#titleEditHeader2').val(data[0].transaksiDesign.titleHeader);
					$('#statusEdit2').val(statusSubmit(data[0].transaksiDesign.status));
					$('#requestEditBy2').val(data[0].transaksiDesign.requestBy.employeeName);
					$('#requestEditDate2').val(data[0].transaksiDesign.requestDate);
					$('#noteEdit2').val(data[0].transaksiDesign.note);
				  	Id = len;   
				  	$('.tableBody').empty();
				  	itemLamaApprove(Id,data);
				  	employeeStaff();
				  	 
				  	
				}
			});
		    
		  	$('#approveDesignTransactionModal').modal();
			
			index = 0;
		  
	  });
	  
	   /* APPROVE menambakan employee */
	   function employeeStaff(){
		   $('#assignTo').empty();
		   $('#assignTo').append( '<option value="" selected>Choose...</option>'+
					'<c:forEach var="employee" items="${employeesStaff}">'+
					'<option value="${employee.id}">${employee.employeeName}</option>'+
				'</c:forEach>' );
	   }
		 
	  
	  
	  /* APPROVE add Tabel item lama */
	  
	  
	  function itemLamaApprove(baris,data){
		  index2=0;
		  
		  for(var Ix=1;Ix<=baris;Ix++){
			  console.log(data[index2].id);
			var oTable = $('#itemsTableEdit2');
			var tBody = oTable.find('tbody');
			var tRow =	'<tr id="items-edit2-'+Ix+'">';
			tRow += '<td><select class="custom-select"    name="details['+index+'].mProductId" style="width:150px" disabled>'+
								'<option value="'+data[index2].masterProduct.id+'" selected>'+data[index2].masterProduct.name+'</option>'+
							'</select></td>';
			tRow += '<td><input type="text" class="form-control description" value="'+data[index2].masterProduct.description+'"		placeholder="description" 	disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].titleItem+'" id="titleEdit2'+Ix+'" 			placeholder="Title" 		disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].requestPic+'" id="requestPicEdit2'+Ix+'" 	placeholder="Request PIC" 	disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].requestDueDate+'" id="duedateEdit2'+Ix+'" 	placeholder="Due Date" 		disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].startDate+'" id="startdateEdit2'+Ix+'" 		placeholder="Start Date" 	disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].endDate+'"id="enddateEdit2'+Ix+'" 			placeholder="End Date" 		disabled></td>';
			tRow += '<td><input type="text" class="form-control" value="'+data[index2].note+'" id="noteEdit2'+Ix+'" 				placeholder="Note" disabled></td>';
			tRow +=	'</tr>';
			index2++;
			tBody.append(tRow);
		   }   
	  } 
	  /* STATUS */
	  function statusSubmit(i){
		  if(i==1){
			  return "Submitted";
		  }else if(i==2){return "in proggress"}
		  else if(i==3){return "done"}
		  else{return "rejected"}
	  }
	  
	  /* SAAT  TOMBOL APPROVE DI PENCET */
	  $(document).on('click','#approvedBtnModalEdit',function(){
		  var transaksiDesign={	
				id 			:$('#approvedId').val(),
		  		assignTo	:{
		  			id: $('#assignTo').val()
		  		},
		  		status : 2
		  }
		  $.ajax({
			  	
				url 		: '${pageContext.request.contextPath}/design/approved',
				type 		: 'POST',
				contentType	:'application/json',
				dataType	:'json',
				data		:JSON.stringify(transaksiDesign),
			  	success		:function(data){
			  		console.log(data);
			  	}
		  });
		  
		  $('#approveDesignTransactionModal').modal('hide');
		  loadData();
	  });
	  
	  /* REJECTED */
	  $(document).on('click','#rejectedBtnModalEdit',function(){
		  $('#rejectDesignModal').modal();
	  });
	$(document).on('click','#btn-reject-design',function(){
		 var transaksiDesign={	
					id 			:$('#approvedId').val(),
			  		status 		: 0,
			  		rejectReason: $('#rejectDesign').val()
			  };
		 console.log(transaksiDesign);
			  $.ajax({
					url 		: '${pageContext.request.contextPath}/design/approved',
					type 		: 'POST',
					contentType	:'application/json',
					dataType	:'json',
					data		:JSON.stringify(transaksiDesign),
				  	success		:function(data){
				  		console.log(data);
				  	}
			  });
		  		 $('#rejectDesignModal').modal('hide');
			  	$('#approveDesignTransactionModal').modal('hide'); 
			  	loadData();
		
	});
	  
	  
});

</script>
</html>