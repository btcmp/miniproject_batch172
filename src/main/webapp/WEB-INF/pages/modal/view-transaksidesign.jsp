<div class="modal fade" id="approveDesignTransactionModal" tabindex="-1" role="dialog" aria-labelledby="addDesignTransactionTitle" aria-hidden="true">
  <div class="modal-dialog modal-xl modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="DesignTransactionTitle">Approve Design</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form id="viewFormDesign">
			 
			 
				<div
					class="modal-body border border-bottom-0 border-top-0 border-dark">
					<div class="bg-light border rounded" style="height: 50%;">
						<div class="row" style="width: 80%;">
							<div class="col-sm-5" style="margin-top:10px;margin-left:10px;">
								<div class="form-group row">
								<input type="hidden" id="viewApprovedId"> 
									<label for="viewTransactionCode" class="col-sm-4 col-form-label">Transaction
										Code</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="viewTransactionCode"
											placeholder="Kode Transaksi" disabled>
									</div>
								</div>
								<div class="form-group row">
									<label for="viewEventCode" class="col-sm-4 col-form-label">Event
										Code</label>
									<div class="col-sm-7">
										<select class="form-control" id="viewEventCode" disabled>
										 
										</select>
									</div>
								</div>
								<div class="form-group row">
									<label for="viewTitleHeader" class="col-sm-4 col-form-label">Design
										Title</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="viewTitleHeader"
											placeholder="Design Title" disabled>
									</div>
								</div>
								<div class="form-group row">
									<label for="viewStatus" class="col-sm-4 col-form-label">Status
										</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="status2"
											placeholder="status" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="viewAssignTo" class="col-sm-4 col-form-label">Assign To
										</label>
									<div class="col-sm-7">
										<input class="form-control" id="viewAssignTo">
									</div>
								</div>
							</div>
							<div class="col-sm-5" style="margin-top:10px;">
								<div class="form-group row">
									<label for="viewRequestBy" class="col-sm-4 col-form-label">Request
										By</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="viewRequestBy"
											placeholder="Request By" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="viewRequestDate" class="col-sm-4 col-form-label">Request
										Date</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="viewRequestDate"
											placeholder="Request Date" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="viewNote" class="col-sm-4 col-form-label">Note</label>
									<div class="col-sm-7">
										<textarea class="form-control" id="viewNote"
											style="height: 150px" placeholder="Note" disabled></textarea>
									</div>
								</div>
							</div>
						</div>
					</div>
					<br>
					<div class="bg-light border rounded" style="height: 50%;">
						 
						<table id="itemsTable2">
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
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button> 
			</div>
			</form>
     </div>
  </div>
</div>