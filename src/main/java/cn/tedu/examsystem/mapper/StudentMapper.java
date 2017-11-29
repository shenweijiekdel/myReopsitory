package cn.tedu.examsystem.mapper;

import cn.tedu.examsystem.pojo.StuExaSco;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.tedu.examsystem.pojo.Student;

import java.util.List;

public interface StudentMapper {

	public Student findOneBySid( @Param("sId") String sId);
 
	@Insert("insert into student (s_id,s_name,s_gender,s_class,s_password) values (#{sId},#{sName},#{sGender},#{sClass},#{sPassword})")
	public void regist(Student student);

	@Select("select * from student ")
	public List<Student> findAll();

	@Delete("delete from student where s_id=#{sId}")
	public void deleteStudent(Integer sid);

	@Select("select * from t_ses ")
	public List<StuExaSco> findScore();
}
