package cn.tedu.examsystem.pojo;

public class Answer {
    private int aId;
    private String pId;
    private String oId;

    @Override
    public String toString() {
        return "Answer{" +
                "aId=" + aId +
                ", pId=" + pId +
                ", oId=" + oId +
                '}';
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public int getaId() {

        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }
}
