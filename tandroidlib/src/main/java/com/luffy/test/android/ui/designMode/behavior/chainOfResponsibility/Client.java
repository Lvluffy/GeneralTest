package com.luffy.test.android.ui.designMode.behavior.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new HandlerGroupLeader();
        Handler handler2 = new HandlerDirector();
        Handler handler3 = new HandlerManager();
        Handler handler4 = new HandlerBoss();
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler3.setHandler(handler4);
        handler1.handleRequest(5);
    }
}
