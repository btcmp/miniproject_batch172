<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<div class="modal fade" id="addModal" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
        <h4 class="modal-title">Add Menu Access?</h4>
      </div>
      <form id="saveFormAccess">
      <div class="modal-body">
      		<div class="col">
			    <label for="add-role">Role Code</label><br/>
			    	<select style="width: 100%;" name="mRoleId" id="add-role">
		      		  	<option value="" selected>Select Role Name</option>
		      		  	<c:forEach var="role" items="${masterRoles}">
		      		  	<option value="${role.id}">${role.roleName}</option>
		      		  	</c:forEach>
		      		</select>
			  </div>			
			 <div class="input-group mb-4"> 
  		<div class="input-group-row">
  		<c:set var="count" value="0" scope="request" />
  		<c:forEach var="menu" items="${masterMenus}">
    		<div class="input-group-text">
      		<input type="checkbox" aria-label="Checkbox for following text input" value="${menu.id }" name="menu[${count}].id" id="menuId">
      		<%-- <label class="custom-control-label">${menu.name}</label> --%>
      		<form:option>
				<c:out value="${menu.name}"></c:out>
			</form:option>
      		<br>
    		</div>
    		<c:set var="count" value="${count + 1}" scope="request"/>
    		</c:forEach>
  		</div>
  			<!-- <input type="text" class="form-control" aria-label="Text input with checkbox"> -->
				 </div> 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary btn-save">Save changes</button>
      </div>
      </form>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->