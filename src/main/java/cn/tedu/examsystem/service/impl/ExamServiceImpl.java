package cn.tedu.examsystem.service.impl;

import cn.tedu.examsystem.mapper.AnswerMapper;
import cn.tedu.examsystem.mapper.ExamMapper;
import cn.tedu.examsystem.mapper.OptionMapper;
import cn.tedu.examsystem.mapper.QuestionMapper;
import cn.tedu.examsystem.pojo.Answer;
import cn.tedu.examsystem.pojo.Exam;
import cn.tedu.examsystem.pojo.Option;
import cn.tedu.examsystem.pojo.Question;
import cn.tedu.examsystem.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class
ExamServiceImpl implements ExamService {
    @Autowired
    private ExamMapper examMapper;
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private OptionMapper optionMapper;
    @Autowired
    private AnswerMapper answerMapper;
    public void createExam(Exam exam){
        examMapper.saveExam(exam);
    }

    public List<Exam> displayExams() {
        return examMapper.findAllExam();
    }
@Transactional
    public void deleteExam(int examid) {
        Exam exam = examMapper.findExambyId(examid);
        List<Answer> answers = null;
        List<Option> options = null;
        List<Question> questions = exam.getQuestions();
    System.out.println(questions);
        for (Question question:questions){
            if ((answers = question.getAnswers()).size() > 0)
            answerMapper.deleteAnswerByOid(answers);
            if ((options = question.getOptions()).size() > 0)
            optionMapper.deleteOptionByPid( options);

        }
    if (questions.size() > 0)
        questionMapper.deleteQuestionByEid(questions);
        examMapper.deleteExamById(exam.geteId());
    }
}
