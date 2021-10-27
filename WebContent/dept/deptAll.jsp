<%@page import="com.kosta.util.DeptDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>부서목록</title>
</head>
<body>
<h1>부서목록</h1>
<table>
<tr>
	<td>num</td>
	<td>name</td>
	<td>manager</td>
	<td>region</td>
</tr>
<%
List<DeptDTO> deptlist = (List<DeptDTO>) request.getAttribute("deptlistInfo");
for(DeptDTO dto : deptlist){%>
	<tr>
		<td><a href ="deptDetail?deptid=<%=dto.getDepartment_id()%>"><%= dto.getDepartment_id() %></a></td>
		<td><a href ="deptDetail?deptid=<%=dto.getDepartment_id()%>"><%= dto.getDepartment_name() %></a></td>
		<td><a href ="deptDetail?deptid=<%=dto.getDepartment_id()%>"><%= dto.getManager_id() %></a></td>
		<td><a href ="deptDetail?deptid=<%=dto.getDepartment_id()%>"><%= dto.getLocation_id() %></a></td>
	</tr>
<%}%>
</table>

</body>
</html>