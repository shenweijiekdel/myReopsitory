package cn.tedu.examsystem.mapper;

import cn.tedu.examsystem.pojo.Question;

import java.util.List;

public interface QuestionMapper {
    List<Question> findAll(int eId);
    void addQuestion(Question question);
    void deleteQuestionByEid(List<Question> question);
}
