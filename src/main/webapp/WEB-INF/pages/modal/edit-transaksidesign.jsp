<div class="modal fade" id="editDesignTransactionModal" tabindex="-1" role="dialog" aria-labelledby="addDesignTransactionTitle" aria-hidden="true">
  <div class="modal-dialog modal-xl modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="editDesignTransactionTitle">EditLah! Produk</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form id="editFormDesign">
			<input type="hidden" id="designEditId">
				<div
					class="modal-body border border-bottom-0 border-top-0 border-dark">
					<div class="bg-light border rounded" style="height: 50%;">
						<div class="row" style="width: 80%;">
							<div class="col-sm-5" style="margin-top:10px;margin-left:10px;">
								<div class="form-group row">
									<label for="TransactionEditCode" class="col-sm-4 col-form-label">Transaction
										Code</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="transactionEditCode"
											placeholder="Kode Transaksi" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="eventEditCode" class="col-sm-4 col-form-label">Event
										Code</label>
									<div class="col-sm-7">
										<select class="form-control" id="eventEditCode">
											<%--	<c:forEach var="event" items="${events}">
											<option value="${event.id}">${event.code}</option>
										</c:forEach> --%>
										</select>
									</div>
								</div>
								<div class="form-group row">
									<label for="titleEditHeader" class="col-sm-4 col-form-label">Design
										Title</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="titleEditHeader"
											placeholder="Design Title">
									</div>
								</div>
								<div class="form-group row">
									<label for="statusEdit" class="col-sm-4 col-form-label">Status
										</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="statusEdit"
											placeholder="Submitted(manual cuy)" readonly>
									</div>
								</div>
							</div>
							<div class="col-sm-5" style="margin-top:10px;">
								<div class="form-group row">
									<label for="requestBy" class="col-sm-4 col-form-label">Request
										By</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="requestEditBy"
											placeholder="Request By" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="requestDate" class="col-sm-4 col-form-label">Request
										Date</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="requestEditDate"
											placeholder="Request Date" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="note" class="col-sm-4 col-form-label">Note</label>
									<div class="col-sm-7">
										<textarea class="form-control" id="noteEdit"
											style="height: 150px" placeholder="Note"></textarea>
									</div>
								</div>
							</div>
						</div>
					</div>
					<br>
					<div class="bg-light border rounded" style="height: 50%;">
						<div class="row">
							<a class="btn btn-primary text-white" id="addEditItemBtn"
								style="width: 100px; margin: 20px;">Add</a>
						</div>
						<table id="itemsTableEdit">
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
				<button type="button" class="btn btn-primary" id="addBtnModal">Save Transaction</button>
			</div>
			</form>
     </div>
  </div>
</div>
