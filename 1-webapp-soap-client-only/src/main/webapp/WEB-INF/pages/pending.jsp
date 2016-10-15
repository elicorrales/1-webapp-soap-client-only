<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ include file="common.jsp"%>

<title>View Pending Requests</title>

</head>
<body>
	<div class="container">

		<c:choose>
			<c:when test="${ not empty obsoleteMsg }">
				<div class="alert alert-danger">
					<strong>${obsoleteMsg }</strong>
				</div>
			</c:when>
		</c:choose>

		<c:choose>
			<c:when test="${ not empty message }">
       			${message}<br />
			</c:when>
			<c:when test="${ not empty pendingRequests }">

				<div class="container">
       				<form:form action="delpending" method="post" commandName="deleteAllPendingForm">
						<table style="width: 650px" class="table table-striped">
           					<tr> <td align="center"><input type="submit" value="Delete All Pending Requests" /></td> </tr>
           				</table>
       				</form:form>
   				</div>

				<table style="width: 650px" class="table table-striped">
					<tr>
						<td>Shape</td>
						<td>Type</td>
						<td>Dimension</td>
					</tr>
					<c:forEach items="${pendingRequests }" var="req">
					<c:choose>
					<c:when test="${empty req.shapeName }">
						<tr class="alert alert-danger">
							<td><i>UNKNOWN</i></td>
							<td>${req.calcType}</td>
							<td>${req.dimension}</td>
						</tr>
					</c:when>
					<c:when test="${empty req.calcType }">
						<tr class="alert alert-danger">
							<td>${req.shapeName}</td>
							<td><i>UNKNOWN</i></td>
							<td>${req.dimension}</td>
						</tr>
					</c:when>
					<c:otherwise>
						<tr>
							<td>${req.shapeName}</td>
							<td>${req.calcType}</td>
							<td>${req.dimension}</td>
						</tr>
					</c:otherwise>
					</c:choose>
					</c:forEach>
				</table>
			</c:when>
		</c:choose>
	</div>

</body>
</html>