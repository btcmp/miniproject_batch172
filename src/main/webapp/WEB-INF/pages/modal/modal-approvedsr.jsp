<!-- MODAL EDIT-->
<div class="modal fade" id="approveTranSouReqModal" tabindex="-1"
	role="dialog" aria-labelledby="editTransSouReq"
	aria-hidden="true">
	<div class="modal-dialog modal-lg" role="document">
		<div class="modal-content"> 
			<div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="addProductModalTitle">Approval Souvenir Request</h5>
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
							 readonly>
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
								readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="noteTransSouReq" class="col-sm-3 col-form-label">Note</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="\note" id="noteTransSouReq" 
								readonly>
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
			
		<!-- TABLE -->
		<table class="table table-striped table-hover DataTable" id="modalTableSouReqTrans" style="width : 100%">
			<thead>
				<tr>
					<th>Souvenir Name</th>
					<th>Qty</th>
					<th>Note</th>
				</tr>
			</thead>
			<tbody>
			<tr id='items'>
				<td><input type="text" class="form-control" id="note1" placeholder="Souvenir Name"></td>
				<td><input type="text" class="form-control" id="qty1" placeholder="Qty"></td>
				<td><input type="text" class="form-control" id="note1" placeholder="Note"></td>
			</tr>
			</tbody>
		</table>
<!-- END TABLE --> 
			<!-- FOOTER -->
			</div>
			<div class="modal-footer border border-top-0 border-dark">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
				<button type="button" class="btn btn-danger" id="rejectBtnModal">Reject</button>
				<button type="button" class="btn btn-primary" id="approveBtnModal">Approved</button>
			</div>
		</div>
	</div>
</div>
