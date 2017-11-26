package cn.tedu.examsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/addQuestionBlank.html")
    public String addQuestionBlank(int examId,Model model){
        model.addAttribute("examId",examId);
        return "addQuestionBlank";
    }
    @RequestMapping("/home.html")
    public String Home(){
        return "redirect:/exam/displayExam.html";

    }
    @RequestMapping("/createExam.html")
    public String createExam(){

        return "createExam";
    }
}
