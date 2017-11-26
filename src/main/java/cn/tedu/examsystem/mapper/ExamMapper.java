package cn.tedu.examsystem.mapper;

import cn.tedu.examsystem.pojo.Exam;
import cn.tedu.examsystem.pojo.Question;

import java.util.List;

public interface ExamMapper {
    int saveExam(Exam exam);
    int saveQuestion(Question question);
    List<Exam> findAllExam();

    void deleteExamById(int eId);
  Exam findExambyId(int eId);
}
