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
				<div
					class="modal-body border border-bottom-0 border-top-0 border-dark">
					<div class="bg-light border rounded" style="height:50%;">
					<div style="width:70%;margin-top:10px;margin-left:10px;">
						<div class="form-group row">
							<label for="TransactionCode" class="col-sm-2 col-form-label">Transaction
								Code</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="transactionCode"
									placeholder="Kode Transaksi" name="header.code" readonly>
							</div>
							<label for="requestBy" class="col-sm-2 col-form-label">Request By</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="requestBy"
									placeholder="Request By" name="header.requestBy" readonly>
							</div>
						</div>
						<div class="form-group row">
							<label for="eventCode" class="col-sm-2 col-form-label">Event Code</label>
							<div class="col-sm-3">
								<select class="form-control" name="header.tEventId">
										<option value="">Choose...</option>
											<c:forEach var="event" items="${events}">
											<option value="${event.id}">${event.code}</option>
										</c:forEach>
									</select> 
							</div>
							<label for="requestDate" class="col-sm-2 col-form-label">Request Date</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="requestDate"
									placeholder="Request Date" name="header.requestDate" readonly>
							</div>
						</div>
						<div class="form-group row">
							<label for="designTitle" class="col-sm-2 col-form-label">Design Title</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="titleHeader"
									placeholder="Design Title" name="header.titleHeader">
							</div>
							<label for="note" class="col-sm-2 col-form-label">Note</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" style="height:150px" name="header.note"
									placeholder="Note">
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
						<td><select class="custom-select" id="productItem1" name="details[0].mProductId" style="width:150px">
										<option value="">Choose...</option>
											<c:forEach var="product" items="${products}">
											<option value="${product.id}">${product.name}</option>
										</c:forEach>
									</select> 
									</td>
						<td><input type="text" class="form-control" id="description1" placeholder="description" readonly></td>
						<td><input type="text" class="form-control" name="details[0].titleItem" placeholder="Title"></td>
						<td><input type="text" class="form-control" name="details[0].requestPic" placeholder="Request PIC"></td>
						<td><input type="text" class="form-control" id="duedate1" name="details[0].requestDueDate" placeholder="Due Date"></td>
						<td><input type="text" class="form-control" id="startdate1" name="details[0].startDate" placeholder="Start Date" disabled></td>
						<td><input type="text" class="form-control" id="enddate1" name="details[0].endDate" placeholder="End Date" disabled></td>
						<td><input type="text" class="form-control" name="details[0].note" placeholder="Note"></td>
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
				<button type="submit" class="btn btn-primary" id="addBtnModal">Save Transaction</button>
			</div>
			</form>
     </div>
  </div>
</div>
