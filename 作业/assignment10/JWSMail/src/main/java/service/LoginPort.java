package service;

import javax.jws.WebService;

/**
 * Created by duanzhengmou on 6/13/17.
 */
@WebService(name = "service.LoginPort")
public interface LoginPort {

    public static final String TEACHER = "Teacher";
    public static final String STUDENT = "Student";
    public static final String GRA_STUDENT = "Graduate Student";
    public static final String INVALID = "Invalid";
    public static final String FAIL = "Fail";

    String login(String mail, String password);
}
