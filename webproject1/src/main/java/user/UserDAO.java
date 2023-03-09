package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		try {
			String dbURL = "jdbc:oracle:thin:@ddiYong:1521:doremiplay";
			String dbId = "jsp4";
		    String dbPw = "123456";
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    conn = DriverManager.getConnection(dbURL, dbId, dbPw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int login(String userID, String userPw) {
	    String sql = "SELECT userPw FROM members WHERE userID = ?";
	    try {
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, userID); // 변경된 부분
	        rs = pstmt.executeQuery();
	        if(rs.next()) {
	            if(rs.getString(1).equals(userPw)) { 
	                return 1; // 로그인 성공
	            }    
	            else {
	                return 0; // 비밀번호 불일치
	            }    
	        }
	        return -1; // 아이디 없음
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return -2; // DB 오류
	}
	
}
