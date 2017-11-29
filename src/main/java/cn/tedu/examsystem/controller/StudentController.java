package cn.tedu.examsystem.controller;

import cn.tedu.examsystem.pojo.StuExaSco;
import cn.tedu.examsystem.pojo.Student;
import cn.tedu.examsystem.service.StudentService;
import cn.tedu.examsystem.tool.DownPOIUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/back")
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
    public String studentScore(Model model,int examId){

        List<Student> student = studentService.findByEid(examId);
        if (student.size() != 0)
            model.addAttribute("student",student);
            model.addAttribute("examId",examId);

        return "back/backStudentScore";
    }
    @RequestMapping("/scoreListPrint.html")
    public void ScoreListPrint(Model model, int examId, HttpServletResponse response){

        List<Student> student = studentService.findByEid(examId);
        Map<Student,String> map = new HashMap<Student, String>();
        for (Student stu:student
             ) {
            map.put(stu,Float.toString(stu.getStuExaScos().get(0).getScore()));
            try {
                DownPOIUtils.downPoi(response,map);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

