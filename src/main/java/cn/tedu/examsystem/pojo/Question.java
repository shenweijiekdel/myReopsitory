package cn.tedu.examsystem.pojo;

import java.util.List;

public class Question {
    private String pId;
    private String pStem;
    private int eId;

    @Override
    public String toString() {
        return "Question{" +
                "pId='" + pId + '\'' +
                ", pStem='" + pStem + '\'' +
                ", eId=" + eId +
                ", options=" + options +
                ", answers=" + answers +
                '}';
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    private List<Option> options;
    private List<Answer> answers;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpStem() {
        return pStem;
    }

    public void setpStem(String pStem) {
        this.pStem = pStem;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
