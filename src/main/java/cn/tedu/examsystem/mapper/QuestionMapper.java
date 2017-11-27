package cn.tedu.examsystem.mapper;

import cn.tedu.examsystem.pojo.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionMapper {
    List<Question> findAll(int eId);
    void addQuestion(Question question);
    void deleteQuestionByEid(List<Question> question);
    List<Question> findById(@Param("eId") int eId,@Param("pId") String[] pId);
}
