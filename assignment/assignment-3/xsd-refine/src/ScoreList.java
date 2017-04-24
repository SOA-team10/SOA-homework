import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by duanzhengmou on 4/23/17.
 */
public class ScoreList {
    private List<Score> scoreList = new LinkedList<>();

    public ScoreList(boolean setFail){

    }

    public Iterator<Score> getIterator(){
        return this.scoreList.iterator();
    }
}
