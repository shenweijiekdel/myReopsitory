package cn.tedu.examsystem.service;

import cn.tedu.examsystem.mapper.ExamMapper;
import cn.tedu.examsystem.pojo.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ExamService {
    void createExam(Exam exam);
    List<Exam> displayExams();
}
