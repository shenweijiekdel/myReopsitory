package cn.tedu.examsystem.service.impl;

import cn.tedu.examsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.examsystem.mapper.StudentMapper;
import cn.tedu.examsystem.pojo.Student;
import cn.tedu.examsystem.tool.Md5Utils;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;
	 

	public Student findOneBySid(String sId) {
		 
		return studentMapper.findOneBySid(sId);
	}



	public void regist(Student student) {
		
		student.setsPassword(Md5Utils.getMd5(student.getsPassword(), student.getsId()+""));
		
		studentMapper.regist(student);
	}

	public List<Student> findAll(){

		return studentMapper.findAll();
	}

	public void deleteStudent(Integer sid){

		studentMapper.deleteStudent(sid);

	}

	public List<Student> findScore(){

		return studentMapper.findScore();
	}
	
}
