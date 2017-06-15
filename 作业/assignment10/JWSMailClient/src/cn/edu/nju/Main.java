package cn.edu.nju;

/**
 * Created by duanzhengmou on 6/13/17.
 */
public class Main {
    public static void main(String args[]){
        // main
        ServiceLoginPort ls = new LoginService().getServiceLoginPort();
        String result = ls.login("141250033@smail.nju.edu.cn", "password");
        System.out.println(result);
    }
}
