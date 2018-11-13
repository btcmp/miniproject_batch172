<!-- MODAL APPROVE-->
<div class="modal fade" id="approveTranSouReqModal" tabindex="-1"
	role="dialog" aria-labelledby="editTransSouReq"
	aria-hidden="true">
	<div class="modal-dialog modal-lg" role="document">
		<div class="modal-content"> 
			<div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="appProductModalTitle">Approval Souvenir Request</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body border border-bottom-0 border-top-0 border-dark">
			
			<!-- FORM UP-->
				<form id="appFormSouReq" >
				<input type="hidden" id="approveTransaksiId">
					<div class="form-group row">
						<label for="transactionAppCode" class="col-sm-3 col-form-label">Transaction Code</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="header.code" id="transactionAppCode"
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
						<label for="requestTransBy" class="col-sm-3 col-form-label">Request By</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestBy" id="requestTransBy"
							 readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="requestTransDate" class="col-sm-3 col-form-label">Request Date</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestDate" id="requestTransDate"
								readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="DueTransDate" class="col-sm-3 col-form-label">Due Date</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestDueDate" id="DueTransDate"
								readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="noteTranSouReq" class="col-sm-3 col-form-label">Note</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="\note" id="noteTranSouReq" 
								readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="statusTransouReq" class="col-sm-3 col-form-label">Status</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="\note" id="statusTransouReq" 
								readonly>
						</div>
					</div>
				</form>
			
		<!-- TABLE -->
		<table class="table table-striped table-hover DataTable" id="modalTableApp" style="width : 100%">
			<thead>
				<tr>
					<th>Souvenir Name</th>
					<th>Qty</th>
					<th>Note</th>
				</tr>
			</thead>
			<tbody class=tableBodyApprove>
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
			        <input type="text" id="rejectSouvenir" placeholder="Input Reject Reason" style="height:100px; width:100%"/>
		      </div>
		      <div class="modal-footer">
		     	<button type="button" class="btn btn-danger" id="btn-reject-souvenir">Reject</button>
		        <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
		      </div>
		    </div>
		  </div>
		</div>
		
<!-- MODAL RECEIVED-->
<div class="modal fade" id="receivedTranSouReqModal" tabindex="-1"
	role="dialog" aria-labelledby="editTransSouReq"
	aria-hidden="true">
	<div class="modal-dialog modal-lg" role="document">
		<div class="modal-content"> 
			<div class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="appProductModalTitle">Received Souvenir Request</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body border border-bottom-0 border-top-0 border-dark">
			
			<!-- FORM UP-->
				<form id="recFormSouReq" >
				<input type="hidden" id="receiveTransaksiId">
					<div class="form-group row">
						<label for="transactionRecCode" class="col-sm-3 col-form-label">Transaction Code</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="header.code" id="transactionRecCode"
							 readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="eventRecCode" class="col-sm-3 col-form-label">Event Code</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="code" id="eventRecCode"
								readonly >
						</div>
					</div>
					<div class="form-group row">
						<label for="recTransBy" class="col-sm-3 col-form-label">Request By</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestBy" id="recTransBy"
							 readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="recTransDate" class="col-sm-3 col-form-label">Request Date</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestDate" id="recTransDate"
								readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="DueRecTransDate" class="col-sm-3 col-form-label">Due Date</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="requestDueDate" id="DueRecTransDate"
								readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="noteRecTranSouReq" class="col-sm-3 col-form-label">Note</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="\note" id="noteRecTranSouReq" 
								readonly>
						</div>
					</div>
					<div class="form-group row">
						<label for="statusRecTransouReq" class="col-sm-3 col-form-label">Status</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" name="\note" id="statusRecTransouReq" 
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
			<tbody class=tableBodyReceive>
			</tbody>
		</table>
<!-- END TABLE --> 
			<!-- FOOTER -->
			</div>
			<div class="modal-footer border border-top-0 border-dark">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
				<button type="button" class="btn btn-primary" id="receiveBtnModal">Received</button>
			</div>
		</div>
	</div>
</div>

<!-- Save Modal Received -->
<div class="modal fade" id="rejectSaveSouvenirModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		  <div class="modal-dialog modal-sm" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle">Order Received???</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
			 
		      </div>
		      <div class="modal-footer">
		     	<button type="button" class="btn btn-primary" id="btn-received-save-souvenir">Save</button>
		        <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
		      </div>
		    </div>
		  </div>
		</div>