package com.luffy.test.designpatternslib.behavior.chainOfResponsibility.patterns;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 责任链模式
 */
public class Invoker {
    public static void main(String[] args) {
        Handler handler1 = new HandlerGroupLeader();
        Handler handler2 = new HandlerDirector();
        Handler handler3 = new HandlerManager();
        Handler handler4 = new HandlerBoss();
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler3.setHandler(handler4);
        System.out.println(handler1.handleRequest(5));
    }
}
