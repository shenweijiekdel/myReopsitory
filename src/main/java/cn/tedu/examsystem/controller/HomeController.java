package cn.tedu.examsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/addQuestionBlank.html")
    public String addQuestionBlank(){
        return "addQuestionBlank";
    }
    @RequestMapping("/home.html")
    public String Home(){
        return "home";

    }
    @RequestMapping("/createExam.html")
    public String createExam(){
        return "createExam";
    }
}
