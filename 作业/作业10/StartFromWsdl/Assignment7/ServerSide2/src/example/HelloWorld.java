package example;
import wsdl.ScoreService;
import wsdl.StuScoreImpl;
import wsdl.StuScoreInterface;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by  ‡˜ on 2017/6/13.
 */

public class HelloWorld {

  public static void main(String[] argv) {
//    ScoreService service = new ScoreService();
    StuScoreInterface score = new StuScoreImpl();
    String address = "http://localhost:8888/ns";
    Endpoint.publish(address, score);
  }
}
