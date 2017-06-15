package main;


import ass7.StuScoreImpl;
import ass7.StuScoreInterface;

import javax.xml.ws.Endpoint;

/**
 * Created by  ‡˜ on 2017/6/13.
 */

public class App {

  public static void main(String[] argv) {
//    ScoreService service = new ScoreService();
    StuScoreInterface score = new StuScoreImpl();
//    InfoManagementInterface info = new InfoManageImpl();
//    VerificationInterface verify = new VerificationImpl();
    String address = "http://localhost:8888/ns";
    Endpoint.publish(address, score);
//    Endpoint.publish(address,info);
//    Endpoint.publish(address,verify);
  }
}
