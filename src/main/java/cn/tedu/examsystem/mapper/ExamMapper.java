package cn.tedu.examsystem.mapper;

import cn.tedu.examsystem.pojo.Exam;
import cn.tedu.examsystem.pojo.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamMapper {
    int saveExam(Exam exam);
    int saveQuestion(Question question);
    List<Exam> findAllExam(Exam isOnline);

    void deleteExamById(int eId);
  Exam findExambyId(int eId);
    @Insert("insert into t_ses values(#{sId},#{eId},#{score})")
    void scoreRegist(@Param("sId") int sId,@Param("eId")int eId,@Param("score")float score);
}
