package org.arielviera.tests;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * @author ariel.viera@gmail.com (Ariel Viera)
 */
@ServerEndpoint("/ping")
public class WebSocketEndpoint {
    private Session session;

    @OnOpen
    public void onOpen(Session session){
        this.session = session;
        System.out.println("websocket opened : "+session.getId());
    }

    @OnMessage
    public String onMessage(String txt){
        return "pong";
    }
}
