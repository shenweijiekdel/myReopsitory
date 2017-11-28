package cn.tedu.examsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/addQuestionBlank.html")
    public String addQuestionBlank(int examId,Model model){
        model.addAttribute("examId",examId);
        return "back/backAddQuestionBlank";
    }
    @RequestMapping("/home.html")
    public String Home(){
        return "redirect:/exam/examList.html";

    }
    @RequestMapping("/createExam.html")
    public String createExam(){

        return "back/backCreateExam";
    }
    @RequestMapping("/table.html")
    public String table(){
        return "back/table";
    }
}
