package handler;

import org.w3c.dom.*;
import services.auth.*;

import javax.swing.text.html.HTMLDocument;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.*;
import javax.xml.soap.Node;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by 张文玘 on 2017/6/27.
 * 这个handler只有在请求score服务的增删改的时候会使用
 */
public class VerifyHandler implements SOAPHandler<SOAPMessageContext>{
    public Set<QName> getHeaders() {
        return null;
    }

    public boolean handleMessage(SOAPMessageContext context){

        //判断是否为请求（非响应方向）
        Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        //如果为响应方向，直接返回true不做处理
        if(!isRequest){
            return true;
        }
        try {
            SOAPMessage soapMsg = context.getMessage();
            SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
            SOAPHeader soapHeader = soapEnv.getHeader();

            String email = "";
            String password="";
            Iterator it = soapHeader.extractAllHeaderElements();
            while(it.hasNext()){
                SOAPHeaderElement ele = (SOAPHeaderElement) it.next();
                if(ele.getElementName().getLocalName().equals("email")){
                    email = ele.getValue();
                }else if(ele.getElementName().getLocalName().equals("pwd")){
                    password = ele.getValue();
                }

            }


            MyAuth auth = new AuthControllerServiceLocator().getMyAuthPort();

            账号认证类型 account = new 账号认证类型();
            account.set邮箱(email);
            account.set密码(password);
            验证类型 veriResult = auth.verify(account);
            if(veriResult.get权限().equals(权限级别.本科生) || veriResult.get权限().equals(权限级别.研究生)){
                File file = new File(PersistHandler.FILE_NAME);
                FileOutputStream stream = new FileOutputStream(file,true);
                String err = "你的权限不能进行此项操作\n";
                stream.write(err.getBytes());
                stream.close();
                return false;
            }

        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    public void close(MessageContext context) {

    }
}
