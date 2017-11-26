package cn.tedu.examsystem.service;

import cn.tedu.examsystem.pojo.Exam;

import java.util.List;

public interface ExamService {
    void createExam(Exam exam);
    List<Exam> displayExams();

    void deleteExam(int examid);
}
