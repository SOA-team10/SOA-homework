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
            SOAPHeader soapHeader = soapMsg.getSOAPHeader();
            String email = soapHeader.getAttribute("email");
            String password = soapHeader.getAttribute("pwd");
            MyAuth auth = new AuthControllerServiceLocator().getMyAuthPort();

            �˺���֤���� account = new �˺���֤����();
            account.set����(email);
            account.set����(password);
            ��֤���� veriResult = auth.verify(account);
            if(veriResult.getȨ��().equals(Ȩ�޼���.������) || veriResult.getȨ��().equals(Ȩ�޼���.�о���)){
//                FileWriter writer = new FileWriter(PersistHandler.FILE_NAME,true);
//                writer.append("Ȩ�޼��𲻹�");
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
