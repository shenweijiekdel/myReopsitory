package cn.tedu.examsystem.pojo;

public class StuExaSco {
    private int sId;
    private int eId;
    private float score;

    @Override
    public String toString() {
        return "StuExaSco{" +
                "sId=" + sId +
                ", eId=" + eId +
                ", score=" + score +
                '}';
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getsId() {

        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }
}
