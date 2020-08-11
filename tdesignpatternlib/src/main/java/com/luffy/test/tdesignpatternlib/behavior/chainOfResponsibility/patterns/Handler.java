package com.luffy.test.tdesignpatternlib.behavior.chainOfResponsibility.patterns;

/**
 * Created by lvlufei on 2020-07-28
 *
 * @name 责任链模式-抽象的处理者
 * <p>
 * 请假处理：组长1天；部门主管3天；经理7天；老板30天
 */
public abstract class Handler {

    //组长的权限（1天）
    public static int GROUP_LEADE_PERMISSIONS = 1;
    //部门主管的权限（3天）
    public static int DIRECTOR_PERMISSIONS = 3;
    //经理的权限（7天）
    public static int MANAGER_PERMISSIONS = 7;
    //老板的权限（30天）
    public static int BOSS_PERMISSIONS = 30;

    private Handler mHandler;

    public Handler getHandler() {
        return mHandler;
    }

    public void setHandler(Handler Handler) {
        this.mHandler = Handler;
    }

    public abstract String handleRequest(int days);
}
