<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ include file="common.jsp"%>

<title>View Calculated Results</title>

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


		<div class="container">
			<form:form action="runpendingnostop" method="post"
				commandName="runPendingNoStopForm">
				<table style="width: 650px" class="table table-striped">
					<tr>
						<td align="center"><input type="submit"
							value="Run All Pending Requests" /></td>
					</tr>
				</table>
			</form:form>
		</div>

		<c:choose>
			<c:when test="${ not empty message }">
       			${message}<br />
			</c:when>
			<c:when test="${ not empty calculatedResults }">

				<div class="container">
					<form:form action="delresults" method="post"
						commandName="deleteAllResultsForm">
						<table style="width: 650px" class="table table-striped">
							<tr>
								<td align="center"><input type="submit"
									value="Delete All Calculated Results" /></td>
							</tr>
						</table>
					</form:form>
				</div>

				<table style="width: 650px" class="table table-striped">
					<tr>
						<td>Shape</td>
						<td>Type</td>
						<td>Dimension</td>
						<td>Result|Error</td>
					</tr>
					<c:forEach items="${calculatedResults }" var="res">
						<c:choose>
							<c:when test="${ res.error == 'true' }">
								<tr class="alert alert-danger">
									<c:choose>
										<c:when test="${empty res.shapeName }">
											<td><i>UNKNOWN</i></td>
											<td>${res.calcType}</td>
										</c:when>
										<c:when test="${empty res.calcType }">
											<td>${res.shapeName}</td>
											<td><i>UNKNOWN</i></td>
										</c:when>
										<c:otherwise>
											<td>${res.shapeName}</td>
											<td>${res.calcType}</td>
										</c:otherwise>
									</c:choose>
									<td>${res.dimension}</td>
									<td>${res.errMsg}</td>
								</tr>
							</c:when>
							<c:otherwise>
								<tr>
									<td>${res.shapeName}</td>
									<td>${res.calcType}</td>
									<td>${res.dimension}</td>
									<td>${res.result }</td>
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