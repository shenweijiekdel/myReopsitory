package cn.tedu.examsystem.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.tedu.examsystem.pojo.Student;

public interface StudentMapper {

	public Student findOneBySid( @Param("sId") String sId);
 
	@Insert("insert into student (s_id,s_name,s_gender,s_class,s_password) values (#{sId},#{sName},#{sGender},#{sClass},#{sPassword})")
	public void regist(Student student);
 
}
