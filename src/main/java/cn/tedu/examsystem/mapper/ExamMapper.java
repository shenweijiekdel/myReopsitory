package cn.tedu.examsystem.mapper;

import cn.tedu.examsystem.pojo.Exam;
import cn.tedu.examsystem.pojo.Question;

public interface ExamMapper {
    int saveExam(Exam exam);
    int saveQuestion(Question question);
}
