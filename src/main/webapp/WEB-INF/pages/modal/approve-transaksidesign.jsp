<div class="modal fade" id="approveDesignTransactionModal" tabindex="-1" role="dialog" aria-labelledby="addDesignTransactionTitle" aria-hidden="true">
  <div class="modal-dialog modal-xl modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="editDesignTransactionTitle">Approve Design</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form id="editFormDesign">
			 
			 
				<div
					class="modal-body border border-bottom-0 border-top-0 border-dark">
					<div class="bg-light border rounded" style="height: 50%;">
						<div class="row" style="width: 80%;">
							<div class="col-sm-5" style="margin-top:10px;margin-left:10px;">
								<div class="form-group row">
								<input type="hidden" id="approvedId"> 
									<label for="TransactionEditCode2" class="col-sm-4 col-form-label">Transaction
										Code</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="transactionEditCode2"
											placeholder="Kode Transaksi" disabled>
									</div>
								</div>
								<div class="form-group row">
									<label for="eventEditCode2" class="col-sm-4 col-form-label">Event
										Code</label>
									<div class="col-sm-7">
										<select class="form-control" id="eventEditCode2" disabled>
										 
										</select>
									</div>
								</div>
								<div class="form-group row">
									<label for="titleEditHeader2" class="col-sm-4 col-form-label">Design
										Title</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="titleEditHeader2"
											placeholder="Design Title" disabled>
									</div>
								</div>
								<div class="form-group row">
									<label for="statusEdit2" class="col-sm-4 col-form-label">Status
										</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="statusEdit2"
											placeholder="Submitted(manual cuy)" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="asignTo" class="col-sm-4 col-form-label">Status
										</label>
									<div class="col-sm-7">
										<select class="form-control" id="assignTo">
										 
										</select>
									</div>
								</div>
							</div>
							<div class="col-sm-5" style="margin-top:10px;">
								<div class="form-group row">
									<label for="requestEditBy2" class="col-sm-4 col-form-label">Request
										By</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="requestEditBy2"
											placeholder="Request By" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="requestEditDate2" class="col-sm-4 col-form-label">Request
										Date</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="requestEditDate2"
											placeholder="Request Date" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="noteEdit2" class="col-sm-4 col-form-label">Note</label>
									<div class="col-sm-7">
										<textarea class="form-control" id="noteEdit2"
											style="height: 150px" placeholder="Note" disabled></textarea>
									</div>
								</div>
							</div>
						</div>
					</div>
					<br>
					<div class="bg-light border rounded" style="height: 50%;">
						 
						<table id="itemsTableEdit2">
							<thead>
								<tr>
									<th>Product Name</th>
									<th>Description</th>
									<th>Title</th>
									<th>Request PIC</th>
									<th>Due Date</th>
									<th>Start Date</th>
									<th>End Date</th>
									<th>Note</th>
									<th></th>
								</tr>
							</thead>
							<tbody class="tableBody">
							</tbody>
						</table>
					</div>
				</div>
				<div class="modal-footer border border-top-0 border-dark">
				<button type="button" class="btn btn-primary" id="approvedBtnModalEdit">Approved</button>
				<button type="button" class="btn btn-primary" id="rejectedBtnModalEdit">Rejected</button>
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button> 
			</div>
			</form>
     </div>
  </div>
</div>

<!-- REJECT MODAL -->
<div class="modal fade" id="rejectSouvenirModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		  <div class="modal-dialog modal-sm" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle">Reject Transaction Souvenir</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
			        <input type="text" id="rejectDesign" placeholder="Input Reject Reason" style="height:100px; width:100%"/>
		      </div>
		      <div class="modal-footer">
		     	<button type="button" class="btn btn-primary" id="btn-reject-souvenir">Reject</button>
		        <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
		      </div>
		    </div>
		  </div>
		</div>