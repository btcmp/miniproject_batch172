<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>*M*A*S*T*E*R U*N*I*T</title>
</head>

<!-- css bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!-- css resource icon -->
<link href="${pageContext.request.contextPath}/resources/assets/open-iconic/font/css/open-iconic-bootstrap.min.css" rel="stylesheet">
<!-- css datepicker -->
<%-- <link href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css" rel="stylesheet" /> --%>
<!-- css data table -->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css"/>
<link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css" rel="stylesheet" type="text/css" />

<!-- parsley style -->
<style>
	input.parsley-error
	{
		color : #B94A48 !important;
		background-color : #F2DEDE !important;
		border : 1px solid #EED3D7 !important;
	}

</style>
<body>

<!-- Container -->
<div id = "container-fluid" style="width : 80%; margin: auto">
		<!-- HEADER -->		
		<div class="card text-white bg-primary mb-3" style="width: 100%;">
  			<div class="card-header">List Unit</div>
		</div>
<!-- end container -->

		<!-- START NAVBAR -->
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
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
		        		<a class="nav-link" href="#">List Unit <span class="sr-only">(current)</span></a>
		      		</li>
		    	</ul>
			</div>
		</nav>
		<!-- END NAVBAR -->

<!-- BUTTON ADD -->
	<form>
		<div class="row" style="float:right; padding-bottom:10px; padding-top:10px">
			<div class="col">
				<a class="btn btn-primary" id="btn-add" href="#">Add</a>
			</div>
		</div> 
		<div class="row" style="float:left; padding-bottom:10px; padding-top:10px">
			<div class="col">
				<p id="notif" style="width:100%; display:"none" class="text-white bg-info border rounded"></p>
			</div>
		</div> 
	</form>
		
<!-- END BUTTON ADD -->

<!-- FORM -->		
		<form>
			<div class="row" style="width: 100%; margin : auto">
   				<div class="col">
      				<%-- <select class="form-control custom select" id="data1" data-index="1"> 
      					<option value=" " selected>Select Unit Code</option>
      					<c:forEach var="masterunit" items="${masterunits}">
      						<option value="${masterunit.code }">${masterunit.code }</option>
      					</c:forEach>
      				</select> --%>
      				<input type="text" class="form-control" id="data1" data-index="1" placeholder="Select Unit Code">
   				</div>
    			<div class="col">
      				<input type="text" class="form-control" id="data2" data-index="2" placeholder="Select Unit Name">
    			</div>
    			<div class="col">
      				<input type="text" class="form-control" id="data3" data-index="3" placeholder="Created Date">
    			</div>
    			<div class="col">
      				<input type="text" class="form-control" id="data4" data-index="4" placeholder="Created By">
    			</div>
    			<a class="btn btn-warning" id="btn-search-unit" href="#">Search</a>	
  			</div>
		</form>
		<hr/>
<!-- END FORM -->

<!-- TABLE -->
		<table class="table table-striped table-hover DataTable" id="unitTable" style="width : 100%">
			<thead>
				<tr>
					<th>No</th>
					<th>Unit Code</th>
					<th>Unit Name</th>
					<th>Created Date</th>
					<th>Created By</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>

<!-- END TABLE -->

<!-- include file -->
<%@include file="/WEB-INF/pages/modal/modal_unit.html"%>



</body>
<!-- jquery link -->
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<!--  PerfectScrollbar Library -->
<script src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<%-- <script src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
<script src="https://cdnjs.cloudfare.com/ajax/libs/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script> --%>
<!--  Notifications Plugin    -->
<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
<!-- Material Dashboard javascript methods -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js" type="text/javascript"></script>

<script type="text/javascript">

