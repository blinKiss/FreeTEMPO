<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2>오라클19 접속테스트</h2>
   <%
      Connection conn=null; 
      Statement stmt = null;
      ResultSet rs = null;
      
      //192.168.0.156 공용서버 
      String dbURL = "jdbc:oracle:thin:@ddiYong:1521:doremiplay";
      String usrId = "jsp4";
      String usrPw = "123456";
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         conn = DriverManager.getConnection(dbURL,usrId,usrPw);
         
         // sql문을 실행
         stmt = conn.createStatement();
         
         String sql = "SELECT ID, NAME FROM TEST";
         
         rs = stmt.executeQuery(sql);
         
         if(rs.next()) {
            out.println(rs.getInt("ID"));
	        out.println("<br>");
         }
         
         
         out.println("ojdbc8 로드 및 접속 성공");
      }catch(Exception e) {
         out.println(e + "ojdbc8 로드 실패");
      }finally{
         
      }
   
   
   %>
</body>
</html>