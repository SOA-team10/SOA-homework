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
 * Created by ���ī^ on 2017/6/27.
 * ���handlerֻ��������score�������ɾ�ĵ�ʱ���ʹ��
 */
public class VerifyHandler implements SOAPHandler<SOAPMessageContext>{
    public Set<QName> getHeaders() {
        return null;
    }

    public boolean handleMessage(SOAPMessageContext context){

        //�ж��Ƿ�Ϊ���󣨷���Ӧ����
        Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        //���Ϊ��Ӧ����ֱ�ӷ���true��������
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

            �˺���֤���� account = new �˺���֤����();
            account.set����(email);
            account.set����(password);
            ��֤���� veriResult = auth.verify(account);
            if(veriResult.getȨ��().equals(Ȩ�޼���.������) || veriResult.getȨ��().equals(Ȩ�޼���.�о���)){
                File file = new File(PersistHandler.FILE_NAME);
                FileOutputStream stream = new FileOutputStream(file,true);
                String err = "���Ȩ�޲��ܽ��д������\n";
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
