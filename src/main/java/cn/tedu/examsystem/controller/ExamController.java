package cn.tedu.examsystem.controller;

import cn.tedu.examsystem.pojo.*;
import cn.tedu.examsystem.service.ExamService;
import cn.tedu.examsystem.service.QuestionService;
import cn.tedu.examsystem.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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
    @Autowired
    private StudentService studentService;
    @InitBinder
    public void initBinder(WebDataBinder binder) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    /*后台添加题目*/
    @RequestMapping("back/addQuestionBlank.html")
    public String addQuestionBlank(int examId,Question question,String[] questionOption,int[] questionAnswer,Model model){
        System.out.println(examId);
        System.out.println(question);
        System.out.println(Arrays.toString(questionOption));
        System.out.println(Arrays.toString(questionAnswer));
        System.out.println("examId=" + examId);
        List<Option> options = new ArrayList<Option>();
        List<Answer> answers = new ArrayList<Answer>();
        question.setpId(UUID.randomUUID().toString());
        question.seteId(examId);


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
        return "redirect:/exam/showExamInfo.html?examid=" + question.geteId();
    }

    /*后台创建考试*/
    @RequestMapping("back/createExam.html")
    public String createExam(Exam exam,Model model){

        examService.createExam(exam);

        return "redirect:/exam/back/displayExam.html";
    }

    /*后台显示考试*/
    @RequestMapping("back/displayExam.html")
    public String displayExam(Model model){
        Exam exam = new Exam();
        exam.setOnline(null);
        List<Exam> exams = examService.displayExams(exam);
        System.out.println(exams.size());
        if (exams.size() > 0)
            model.addAttribute("exams",exams);
        return "back/backInquireExam";
    }

    /*后台显示题目*/
    @RequestMapping("showExamInfo.html")
    public String showExamInfo(Model model,int examid){
        List<Question> list;
        model.addAttribute("examId",examid);
        list =  questionService.findAll(examid);
        if (list != null)
            model.addAttribute("questions",list);
        return "back/backShowExamInfo";
    }

    /*后台删除考试*/
    @RequestMapping("back/deleteExam.html")
    public String deleteExam(int examid,Model model){
        examService.deleteExam(examid);
        return "redirect:/exam/back/displayExam.html";
    }

    /*前台主页*/
    @RequestMapping("examList.html")
    public String examList(Model model,@RequestParam(required = false,defaultValue = "none")String Msg){
        System.out.println(Msg);
        Exam exam = new Exam();
        exam.setOnline(true);
        List<Exam> exams = examService.displayExams(exam);
        model.addAttribute("exams",exams);
        if (!Msg.equals("none"))
            model.addAttribute("Msg",Msg);
        return "frontHome";
    }

    /*答题页面paper.jsp*/
    @RequestMapping("questionList.html")
    public String questionList(int examId,int time,Model model,HttpSession session){
        List<Question>  questions = questionService.findAll(examId);
        /*随即乱序集合*/
        Collections.shuffle(questions);
        for (Question q:questions){
            Collections.shuffle(q.getOptions());
        }
        session.setAttribute("testTimeMin",time * 60);
        model.addAttribute("questionList",questions);
        model.addAttribute("examId",examId);
        return "paper";
    }
    /*判卷*/
    @RequestMapping("paperJudge.html")
    public String paperJudge(Model model, @RequestParam(required = false) String[] answers, int examId, int questionNum,HttpSession session){
        System.out.println(questionNum);

        try {

      examService.paperJudge(answers,examId,questionNum,((Student)session.getAttribute("_CURRENT_STUDENT")).getsId());
      Student student = (Student) session.getAttribute("_CURRENT_STUDENT");
                session.setAttribute("_CURRENT_STUDENT",studentService.findOneBySid(student.getsId().toString()));
        }catch (Exception e){
            e.printStackTrace();
        }

        return "redirect:/home.html";
    }
    @Test
    public void a(){

    }

    /*前台计时器*/
    @ResponseBody
    @RequestMapping("timeOut.html")
    public String timeOut(HttpSession session){
        int time = (Integer) session.getAttribute("testTimeMin");
       time --;
       session.setAttribute("testTimeMin",time);
       return time + "";
    }

    /*修改为上线状态*/
    @RequestMapping("back/isOnlineExam.html")
    public String isOnlineExam(Integer examid){
        if (examid!=null){
            examService.isOnlineExam(true,examid);
        }
        return "redirect:/exam/back/displayExam.html";
    }

    /*修改为下线状态*/
    @RequestMapping("back/notOnlineExam.html")
    public String notOnlineExam(Integer examid){
        if (examid!=null){
            examService.isOnlineExam(false,examid);
        }
        return "redirect:/exam/back/displayExam.html";
    }

}
