package user;

//import lombok.Data;

public class User { 

	private String userID;	// 아이디
	private String userPw;			// 패스워드
	private String nickName;		// 닉네임
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
    // 우클릭 > Source > Generate Getter & Setter > Select All > generate 
	
}
