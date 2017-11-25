package cn.tedu.examsystem.service.impl;

import cn.tedu.examsystem.pojo.Question;
import cn.tedu.examsystem.service.QuestionService;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService{

    public int putQuestionIntoBlank(Question question) {
        System.out.println(question);
        return 0;
    }
}
