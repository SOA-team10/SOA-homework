import java.text.ParseException;

/**
 * Created by 张文玘 on 2017/4/16.
 */
public interface XmlInterface {

    public void createXml(String fileName) throws ParseException;

    public void parseXml(String fileName);
}
