package cn.tedu.examsystem.service;

import cn.tedu.examsystem.pojo.Question;

import java.util.List;

public interface QuestionService {
    int putQuestionIntoBlank(Question question);
    List<Question> findAll(int i);
    List<Question> findById(int i ,String[] pId);
}
