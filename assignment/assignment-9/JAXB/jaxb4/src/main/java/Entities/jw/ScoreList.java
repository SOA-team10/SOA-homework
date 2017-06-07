package Entities.jw;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by duanzhengmou on 6/6/17.
 */
@XmlRootElement(name = "scoreList", namespace = "http://jw.nju.edu.cn/schema")
public class ScoreList implements Serializable{
    List<Score> scoreList;


    public List<Score> getScoreList() {
        return scoreList;
    }

    @XmlElement(name = "score", namespace = "http://jw.nju.edu.cn/schema")
    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
