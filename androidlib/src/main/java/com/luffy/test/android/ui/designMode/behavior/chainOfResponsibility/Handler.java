package com.luffy.test.android.ui.designMode.behavior.chainOfResponsibility;

/**
 * Created by lvlufei on 2020-07-28
 *
 * @name 抽象的处理者
 * <p>
 * 请假处理：组长1天；部门主管3天；经理7天；老板30天
 */
public abstract class Handler {
    private Handler mHandler;

    public Handler getHandler() {
        return mHandler;
    }

    public void setHandler(Handler Handler) {
        this.mHandler = Handler;
    }

    abstract void handleRequest(int days);
}
