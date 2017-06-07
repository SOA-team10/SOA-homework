package Entities.jw;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by duanzhengmou on 6/6/17.
 */
@XmlRootElement(name = "score", namespace = "http://jw.nju.edu.cn/schema")
public class Score implements Serializable, Comparable{
    String scoreType;
    int scoreValue;

    public String getScoreType() {
        return scoreType;
    }

    @XmlElement(namespace = "http://jw.nju.edu.cn/schema")
    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    @XmlElement(namespace = "http://jw.nju.edu.cn/schema")
    public void setScoreValue(int scoreValue) {
        this.scoreValue = scoreValue;
    }

    @Override
    public int compareTo(Object o) {
        Score score = (Score) o;
        int thisVal = this.getScoreValue();
        int thatVal = score.getScoreValue();
        if (thisVal == thatVal) return 0;

        return thisVal > thatVal ? -1 : 1;
    }
}
