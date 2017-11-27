package cn.tedu.examsystem.mapper;

import cn.tedu.examsystem.pojo.Answer;

import java.util.List;

public interface AnswerMapper{
    void addAnswer(List<Answer> answers);
    void deleteAnswerByOid(List<Answer> answer);
}
