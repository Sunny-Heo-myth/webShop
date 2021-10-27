<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>${dept.department_name } Department Detail</h1>

<form action="">
id:<input type="text" name="department_id" value="${dept.department_id }"><br>
name:<input type="text" name="department_name" value="${dept.department_name }"><br>
manager:<input type="text" name="manager_id" value="${dept.manager_id }"><br>
location:<input type="text" name="location_id" value="${dept.location_id }"><br>
<input type="submit" value="change">
<input type="reset" value="reset">
</form>

</body>
</html>