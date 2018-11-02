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
      <div class="modal-body">
      <div class="col">
				    	<label for="menucode">Menu Code</label>
 						<input type="text" id="menucode" class="form-control" placeholder="Auto Generated" readonly>
 						</div>
 						<label for="menuaccess">Menu Access</label>
			<div class="custom-control custom-checkbox">
    				     
    				<!--  <label class="custom-control-label" for="defaultUnchecked"></label> -->
    				<c:forEach var="menu" items="${masterMenus}">
    				 <!--  <input type="checkbox" class="custom-control-input" id="defaultUnchecked">-->
    				   <input type="checkbox" class="custom-control-input" id="${menu.id}">  
    				  <label class="custom-control-label" for="defaultUnchecked">${menu.name}</label>
    				  <br>
    				</c:forEach>
    				
    				<!-- <select class="custom-select" id="menu" required> -->
					<%-- <c:forEach var="menu" items="${masterMenus}">
						<option value="${menu.id}">${menu.name}</option>
						
					</c:forEach>
					 --%><!-- </select> -->
				</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->