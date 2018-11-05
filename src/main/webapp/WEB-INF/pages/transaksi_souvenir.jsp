<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>***TRANSAKSI SOUVNEIR***</title>
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
		        		<a class="nav-link" href="#">List Souvenir Stock <span class="sr-only">(current)</span></a>
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
      				<input type="text" class="form-control" id="data1" data-index="1" placeholder="Transaction Code">
   				</div>
    			<div class="col">
      				<input type="text" class="form-control" id="data2" data-index="2" placeholder="Received By">
    			</div>
    			<div class="col">
      				<input type="text" class="form-control" id="data3" data-index="3" placeholder="Received Date">
    			</div>
    			<div class="col">
      				<input type="text" class="form-control" id="data4" data-index="4" placeholder="Created">
    			</div>
    			<div class="col">
      				<input type="text" class="form-control" id="data5" data-index="5" placeholder="Created By">
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
					<th>Transaction Code</th>
					<th>Received By</th>
					<th>Received Date</th>
					<th>Created Date</th>
					<th>Created By</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>

<!-- END TABLE -->

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

</html>