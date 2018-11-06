<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<div class="modal fade bd-example-modal-lg" id="addUserModal"
	tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
	aria-hidden="true">

	<div class="modal-dialog modal-lg" role="document">
		<div class="modal-content">
			<div
				class="modal-header bg-primary text-white border border-bottom-0 border-dark">
				<h5 class="modal-title" id="addProductModalTitle">Tambah User</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div
				class="modal-body border border-bottom-0 border-top-0 border-dark">





				<form id="addUserForm"    data-parsley-validate>

					<div class="row">

						<div class="col">
							<div class="form-group row">
								<label for="employee" class="col-sm-3 col-form-label">
									Employee </label>
								<div class=" form-group col-sm-9">

									<select class="custom-select" id="employee" data-parsley-required data-parsley-required-message="employee tidak boleh kosong">
										<option value="" selected>Choose...</option>
											<c:forEach var="employee" items="${employees}">
											<option value="${employee.id}">${employee.employeeName}</option>
										</c:forEach>
									</select> 

								</div>
							</div>

						</div>

						<div class="col">
							<div class="form-group row">
								<label for="username" class="col-sm-3 col-form-label">
									User Name </label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="username"
										placeholder="User name..." data-parsley-required  data-parsley-required-message="username tidak boleh kosong"
										data-parsley-minlength="8" data-parsley-minlength-message="minimal 8 karakter"
										data-parsley-namecheck data-parsley-namecheck-message="Nama produk sudah ada"
										> 
								</div>

							</div>

						</div>

					</div>
					<div class="row">
						<div class="col">
							<div class="form-group row">
								<label for="role" class="col-sm-3 col-form-label"> Role</label>
								<div class=" form-group col-sm-9">
									<select class="custom-select" id="role" 
											data-parsley-required data-parsley-required-message="role tidak boleh kosong">
										<option value="" selected>Choose...</option>
										<c:forEach var="role" items="${roles}">
											<option value="${role.id}">${role.roleName}</option>
										</c:forEach>
									</select>
								</div>

							</div>

						</div>
						<div class="col">
							<div class="form-group row">
								<label for="password" class="col-sm-3 col-form-label">
									Password </label>
								<div class="col-sm-9">
									<input id="password" type="password" class="form-control"
										name="password" placeholder="pass" 
										data-parsley-required data-parsley-required-message="password tidak boleh kosong"
										data-parsley-pattern="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*"   required data-parsley-pattern-message="harus mengandung huruf kecil, angka dan kapital">
								</div>
							</div>

						</div>

					</div>

					<div class="row justify-content-end">

						<div class="col-8">
							<div class="form-group row">
								<label for="rpassword" class="col-sm-2 col-form-label">
									Re-type Password:</label>
								<div class="col-sm-10">
									<input id="rpassword" type="password" class="form-control"
										name="rpassword" placeholder="re-type pass"    
										data-parsley-required data-parsley-required-message="password tidak boleh kosong"
										data-parsley-equalto="#password" data-parsley-equalto-message="harus sama dengan password"> 
								</div>
							</div>

						</div>

					</div>



					<!-- 	<div class="form-group row">
						<label for="description" class="col-sm-2 col-form-label">Deskripsi</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="description"
								placeholder="deskripsi">
						</div>
					</div> -->
				</form>
			</div>
			<div class="modal-footer border border-top-0 border-dark">
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" id="addButnModal">Add
					User</button>
			</div>
		</div>
	</div>
</div>



 