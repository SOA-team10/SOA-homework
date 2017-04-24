package sax;

/**
 * Created by duanzhengmou on 4/24/17.
 */
public class Score {
    private String studentId;
    private int studentScore;
    private String courseId;
    private String scoreType;

    public Score() {
    }

    public Score(String studentId, int studentScore, String courseId, String scoreType) {
        this.studentId = studentId;
        this.studentScore = studentScore;
        this.courseId = courseId;
        this.scoreType = scoreType;
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

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getScoreType() {
        return scoreType;
    }

    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }

    @Override
    public String toString() {
        return "Score{" +
                "studentId='" + studentId + '\'' +
                ", studentScore=" + studentScore +
                ", courseId='" + courseId + '\'' +
                ", scoreType='" + scoreType + '\'' +
                '}';
    }
}
