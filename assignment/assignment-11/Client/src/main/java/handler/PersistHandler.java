package handler;


import com.sun.xml.internal.messaging.saaj.soap.SOAPVersionMismatchException;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.*;
import java.util.Set;

/**
 * Created by уенд╚^ on 2017/6/27.
 */
public class PersistHandler implements SOAPHandler<SOAPMessageContext>{
    public static String FILE_NAME = System.getProperty("user.dir")+"/src/main/resource/log.txt";


    public Set<QName> getHeaders() {
        return null;
    }

    public boolean handleMessage(SOAPMessageContext context) {
        Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        StringBuilder builder = new StringBuilder();
        if(isRequest){
            builder.append("=============Request=============\n");
        }else{
            builder.append("=============Response============\n");
        }

        File file = new File(FILE_NAME);
        try {
            FileOutputStream stream = new FileOutputStream(file,true);
            stream.write(builder.toString().getBytes());
            SOAPMessage message = context.getMessage();
            message.writeTo(stream);
            String changeRow = "\n";
            stream.write(changeRow.getBytes());
            stream.close();
            return true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SOAPException e) {
            e.printStackTrace();
        }


        return false;
}

    public boolean handleFault(SOAPMessageContext context) {
        System.out.println("persist handle fault");

        return false;
    }

    public void close(MessageContext context) {
        System.out.println("close persist handle");
    }
}
