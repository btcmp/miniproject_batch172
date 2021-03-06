<!-- MODAL ADD --> 
<div class="modal fade" id="addTranSouReqModal" tabindex="-1"
	role="dialog" aria-labelledby="addTransSouReq"
	aria-hidden="true">
	<div class="modal-dialog modal-lg" role="document">
		<div class="modal-content"> 
			<div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="addRequestTitle">Add Souvenir Request</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body border border-bottom-0 border-top-0 border-dark">
			
			<!-- FORM UP-->
				<form id="addFormSouReq" >
					<div class="form-group row">
						<label for="transactionCode" class="col-sm-3 col-form-label">Transaction Code</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="code" id="transactionCode"
								placeholder="Transaction Code" disabled>
						</div> 
					</div>
					<div class="form-group row">
						<label for="eventId" class="col-sm-3 col-form-label ">Event Code</label>
						<div class="col-sm-4">
				    		<select class="form-control" path="event.id" style="width: 100%;" name="event" id="eventId" required>
			      		  	<option value="" selected>Select event code</option>
			      		  	<%-- <c:forEach var="event" items="${events}">
			      		  	<option value="${event.id}">${event.code}</option>
			      		  	</c:forEach> --%>
			      			</select>
						</div>
					</div>
					<div class="form-group row">
						<label for="requestBy" class="col-sm-3 col-form-label">Request By</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestBy" id="requestBy" value="${userlogin.employee.employeeName}"
							  disabled>
						</div>
					</div>
					<div class="form-group row">
						<label for="requestDate" class="col-sm-3 col-form-label">Request Date</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestDate" id="requestDate"
								disabled>
						</div>
					</div>
					<div class="form-group row">
						<label for=requestDueDate" class="col-sm-3 col-form-label">Due Date</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestDueDate" id="requestDueDate"
								placeholder="Select Date" required>
						</div>
					</div>
					<div class="form-group row">
						<label for="note" class="col-sm-3 col-form-label">Note</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="note" id="note" 
								placeholder="Type Note">
						</div>
					</div>
				</form>
				
			<!-- BUTTOT ADD -->
			<div class="row" style="float:left; padding-bottom:10px; padding-top:10px">
				<div class="col">
					<a class="btn btn-primary" id="btnAddItems" href="#">Add Item</a>
				</div>
			</div>
			
		<!-- TABLE -->
		<table class="table table-striped table-hover DataTable" id="modalTableSouReqTrans" style="width : 100%">
			<thead>
				<tr>
					<th>Souvenir Name</th>
					<th>Qty</th>
					<th>Note</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody class="tableBody">
			<tr id='items1'>
				<td>
				<select class="custom-select" id="souvenirItem1" style="width:150px" data-parsley-required disabled>
					<option value="">Select Souvenir</option>
					<c:forEach var="souvenir" items="${souvenirs}">
						<option value="${souvenir.id}">${souvenir.name}</option>
					</c:forEach>
				</select></td>
				<td><input type="text" class="form-control" id="qty1" placeholder="Qty1" required disabled></td>
				<td><input type="text" class="form-control" id="note1" placeholder="Note1" required disabled></td>
				<td><a href="#" id="1" class="editBtnModalTransSR"><span class="oi oi-pencil"></span></a>
					<a href="#" id="1" class="deleteBtnModalTransSR"><span class="oi oi-trash"></span></a></td>
			</tr>
			</tbody>
		</table>
<!-- END TABLE -->	
			<!-- FOOTER -->
			</div>
			<div class="modal-footer border border-top-0 border-dark">
				<button type="button" class="btn btn-primary" id="saveAddBtnModal">Save</button>
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
			</div>
		</div>
	</div>
</div>
<!-- END MODAL ADD -->

<!-- MODAL EDIT-->
<div class="modal fade" id="editTranSouReqModal" tabindex="-1"
	role="dialog" aria-labelledby="editTranSouReqModal"
	aria-hidden="true">
	<div class="modal-dialog modal-lg" role="document">
		<div class="modal-content"> 
			<div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="editRequestTitle">Edit Souvenir Request</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body border border-bottom-0 border-top-0 border-dark">
			
			<!-- FORM UP-->
				<form id="editFormSouReq" >
				<input type="hidden" id="editTransaksiId">
					<div class="form-group row">
						<label for="editTransactionCode" class="col-sm-3 col-form-label">Transaction Code</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="header.code" id="editTransactionCode"
								placeholder="Transaction Code" disabled>
						</div>
					</div>
					<div class="form-group row">
						<label for="editEventCode" class="col-sm-3 col-form-label">Event Code</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="code" id="editEventCode"
								disabled >
						</div>
					</div>
					<div class="form-group row">
						<label for="editRequestBy" class="col-sm-3 col-form-label">Request By</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestBy" id="editRequestBy"
							 disabled>
						</div>
					</div>
					<div class="form-group row">
						<label for="editRequestDate" class="col-sm-3 col-form-label">Request Date</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestDate" id="editRequestDate"
								disabled>
						</div>
					</div>
					<div class="form-group row">
						<label for="editDueDate" class="col-sm-3 col-form-label">Due Date</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestDueDate" id="editDueDate"
								placeholder="Select Date">
						</div>
					</div>
					<div class="form-group row">
						<label for="editNote" class="col-sm-3 col-form-label">Note</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="\note" id="editNote" 
								placeholder="Type Note">
						</div>
					</div>
					<div class="form-group row">
						<label for="editStatus" class="col-sm-3 col-form-label">Status</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="\note" id="editStatus" 
								disabled>
						</div>
					</div>
				</form>
				
			<!-- ITEMS -->
			<div class="row" style="float:left; padding-bottom:10px; padding-top:10px">
				<div class="col">
					<a class="btn btn-primary" id="btnAddItemEdit" href="#">Add Item</a>
				</div>
			</div>
			
		<!-- TABLE -->
		<table class="table table-striped table-hover DataTable" id="modalTableEditItems" style="width : 100%">
			<thead>
				<tr>
					<th>Souvenir Name</th>
					<th>Qty</th>
					<th>Note</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody class=tableBodyEdit>
			</tbody>
		</table>
<!-- END TABLE --> 
				
			<!-- FOOTER -->
			</div>
			<div class="modal-footer border border-top-0 border-dark">
				<button type="button" class="btn btn-primary" id="saveUpdateBtnModal">Save Update</button>
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
			</div>
		</div>
	</div>
</div>
<!-- END MODAL ADD -->