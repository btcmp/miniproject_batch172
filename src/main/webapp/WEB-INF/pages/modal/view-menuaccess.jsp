<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<div class="modal fade" id="viewModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLongTitle">View Menu</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <input type="hidden" id="ViewAccess"/>
		        <div class="form-group">
				    <div class="col">
				    	<label for="view-role">Role Code</label>
 						<select style="width: 100%;" name="mRoleId" id="view-role"> 
		      		  	<option value="" selected>Select Role Name</option>
		      		  	<c:forEach var="role" items="${masterRoles}">
		      		  	<option value="${role.id}">${role.code}</option>
		      		  	</c:forEach>
		      		 </select>
 						</div>
				    <div class="input-group mb-4"> 
  		<div class="input-group-row">
  		<c:set var="count" value="0" scope="request" />
  		<c:forEach var="menu" items="${masterMenus}">
    		<div class="input-group-text">
      		<input type="checkbox" aria-label="Checkbox for following text input" value="${menu.id }" class="viewId" id="${menu.id}">
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
		        <button type="button" class="btn btn-warning" data-dismiss="modal">Close</button>
		      </div>
		    </div>
		  </div>
		</div>
		</div>