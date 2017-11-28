package cn.tedu.examsystem.pojo;

public class Student {

	private Integer sId;
	private String sName;
	private String sGender;
	private String sClass;
	private String sPassword;
	private float sScore;

	@Override
	public String toString() {
		return "Student{" +
				"sId=" + sId +
				", sName='" + sName + '\'' +
				", sGender='" + sGender + '\'' +
				", sClass='" + sClass + '\'' +
				", sPassword='" + sPassword + '\'' +
				", sScore=" + sScore +
				'}';
	}

	public float getsScore() {
		return sScore;
	}

	public void setsScore(float sScore) {
		this.sScore = sScore;
	}

	public String getsPassword() {
		return sPassword;
	}
	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	 
	public String getsGender() {
		return sGender;
	}
	public void setsGender(String sGender) {
		this.sGender = sGender;
	}
	public String getsClass() {
		return sClass;
	}
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}


}
