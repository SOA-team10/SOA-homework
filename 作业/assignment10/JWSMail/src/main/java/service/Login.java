package service;

import com.sun.mail.util.MailLogger;

import javax.jws.WebService;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.xml.ws.Endpoint;
import java.util.Properties;

/**
 * Created by duanzhengmou on 6/13/17.
 */
@WebService(name = "service.Login", endpointInterface = "service.LoginPort")
public class Login implements LoginPort{

    public String login(String mail, String password) {
        boolean isConnected = false;
        // set mail server property
        Properties mailProps = new Properties();
        mailProps.setProperty("mail.debug", "true");
        mailProps.setProperty("mail.store.protocol", "imap");
        mailProps.setProperty("mail.imap.host", "imap.exmail.qq.com");
        // get mail session instance from property
        Session session = Session.getInstance(mailProps);
        Store store = null;
        try {
            store = session.getStore();
            store.connect(mail, password);
            isConnected = store.isConnected();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }finally {
            try {
                store.close();
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }

        if (!isConnected){
            return FAIL;
        }else{
            return getRole(mail);
        }
    }

    private String getRole(String mail){
        String[] mailSnippet = mail.split("@");
        if (mailSnippet.length < 2) return INVALID;

        String prefix = mailSnippet[0];
        String suffix = mailSnippet[1];

        if (suffix.equals("nju.edu.cn")){
            return TEACHER;
        }else{
            if (prefix.startsWith("MF")||prefix.startsWith("MG")){
                return GRA_STUDENT;
            }else if (isNumeric(prefix)){
                return STUDENT;
            }
        }

        return INVALID;
    }

    private boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }


    public static void main(String args[]){
        String ADDR = "http://localhost:8080/jwsMailLogin";
        Endpoint.publish(ADDR, new Login());
        System.out.println("Published");
    }
}
