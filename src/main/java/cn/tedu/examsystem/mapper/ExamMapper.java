package cn.tedu.examsystem.mapper;

import cn.tedu.examsystem.pojo.Exam;
import cn.tedu.examsystem.pojo.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamMapper {
    int saveExam(Exam exam);
    int saveQuestion(Question question);
    List<Exam> findAllExam(Exam isOnline);

    void deleteExamById(int eId);
  Exam findExambyId(int eId);
  void scoreRegist(@Param("stuId")int stuId, @Param("score") float score);
}
