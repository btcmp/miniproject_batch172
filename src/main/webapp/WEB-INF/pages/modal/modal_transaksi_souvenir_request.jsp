<!-- MODAL ADD -->
<div class="modal fade" id="addTranSouReqModal" tabindex="-1"
	role="dialog" aria-labelledby="addTransSouReq"
	aria-hidden="true">
	<div class="modal-dialog modal-lg" role="document">
		<div class="modal-content"> 
			<div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="addProductModalTitle">Add Souvenir Request</h5>
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
						<label for="eventId" class="col-sm-3 col-form-label">Event Code</label>
						<div class="col-sm-4">
				    		<select path="event.id" style="width: 100%;" name="event" id="eventId">
			      		  	<option value="" selected>select event code</option>
			      		  	<c:forEach var="event" items="${events}">
			      		  	<option value="${event.id}">${event.code}</option>
			      		  	</c:forEach>
			      			</select>
						</div>
					</div>
					<div class="form-group row">
						<label for="requestBy" class="col-sm-3 col-form-label">Request By</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestBy" id="requestBy"
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
								placeholder="Select Date">
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
			<tr id='items-1'>
				<td>
				<select class="custom-select" id="souvenirItem" style="width:150px" data-parsley-required>
					<option value="">Select Souvenir</option>
					<c:forEach var="souvenir" items="${souvenirs}">
						<option value="${souvenir.id}">${souvenir.name}</option>
					</c:forEach>
				</select></td>
				<td><input type="text" class="form-control" placeholder="Qty" ></td>
				<td><input type="text" class="form-control" placeholder="Note"></td>
				<td><a href="#" class="editBtnModalTransSR"><span class="oi oi-pencil"></span></a>
					<a href="#" class="deleteBtnModalTransSR"><span class="oi oi-trash"></span></a></td>
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
	role="dialog" aria-labelledby="editTransSouReq"
	aria-hidden="true">
	<div class="modal-dialog modal-lg" role="document">
		<div class="modal-content"> 
			<div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="addProductModalTitle">Edit Souvenir Request</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body border border-bottom-0 border-top-0 border-dark">
			
			<!-- FORM UP-->
				<form id="editFormSouReq" >
					<div class="form-group row">
						<label for="transactionCode" class="col-sm-3 col-form-label">Transaction Code</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="header.code" id="transactionCode"
								placeholder="Transaction Code" readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="eventCode" class="col-sm-3 col-form-label">Event Code</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="code" id="eventCode"
								readonly >
						</div>
					</div>
					<div class="form-group row">
						<label for="requestTransSBy" class="col-sm-3 col-form-label">Request By</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestBy" id="requestTransSBy"
							 readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="requestTransSDate" class="col-sm-3 col-form-label">Request Date</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestDate" id="requestTransSDate"
								readonly>
						</div>
					</div>
					<div class="form-group row">
						<label foDueTransSDate" class="col-sm-3 col-form-label">Due Date</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestDueDate" id="DueTransSDate"
								placeholder="Select Date">
						</div>
					</div>
					<div class="form-group row">
						<label for="noteTransSouReq" class="col-sm-3 col-form-label">Note</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="\note" id="noteTransSouReq" 
								placeholder="Type Note">
						</div>
					</div>
					<div class="form-group row">
						<label for="statusTransSouReq" class="col-sm-3 col-form-label">Status</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="\note" id="statusTransSouReq" 
								readonly>
						</div>
					</div>
				</form>
				
			<!-- BUTTOT ADD -->
			<div class="row" style="float:left; padding-bottom:10px; padding-top:10px">
				<div class="col">
					<a class="btn btn-primary" id="btnAddModalTransSouReq" href="#">Add Item</a>
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
			<tbody>
			<tr id='items'>
				<td><input type="text" class="form-control" id="note1" placeholder="Souvenir Name"></td>
				<td><input type="text" class="form-control" id="qty1" placeholder="Qty"></td>
				<td><input type="text" class="form-control" id="note1" placeholder="Note"></td>
				<td><a href="#" id="1" class="editBtnModalTransSR"><span class="oi oi-pencil"></span></a>
					<a href="#" id="1" class="deleteBtnModalTransSR"><span class="oi oi-trash"></span></a></td>
			</tr>
			</tbody>
		</table>
<!-- END TABLE --> 
				
			<!-- FOOTER -->
			</div>
			<div class="modal-footer border border-top-0 border-dark">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
				<button type="button" class="btn btn-primary" id="editBtnModal">Save</button>
			</div>
		</div>
	</div>
</div>
<!-- END MODAL ADD -->