package cn.tedu.examsystem.service.impl;

import cn.tedu.examsystem.mapper.ExamMapper;
import cn.tedu.examsystem.pojo.Exam;
import cn.tedu.examsystem.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExamMapper examMapper;
    public void createExam(Exam exam){
        examMapper.saveExam(exam);
    }
}