$(document).ready(function(){
	/* LOAD DATA SAVED DATA */
	loadData();
	/* DATE PICKER */
		$('#data3').datepicker({
			format : 'yyyy-mm-dd',
			autoclose : true,
			uiLibrary : 'bootstrap4'
				});
	/* ADD VALIDATE */
	Parsley.addValidator('namecheck',{
			validateString : function(value){
					var splitname = value.split(" ");
					xhr = $.ajax({
						url : '${pageContext.request.contextPath}/masterunit/getbyname/'+splitname[0],
						dataType : 'json',
						type : 'GET'
						});
					return xhr.then(function(data){
							if(data.length==0){
								return true
							}else{
								return $.Deferred().reject()
							}
						});
				}
		});
	
	/* SEARCH DATA */
	//loadData();
	//membuat objek table
	oTable = $('#unitTable').DataTable({
		 'sDom' : 'tip', 
		'ordering' : false
	});
	$('#btn-search-unit').on('click', function(){
		for (var i =1; i<=4, i++;){
			oTable
			.column($('#data'+ i).data('index'))
			.search($('#data'+ i).val() )
			.draw()
			$('#data'+i).val("");
			}
		});
	
	/*BUTTON POP UP ADD*/
	$(document).on('click', '#btn-add', function(){
		$.ajax({
			url : '${pageContext.request.contextPath}/masterunit/getcode',
			type : 'GET',
			success : function(data){
				$('#unitcode').val(data);
				$('#addUnitForm').parsley().reset();
				$('#unitname').val('');
				$('#description').val('');
			},
			dataType : 'json'
		});
		$('#addUnitModal').modal();
	});

	/* ADD UNIT */
				
	$('#addBtnModal').on('click',function(){
		//ev.preventDefault();
		//validation
		var validate = $('#addUnitForm').parsley();
		validate.validate();

		});
	$('#addUnitForm').parsley().on('form:success', function(){
		var masterunit = {
				code : $('#unitcode').val(),
				name : $('#unitname').val(),
				description : $('#description').val()  
				};
		
		//checkout value
		//console.log(masterunit);
		$.ajax({
			url:'${pageContext.request.contextPath}/masterunit/save',
			type : 'POST',
			contentType : 'application/json',
			data : JSON.stringify(masterunit),
			beforeSend : function(){
					console.log('before send ....');
				},
			success : function(data){
				console.log('data have been saved');
				loadData();
				$('#unitname').val('');
				$('#description').val('');
				$('#addUnitModal').modal('hide');
				
				//window.location='${pageContext.request.contextPath}/masterunit';
				
				document.getElementById("notif").innerHTML = "Data Saved! New Code Has Been Added With Code: "+masterunit.code+"!";
				$('#notif').show('slow').delay(1500).hide('slow');
				//modal data saved pop up
				/* $('#dataAddedModal').modal();
				setTimeout(function(){
					$('#dataAddedModal').modal('hide');
					}, 1000); */
				},
			error : function(){
				console.log('data failed to save');
				}
			/* dataType : 'json' */
			});
		})
	/* LOAD UNIT */
	function loadData(){
		$.ajax({
		url : '${pageContext.request.contextPath}/masterunit/getallunit',
		type : 'GET',
		success : function(output){
			console.log(output);
			convertToTable(output);
			},
		dataType : 'json'
			});      
		}
	//convert json to table
	function convertToTable(data){
		 oTable = $('#unitTable').DataTable();
		/* var tBody = oTable.find('tbody');
		tBody.find('tr').remove(); */
		oTable.rows('tr').remove();
		//re-fill data on tablerow
		$.each(data, function(index, masterunit){
			index++;
			//console.log(index, masterunit);
			var tRow = '<a id="'+masterunit.id+'" href="#" class="btn-view-unit"><span class="oi oi-magnifying-glass"></span></a>';
				tRow += ' ';
				tRow += '<a id="'+masterunit.id+'" href="#" class="btn-edit-unit"><span class="oi oi-pencil"></span></a>';
				tRow += ' ';
				tRow += '<a id="'+masterunit.id+'" href="#" class="btn-delete-unit"><span class="oi oi-trash"></span></a>';
			oTable.row.add([index, masterunit.code, masterunit.name, masterunit.createdDate, masterunit.createdBy,tRow]);
			
			/* var tableRow = "<tr>";
				tableRow += "<td>";
					tableRow += index;
				tableRow += "</td>";
				tableRow += "<td>";
					tableRow += masterunit.code;
				tableRow += "</td>";
				tableRow += "<td>";
					tableRow += masterunit.name;
				tableRow += "</td>";
				tableRow += "<td>";
					tableRow += masterunit.createdDate;
				tableRow += "</td>";
				tableRow += "<td>";
					tableRow += masterunit.createdBy;
				tableRow += "</td>";
				tableRow += "<td>";
					tableRow += '<a id="'+masterunit.id+'" href="#" class="btn-view-unit"><span class="oi oi-magnifying-glass"></span></a>';
					tableRow += " ";
					tableRow += '<a id="'+masterunit.id+'" href="#" class="btn-edit-unit"><span class="oi oi-pencil"></span></a>';
					tableRow += " ";
					tableRow += '<a id="'+masterunit.id+'" href="#" class="btn-delete-unit"><span class="oi oi-trash"></span></a>';
				tableRow += "</td>";
			tableRow += "</tr>";
			tBody.append(tableRow); */
			});
			oTable.draw();
		}

	/* VIEW UNIT */
		//button view
		$(document).on('click', '.btn-view-unit', function(){
			var id = $(this).attr('id');
			/* var id2 = parseInt(id); */
			console.log(id);
			$.ajax({
				url : '${pageContext.request.contextPath}/masterunit/getbyid/' +id,
				type : 'GET',
				success : function(data){
					$('#unitCodeView').val(data.code);
					$('#unitNameCodeView').val(data.name);
					$('#descriptionView').val(data.description);
					console.log(data);
					},
					dataType : 'json'
				});

			$('#viewUnitModal').modal();
		});

	/* EDIT UNIT */
	$(document).on('click', '.btn-edit-unit', function(){
		var id = $(this).attr('id');
		console.log(id);
		$.ajax({
			url : '${pageContext.request.contextPath}/masterunit/getbyid/' +id,
			type : 'GET',
			success : function(output){
				console.log(output);
				//convert to form
				$('#editUnitForm').parsley().reset();
				$('#editUnitId').val(output.id);
				$('#editUnitIsDelete').val(output.isDelete);
				$('#editCreatedBy').val(output.createdBy);
				$('#editCreatedDate').val(output.createdDate);
				$('#editUpdatedBy').val(output.updatedBy);
				$('#editUpdatedDate').val(output.updatedDate);
				$('#editUnitCode').val(output.code);
				$('#editUnitName').val(output.name);
				$('#editDescription').val(output.description);
				},
				dataType : 'json'
			});
		$('#editUnitForm').parsley().reset();
		$('#editUnitModal').modal();
		}); 

	//fungsi update
	$(document).on('click', '.editBtnModal', function(){
		//$('#editUnitModal').modal();
		//var id = $(this).attr('id');
		//validasi
		var validate = $('#editUnitForm').parsley();
		validate.validate()	
		}); /* batas akhir fungsi */

		$('#editUnitForm').parsley().on('form:success', function(){
			var masterunit = {
					id : $('#editUnitId').val(),
					'delete' : false,
					createdDate : $('#editCreatedDate').val(),
					createdBy : $('#editCreatedBy').val(),
					updatedBy : $('#editUpdatedBy').val(),
					updatedDate : $('#editUpdatedDate').val(),
					code : $('#editUnitCode').val(),
					name : $('#editUnitName').val(),
					description : $('#editDescription').val() 
						};
			
				//check out value
				console.log(masterunit);

				$.ajax({
					url : '${pageContext.request.contextPath}/masterunit/update/',
					type : 'POST',
					contentType : 'application/json',
					data : JSON.stringify(masterunit),
					beforeSend : function(){
						console.log('before send....');
						},
					success : function(data){
						console.log('data have been saved');
						
						loadData();
						$('#editUnitModal').modal('hide');
						document.getElementById("notif").innerHTML = "Data Updated! Data Unit Has Been Updated! ";
						$('#notif').show('slow').delay(1000).hide('slow');
						}
					});
				
			});

		
		
					
	

	/* SOFT DELETE */
	$(document).on ('click', '.btn-delete-unit', function(){
		var id = $(this).attr('id');
		console.log(id);
		$.ajax({
			url : '${pageContext.request.contextPath}/masterunit/getbyid/' +id,
			type : 'GET',
			success : function(output){
				console.log(output);
				//convert to form karna stringfy
				$('#deleteUnitId').val(output.id);
				$('#deleteUnitIsDelete').val(output.isDelete);
				$('#deleteCreatedBy').val(output.createdBy);
				$('#deleteCreatedDate').val(output.createdDate);
				$('#deleteUpdatedBy').val(output.updatedBy);
				$('#deleteUpdatedDate').val(output.updatedDate);
				$('#deleteUnitCode').val(output.code);
				$('#deleteUnitName').val(output.name);
				$('#deleteDescription').val(output.description);
				},
				dataType : 'json'
			})
			
		$('#deleteUnitModal').modal();	
	});
	//fungsi delete
	$(document).on('click', '.deleteBtnModal', function(){
		var masterunit = {
				id : parseInt($('#deleteUnitId').val()),
				'delete' : true,
				createdDate : $('#deleteCreatedDate').val(),
				createdBy : $('#deleteCreatedBy').val(),
				updatedBy : $('#deleteUpdatedBy').val(),
				updatedDate : $('#deleteUpdatedDate').val(),
				code : $('#deleteUnitCode').val(),
				name : $('#deleteUnitName').val(),
				description : $('#deleteDescription').val() 
				};
		//check out value
		console.log(masterunit);
		document.getElementById("notif").innerHTML = "Data Deleted! Data Unit With Code: "+masterunit.code+" "+"Has Been Deleted!";
		$('#notif').show('slow').delay(1000).hide('slow');
		$.ajax({
			url : '${pageContext.request.contextPath}/masterunit/delete/' +masterunit.id,
			type : 'DELETE',
			contentType : 'application/json',
			data : JSON.stringify(masterunit),
			beforeSend : function(){
				console.log('before send...');
				},
			success : function(data){
				console.log('data has been deleted');
				loadData();
				$('#deleteUnitModal').modal('hide');
				}
			})
		})
	
	


		
}) /* batas ready function */





</script>

</html>