package cn.tedu.examsystem.service.impl;

import cn.tedu.examsystem.mapper.AnswerMapper;
import cn.tedu.examsystem.mapper.OptionMapper;
import cn.tedu.examsystem.mapper.QuestionMapper;
import cn.tedu.examsystem.pojo.Answer;
import cn.tedu.examsystem.pojo.Question;
import cn.tedu.examsystem.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private OptionMapper optionMapper;
    @Autowired
    private AnswerMapper answerMapper;
    @Transactional
    public int putQuestionIntoBlank(Question question) {

        System.out.println(question);
        questionMapper.addQuestion(question);
        answerMapper.addAnswer(question.getAnswers());
        optionMapper.addOption(question.getOptions());

        return 0;
    }

    public List<Question> findAll(int i) {

        return questionMapper.findAll(i);
    }

    public List<Question> findById(int i, String[] pId) {

        return questionMapper.findById(i,pId);
    }
}
