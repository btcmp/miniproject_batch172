<div class="modal fade" id="addDesignTransactionModal" tabindex="-1" role="dialog" aria-labelledby="addDesignTransactionTitle" aria-hidden="true">
  <div class="modal-dialog modal-xl modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="addDesignTransactionTitle">Tambah Produk</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form id="addFormDesign">
			<input type="hidden" id="addDesignId">
			<input type="hidden" id="addRequestById">
			<input type="hidden" id="addCreatedBy">
				<div
					class="modal-body border border-bottom-0 border-top-0 border-dark">
					<div class="bg-light border rounded" style="height: 50%;">
						<div class="row" style="width: 80%;">
							<div class="col-sm-5" style="margin-top:10px;margin-left:10px;">
								<div class="form-group row">
									<label for="TransactionCode" class="col-sm-4 col-form-label">Transaction
										Code</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="transactionCode"
											placeholder="Kode Transaksi" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="eventCode" class="col-sm-4 col-form-label">Event
										Code</label>
									<div class="col-sm-7">
										<select class="form-control" id="eventCode">
											<option value="">Choose...</option>
											<%--	<c:forEach var="event" items="${events}">
											<option value="${event.id}">${event.code}</option>
										</c:forEach> --%>
										</select>
									</div>
								</div>
								<div class="form-group row">
									<label for="designTitle" class="col-sm-4 col-form-label">Design
										Title</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="titleHeader"
											placeholder="Design Title">
									</div>
								</div>
							</div>
							<div class="col-sm-5" style="margin-top:10px;">
								<div class="form-group row">
									<label for="addRequestBy" class="col-sm-4 col-form-label">Request
										By</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="addRequestBy"
											placeholder="Request By" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="requestDate" class="col-sm-4 col-form-label">Request
										Date</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="requestDate"
											placeholder="Request Date" readonly>
									</div>
								</div>
								<div class="form-group row">
									<label for="note" class="col-sm-4 col-form-label">Note</label>
									<div class="col-sm-7">
										<textarea class="form-control" id="note"
											style="height: 150px" placeholder="Note"></textarea>
									</div>
								</div>
							</div>
						</div>
					</div>
					<br>
					<div class="bg-light border rounded" style="height: 50%;">
						<div class="row">
							<a class="btn btn-primary text-white" id="addItemBtn"
								style="width: 100px; margin: 20px;">Add</a>
						</div>
						<table id="itemsTable">
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
								<tr id="items-1">
									<td><select class="custom-select" id="productItem1"
										style="width: 150px" data-parsley-required disabled>
											<option value="">Choose...</option>
											<c:forEach var="product" items="${products}">
												<option value="${product.id}">${product.name}</option>
											</c:forEach>
									</select></td>
									<td><input type="text" class="form-control description"
										id="description1" placeholder="description" disabled></td>
									<td><input type="text" class="form-control" id="title1"
										placeholder="Title" disabled></td>
									<td><input type="text" class="form-control"
										id="requestPic1" placeholder="Request PIC" disabled></td>
									<td><input type="text" class="form-control" id="duedate1"
										placeholder="Due Date" disabled></td>
									<td><input type="text" class="form-control"
										id="startdate1" placeholder="Start Date" disabled></td>
									<td><input type="text" class="form-control" id="enddate1"
										placeholder="End Date" disabled></td>
									<td><input type="text" class="form-control" id="note1"
										placeholder="Note" disabled></td>
									<td><a href="#" id="1" class="btn-edit-design"><span
											class="oi oi-pencil"></span></a> <a href="#" id="1"
										class="btn-delete-design"><span class="oi oi-trash"></span></a>
									</td>
								</tr>
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
