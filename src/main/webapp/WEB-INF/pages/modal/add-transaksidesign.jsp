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
			<form id="addForm">
				<div
					class="modal-body border border-bottom-0 border-top-0 border-dark">
					<div class="bg-light border rounded" style="height:50%;">
					<div style="width:70%;margin-top:10px;margin-left:10px;">
						<div class="form-group row">
							<label for="TransactionCode" class="col-sm-2 col-form-label">Transaction
								Code</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="TransactionCode"
									placeholder="code here" readonly>
							</div>
							<label for="requestBy" class="col-sm-2 col-form-label">Request By</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="requestBy"
									placeholder="code here">
							</div>
						</div>
						<div class="form-group row">
							<label for="eventCode" class="col-sm-2 col-form-label">Event Code</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="TransactionCode"
									placeholder="code here">
							</div>
							<label for="requestDate" class="col-sm-2 col-form-label">Request Date</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="requestDate"
									placeholder="code here">
							</div>
						</div>
						<div class="form-group row">
							<label for="designTitle" class="col-sm-2 col-form-label">Design Title</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="designTitle"
									placeholder="code here">
							</div>
							<label for="note" class="col-sm-2 col-form-label">Note</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" style="height:150px" id="note"
									placeholder="code here">
							</div>
						</div>
					</div>
					</div>
					<br>
					<div class="bg-light border rounded" style="height: 50%;">
						<div class="row">
							<a class="btn btn-primary text-white" id="addItemBtn"
								style="width: 100px; margin:20px;">Add</a>
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
						<tbody>
						<tr id="items">
						<td><select class="custom-select" id="items" style="width:150px">
										<option value="" selected>Choose...</option>
											<c:forEach var="product" items="${products}">
											<option value="${product.id}">${product.name}</option>
										</c:forEach>
									</select> 
									</td>
						<td><input type="text" class="form-control" placeholder="description" readonly></td>
						<td><input type="text" class="form-control" placeholder="Title"></td>
						<td><input type="text" class="form-control" placeholder="Request PIC"></td>
						<td><input type="text" class="form-control" id="duedate1" placeholder="Due Date"></td>
						<td><input type="text" class="form-control" id="startdate1" placeholder="Start Date" disabled></td>
						<td><input type="text" class="form-control" id="enddate1" placeholder="End Date" disabled></td>
						<td><input type="text" class="form-control" placeholder="Note"></td>
						<td><a href="#" id="1" class="btn-update-design"><span class="oi oi-pencil"></span></a>
						<a href="#" id="1" class="btn-delete-design"><span class="oi oi-trash"></span></a>
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
