<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>오라클19 접속테스트</h2>
	<%
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			out.println("ojdbc8 로드 성공");
		}catch(Exception e){
			out.println("ojdbc8 로드 실패");
		}finally{
			
		}
		
		
	%>
</body>
</html>