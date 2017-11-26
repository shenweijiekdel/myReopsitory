package cn.tedu.examsystem.pojo;

import java.util.Date;
import java.util.List;

public class Exam {
    private int eId;
    private String eExam;
    private Date eTime;
    private boolean isOnline;
    private List<Question> questions;
    @Override
    public String toString() {
        return "Exam{" +
                "eId=" + eId +
                ", eExam='" + eExam + '\'' +
                ", eTime=" + eTime +
                ", isOnline=" + isOnline +
                ", questions=" + questions +
                '}';
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }


    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteExam() {
        return eExam;
    }

    public void seteExam(String eExam) {
        this.eExam = eExam;
    }

    public Date geteTime() {
        return eTime;
    }

    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
