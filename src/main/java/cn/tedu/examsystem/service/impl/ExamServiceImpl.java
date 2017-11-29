package cn.tedu.examsystem.service.impl;

import cn.tedu.examsystem.mapper.AnswerMapper;
import cn.tedu.examsystem.mapper.ExamMapper;
import cn.tedu.examsystem.mapper.OptionMapper;
import cn.tedu.examsystem.mapper.QuestionMapper;
import cn.tedu.examsystem.pojo.*;
import cn.tedu.examsystem.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("ALL")
@Service
public class ExamServiceImpl implements ExamService {
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

    public List<Exam> displayExams(Exam isOnline) {
        return examMapper.findAllExam(isOnline);
    }

    public void paperJudge(String[] answers, int examId, int questionNum, int stuId) {

        if (answers == null){
            scoreRegist(stuId,0);
            return ;
        }
        List<Answer> sAnswers = new ArrayList<Answer>();

        String[] que = new String[answers.length];
        for (int i = 0; i <answers.length; i++) {
            Answer sAnswer = new Answer();
            sAnswer.setpId(answers[i].split(",")[0]);
            sAnswer.setoId(answers[i].split(",")[1]);
            sAnswers.add(sAnswer);
        }




        List<Question> aQuestions = questionMapper.findById(examId,sAnswers);
        float eveScore = 100 /questionNum;
        float sScore = 0;
        boolean flag  = false;
        for (Question question:aQuestions
                ) {
            List<Answer> qAnswers = question.getAnswers();
            List<Answer> sAnswer = new ArrayList<Answer>();
            for (Answer an:sAnswers){
                if (an.getpId().equals(question.getpId()))
                    sAnswer.add(an);
            }
            Collections.sort(sAnswer);
            Collections.sort(qAnswers);
            if (qAnswers.equals(sAnswer)){
                System.out.println("对");
                sScore += eveScore;
            }
            else
                System.out.println("错");
        }
        scoreRegist(stuId,examId,Float.parseFloat(new  DecimalFormat("#.0").format(sScore)));

    }

    @Transactional
    public void deleteExam(int examid) {
        Exam exam = examMapper.findExambyId(examid);
        List<Answer> answers;
        List<Option> options;
        List<Question> questions = exam.getQuestions();
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

    public void scoreRegist(int stuId, int examId,float score) {
        examMapper.scoreRegist(stuId,examId,score);
    }

    public void isOnlineExam(int eId) {

    }

    public void isOnlineExam(Boolean b,Integer eId){
        System.out.println(eId);
        examMapper.isOnlineExam(b,eId);
    }

}
