<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!-- MODAL ADD -->
<div class="modal fade" id="addTranSouModal" tabindex="-1"
	role="dialog" aria-labelledby="addTransSou"
	aria-hidden="true">
	<div class="modal-dialog modal-lg" role="document">
		<div class="modal-content"> 
			<div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="addProductModalTitle">Add Souvenir Stock</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body border border-bottom-0 border-top-0 border-dark">
			
			<!-- FORM UP-->
				<form id="addUnitForm" >
					<div class="form-group row">
						<label for="transactionCode" class="col-sm-3 col-form-label">Transaction Code</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="transactionCode"
								placeholder="Transaction Code" readonly>
						</div>    
					</div>
					<div class="form-group row">
						<label for="receivedTransSBy" class="col-sm-3 col-form-label">Received By</label>
						<div class="col-sm-4">
							<select class="form-control custom select" id="receivedTransSBy">
								<option value=" " selected>Select Employee</option>
								<%-- <c:forEach var="employee" items="${employees }">
									<option value="${employee.employeeName }">${employee.employeeName }</option>
								</c:forEach> --%>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<label for="receivedTransSDate" class="col-sm-3 col-form-label">Received Date</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="receivedTransSDate"
								placeholder="Select Date">
						</div>
					</div>
					<div class="form-group row">
						<label for="noteTransSou" class="col-sm-3 col-form-label">Note</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="noteTransSou" style="height: 80px;"
								placeholder="Type Note">
						</div>
					</div>
				</form>
				
			<!-- BUTTOT ADD -->
			<div class="row" style="float:left; padding-bottom:10px; padding-top:10px">
				<div class="col">
					<a class="btn btn-primary" id="btnAddModalTransSou" href="#">Add Item</a>
				</div>
			</div>
			
		<!-- TABLE -->
		<table class="table table-striped table-hover DataTable" id="modalTableSouTrans" style="width : 100%">
			<thead>
				<tr>
					<th>Souvenir Name</th>
					<th>Qty</th>
					<th>Note</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			<tr id='items'>
				<td><input type="text" class="form-control" placeholder="Souvenir Name"></td>
				<td><input type="text" class="form-control" placeholder="Qty"></td>
				<td><input type="text" class="form-control" placeholder="Note"></td>
				<td><a href="#" class="editBtnModalTransS"><span class="oi oi-pencil"></span></a>
					<a href="#" class="deleteBtnModalTransS"><span class="oi oi-trash"></span></a></td>
			</tr>
			</tbody>
		</table>
<!-- END TABLE -->
				
			<!-- FOOTER -->
			</div>
			<div class="modal-footer border border-top-0 border-dark">
				<button type="button" class="btn btn-primary" id="addBtnModal">Save</button>
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
			</div>
		</div>
	</div>
</div>