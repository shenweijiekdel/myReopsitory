package cn.tedu.examsystem.service;

import cn.tedu.examsystem.pojo.Student;

public interface StudentService {

	/**
	 * 通过学生sId查询该学生
	 * @param sId 学生id
	 * @return 通过sId查询的学生对象
	 */
	Student findOneBySid(String sId);
	/**
	 * 注册该student 将其保存到数据库中
	 * @param student
	 */
	void regist(Student student);

}
