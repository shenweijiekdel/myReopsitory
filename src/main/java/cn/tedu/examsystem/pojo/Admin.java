package cn.tedu.examsystem.pojo;

public class Admin {

	private Integer uId;
	private String username;
	private String password;
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [uId=" + uId + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
