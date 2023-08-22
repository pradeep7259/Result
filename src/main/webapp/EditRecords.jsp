<%@page import="Dto.Records"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<body>
<%
	List<Records> records =(List<Records>) request.getAttribute("records");
	%>
	

	<table border="1">
		<tr>
			
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Maths</th>
			<th>Science</th>
			<th>English</th>
			<th>Total Marks</th>
			<th>Percentage</th>
			<th>Result</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
	<%
		for (Records record : records) {
	%>
	
	<tr>
			<td><%=record.getName()%></td>
			<td><%=record.getEmail()%></td>
			<td><%=record.getMobile()%></td>
			<td><%=record.getMaths()%></td>
			<td><%=record.getScience()%></td>
			<td><%=record.getEnglish()%></td>
			<td><%=record.getTotalmarks()%></td>
			<td><%=record.getPercentage()%></td>
			<td><%=record.getResult()%></td>
			<td><a href="editrecordeach?id=<%=record.getId()%>"><button>Update</button></a></td>
			<td><a href="deleterecords?id=<%=record.getId()%>"><button>Delete</button></a></td>
		</tr>
		<%
		}
		%>
		<br>
		<a href="index.jsp"><button>Back</button></a>
</body>
</html>
--%>
<%@page import="java.util.List"%>
<%@page import="Dto.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Records records2 = (Records)request.getAttribute("records");
	%>
	<h1 align="center">Welcome to TODO Home</h1>

	<form action="updaterecord" method="post">
	<input type="text" name="id" value="<%=records2.getId() %>" hidden="true" required/th>
		<fieldset>
			<table>
				<tr>
					<th>Name:</th>
					<th><input type="text" name="name" required="required" value="<%=records2.getName()%>"></th>
				</tr>
				<tr>
					<th>Email:</th>
					<th><input type="email" name="email" required="required" value="<%=records2.getEmail() %>"></th>
				</tr>
				<tr>
					<th>Mobile</th>
					<th><input type="number" name="mobile" required="required" value="<%=records2.getMobile() %>"></th>
				</tr>
				<tr>
					<th>Maths:</th>
					<th><input type="text" name="maths" required="required" value="<%=records2.getMaths() %>"></th>
				</tr>
				<tr>
					<th>Science:</th>
					<th><input type="text" name="science" required="required" value="<%=records2.getScience() %>"></th>
				</tr>
				<tr>
					<th>English:</th>
					<th><input type="text" name="english" required="required" value="<%=records2.getEnglish() %>"></th>
				</tr>
				<tr>
					<td><button>Update</button></td>
					<td><button type="reset">Cancel</button></td>
				</tr>
			</table>
		</fieldset>
	</form>
	<a href="FetchRecords.jsp"><button>BACK</button></a>
</body>
</html>