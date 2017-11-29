package cn.tedu.examsystem.controller;

import cn.tedu.examsystem.pojo.Student;
import cn.tedu.examsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/studentInfo.html")
    public String studentInfo(Model model){

        List<Student> students = studentService.findAll();
        model.addAttribute("students",students);
        return "back/backStudentInfo";
    }

    @RequestMapping("/deleteStudent.html")
    public String deleteStudent(Integer sid,Model model){
        studentService.deleteStudent(sid);
        return "redirect:/studentInfo.html";
    }

    @RequestMapping("/studentScore.html")
    public String studentScore(Model model){

        List<Student> studentScore = studentService.findScore();
        model.addAttribute("studentScore",studentScore);
        return "back/backStudentScore";
    }
}
