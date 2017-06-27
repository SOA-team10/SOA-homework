package handlerResolver;

import handler.PersistHandler;
import handler.VerifyHandler;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by уенд╚^ on 2017/6/27.
 */
public class VeriHandlerResolver implements HandlerResolver{
    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new PersistHandler());
        handlerChain.add(new VerifyHandler());
        return handlerChain;
    }
}
