package cn.tedu.examsystem.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Date;
import java.util.List;

public class Exam {
    private int eId;
    private String eExam;
    private Date eTime;
    private Boolean isOnline;
    private int testTimeMin;
    public Boolean getOnline() {
        return isOnline;
    }

    public int getTestTimeMin() {
        return testTimeMin;
    }

    public void setTestTimeMin(int testTimeMin) {
        this.testTimeMin = testTimeMin;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "eId=" + eId +
                ", eExam='" + eExam + '\'' +
                ", eTime=" + eTime +
                ", isOnline=" + isOnline +
                ", testTimeMin=" + testTimeMin +
                ", questions=" + questions +
                '}';
    }


    private List<Question> questions;

    public Date geteTime() {
        return eTime;
    }

    public void seteTime(Date eTime) {
        this.eTime = eTime;
    }

    public void setOnline(Boolean online) {
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


    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
