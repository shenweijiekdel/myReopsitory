package cn.tedu.examsystem.pojo;

public class Answer implements Comparable<Answer>{
    private int aId;
    private String pId;
    private String oId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answer answer = (Answer) o;

        if (pId != null ? !pId.equals(answer.pId) : answer.pId != null) return false;
        return oId != null ? oId.equals(answer.oId) : answer.oId == null;
    }

    @Override
    public int hashCode() {
        int result = pId != null ? pId.hashCode() : 0;
        result = 31 * result + (oId != null ? oId.hashCode() : 0);
        return result;
    }

    public Answer(String pId, String oId) {
        this.pId = pId;
        this.oId = oId;
    }

    public Answer() {   }

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

    public int compareTo(Answer o) {
        if (this.pId.compareTo(o.getpId()) > 0) {
            return 1;
        }
        if (this.pId.compareTo(o.getpId()) < 0) {
            return -1;
        }
        if (this.oId.compareTo(o.getoId()) > 0){
            return 1;
        }
        if (this.oId.compareTo(o.getoId()) < 0){
            return -1;
        }
        return 0;

    }
}
