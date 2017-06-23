package main;


import ass7.StuScoreImpl;
import ass7.StuScoreInterface;
import ass8.InfoManageImpl;
import ass8.InfoManagementInterface;
import ass8.VerificationImpl;
import ass8.VerificationInterface;

import javax.xml.ws.Endpoint;

/**
 * Created by  ‡˜ on 2017/6/13.
 */

public class App {

  public static void main(String[] argv) {
//    ScoreService service = new ScoreService();
    StuScoreInterface score = new StuScoreImpl();
    InfoManagementInterface info = new InfoManageImpl();
    VerificationInterface verify = new VerificationImpl();
    String address = "http://0.0.0.0:8888";
    Endpoint.publish(address+"/stuScore", score);
    System.out.println("stuScore published");
    Endpoint.publish(address+"/info",info);
    System.out.println("info published");
    Endpoint.publish(address+"/verify",verify);
    System.out.println("verify published");
  }
}
