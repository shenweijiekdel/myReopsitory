package cn.tedu.examsystem.pojo;

public class Option {
    private String oId;
    private String oContent;
    private String pId;

    @Override
    public String toString() {
        return "Option{" +
                "oId=" + oId +
                ", oContent='" + oContent + '\'' +
                ", pId=" + pId +
                '}';
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getoContent() {
        return oContent;
    }

    public void setoContent(String oContent) {
        this.oContent = oContent;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }
}
