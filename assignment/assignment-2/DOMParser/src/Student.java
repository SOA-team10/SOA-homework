import java.util.ArrayList;
import java.util.Date;

/**
 * Created by 张文玘 on 2017/4/16.
 */
public class Student {
    private String id;//学号
    private String idCard;//身份证
    private String name;//姓名
    private String province;//籍贯
    private Date birthday;//生日
    private String phone;//手机
    private String sex;//性别
    private String checkInYear;//入学年份
    private Department department;//部门

    private ArrayList<Score> scores;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<Score> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Score> scores) {
        this.scores = scores;
    }

    public void addScore(Score score){
        this.scores.add(score);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCheckInYear() {
        return checkInYear;
    }

    public void setCheckInYear(String checkInYear) {
        this.checkInYear = checkInYear;
    }
}
