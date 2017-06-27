package handlerResolver;

import handler.PersistHandler;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by уенд╚^ on 2017/6/27.
 */
public class DefaultHandlerResolver implements HandlerResolver{
    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        ArrayList<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new PersistHandler());
        return handlerChain;
    }
}
