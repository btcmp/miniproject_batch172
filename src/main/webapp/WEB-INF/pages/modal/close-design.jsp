<div class="modal fade" id="closeDesignModal" tabindex="-1" role="dialog" aria-labelledby="closeDesignTitle" aria-hidden="true">
  <div class="modal-dialog modal-xl modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="closeDesignTitle">Close Request</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form id="closeFormDesign">
			<input type="hidden" id="closeDesignId">
				<div
					class="modal-body border border-bottom-0 border-top-0 border-dark">
					<div class="bg-light border rounded" style="height: 50%;">
						<div class="row" style="width: 80%;">
							<div class="col-sm-5" style="margin-top:10px;margin-left:10px;">
								<div class="form-group row">
									<label for="closeCode" class="col-sm-4 col-form-label">Transaction
										Code</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="closeCode"
											placeholder="Kode Transaksi" disabled>
									</div>
								</div>
								<div class="form-group row">
									<label for="closeEventCode" class="col-sm-4 col-form-label">Event
										Code</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="closeEventCode"
											placeholder="kode event" disabled>
									</div>
								</div>
								<div class="form-group row">
									<label for="closeDesignTitle" class="col-sm-4 col-form-label">Design
										Title</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="closeDesignTitle"
											placeholder="Design Title" disabled>
									</div>
								</div>
								<div class="form-group row">
									<label for="closeStatus" class="col-sm-4 col-form-label">Status</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="closeStatus"
											placeholder="Status" disabled>
									</div>
								</div>
								<div class="form-group row">
									<label for="closeAssignTo" class="col-sm-4 col-form-label">Assign To</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="closeAssignTo"
											placeholder="Assign To" disabled>
									</div>
								</div>
							</div>
							<div class="col-sm-5" style="margin-top:10px;">
								<div class="form-group row">
									<label for="closeRequestBy" class="col-sm-4 col-form-label">Request
										By</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="closeRequestBy"
											placeholder="Request By" disabled>
									</div>
								</div>
								<div class="form-group row">
									<label for="closeRequestDate" class="col-sm-4 col-form-label">Request
										Date</label>
									<div class="col-sm-7">
										<input type="text" class="form-control" id="closeRequestDate"
											placeholder="Request Date" disabled>
									</div>
								</div>
								<div class="form-group row">
									<label for="closeNote" class="col-sm-4 col-form-label">Note</label>
									<div class="col-sm-7">
										<textarea class="form-control" id="closeNote"
											style="height: 150px" placeholder="Note" disabled></textarea>
									</div>
								</div>
							</div>
						</div>
					</div>
					<br>
					<div class="bg-light border rounded" style="height: 50%;">
						<table id="closeItemsTable" style="margin:20px;">
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
							<tbody class="closeTableBody">
								<%-- <tr id="items-1">
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
								</tr> --%>
							</tbody>
						</table>
					</div>
				</div>
				<div class="modal-footer border border-top-0 border-dark">
				<button type="button" class="btn btn-danger" id="closeBtnModal">Close Transaction</button>
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
			</div>
			</form>
     </div>
  </div>
</div>
