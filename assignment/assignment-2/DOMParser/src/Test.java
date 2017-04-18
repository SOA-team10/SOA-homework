import java.text.ParseException;

/**
 * Created by 张文玘 on 2017/4/17.
 */
public class Test {
    public static void main(String[] args){
        XmlDomImpl xml = new XmlDomImpl();
        xml.init();
        try {
            xml.createXml("./studentList.xml");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
