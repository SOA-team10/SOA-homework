package handler;

import services.auth.*;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
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
            SOAPHeader soapHeader = soapMsg.getSOAPHeader();
            String email = soapHeader.getAttribute("email");
            String password = soapHeader.getAttribute("pwd");
            MyAuth auth = new AuthControllerServiceLocator().getMyAuthPort();

            账号认证类型 account = new 账号认证类型();
            account.set邮箱(email);
            account.set密码(password);
            验证类型 veriResult = auth.verify(account);
            if(veriResult.get权限().equals(权限级别.本科生) || veriResult.get权限().equals(权限级别.研究生)){
//                FileWriter writer = new FileWriter(PersistHandler.FILE_NAME,true);
//                writer.append("权限级别不够");
//                writer.close();

                return true;
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
