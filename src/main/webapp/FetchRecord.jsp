<%@page import="java.util.List"%>
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
			<td><a href="editrecords?id=<%=record.getId()%>"><button>Update</button></a></td>
			<td><a href="deleterecords?id=<%=record.getId()%>"><button>Delete</button></a></td>
		</tr>
		<%
		}
		%>
</body>
</html>