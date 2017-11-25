package cn.tedu.examsystem.controller;

import cn.tedu.examsystem.pojo.Answer;
import cn.tedu.examsystem.pojo.Exam;
import cn.tedu.examsystem.pojo.Option;
import cn.tedu.examsystem.pojo.Question;
import cn.tedu.examsystem.service.ExamService;
import cn.tedu.examsystem.service.QuestionService;
import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/exam/")
public class ExamController {
    @Autowired
    private QuestionService questionService;
    @Autowired
    private ExamService examService;
    @InitBinder
    public void initBinder(WebDataBinder binder) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    @RequestMapping("question/addQuestionBlank.html")
    public String addQuestionBlank(Question question,String[] questionOption,int[] questionAnswer,Model model){

        System.out.println(Arrays.toString(questionAnswer));
        question.setpId(UUID.randomUUID().toString());
        List<Option> options = new ArrayList<Option>();
        List<Answer> answers = new ArrayList<Answer>();

        for (String opt:questionOption){
        Option option = new Option();
            String oId = UUID.randomUUID().toString();
         option.setoContent(opt);
         option.setpId(question.getpId());
         option.setoId(oId);
         options.add(option);
        }
        for (int asw:questionAnswer){
            Answer answer = new Answer();
            answer.setoId(options.get(asw-1).getoId()); /*刚好options中的索引为asw-1个，遍历数组把答案找出来*/
            answer.setpId(question.getpId());
            answers.add(answer);
        }
        question.setAnswers(answers);
        question.setOptions(options);
        questionService.putQuestionIntoBlank(question);
        return "home";
    }
    @RequestMapping("createExam.html")
    public String createExam(Exam exam,Model model){

        examService.createExam(exam);

        return null;
    }
}
