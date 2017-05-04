package data;

/**
 * Created by duanzhengmou on 5/2/17.
 */
public class Score {
    private String studentId;
    private int studentScore;

    public Score(String studentId, int studentScore) {
        this.studentId = studentId;
        this.studentScore = studentScore;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(int studentScore) {
        this.studentScore = studentScore;
    }
}
