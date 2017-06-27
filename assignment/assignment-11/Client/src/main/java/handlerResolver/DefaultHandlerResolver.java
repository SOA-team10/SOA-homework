package handlerResolver;

import handler.PersistHandler;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by уенд╚^ on 2017/6/27.
 */
public class DefaultHandlerResolver implements HandlerResolver{
//    private List<Handler> handlerChain = new ArrayList<Handler>();
//    public DefaultHandlerResolver(){
//        this.handlerChain.add(new PersistHandler());
//    }
    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        ArrayList<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new PersistHandler());
        return handlerChain;
    }
}
