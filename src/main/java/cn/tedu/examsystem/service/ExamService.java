package cn.tedu.examsystem.service;

import cn.tedu.examsystem.pojo.Exam;

import java.util.List;

public interface ExamService {
    void createExam(Exam exam);
    List<Exam> displayExams(Exam isOnline);
    void paperJudge(String[] answers, int examId, int questionNum, int sutId);
    void deleteExam(int examid);
    void scoreRegist(int stuId, float score);

    void isOnlineExam(Boolean b,Integer eId);

}
