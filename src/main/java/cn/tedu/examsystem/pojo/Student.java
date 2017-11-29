package cn.tedu.examsystem.pojo;

import java.util.List;
import java.util.Map;

public class Student {

	private Integer sId;
	private String sName;
	private String sGender;
	private String sClass;
	private String sPassword;

	@Override
	public String toString() {
		return "Student{" +
				"sId=" + sId +
				", sName='" + sName + '\'' +
				", sGender='" + sGender + '\'' +
				", sClass='" + sClass + '\'' +
				", sPassword='" + sPassword + '\'' +
				", stuExaScos=" + stuExaScos +
				'}';
	}

	public List<StuExaSco> getStuExaScos() {
		return stuExaScos;
	}

	public void setStuExaScos(List<StuExaSco> stuExaScos) {
		this.stuExaScos = stuExaScos;
	}

	private List<StuExaSco> stuExaScos;


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
