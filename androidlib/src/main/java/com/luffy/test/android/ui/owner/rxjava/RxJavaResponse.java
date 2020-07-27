package com.luffy.test.android.ui.owner.rxjava;

public class RxJavaResponse {

    /**
     * 请求成功.所有接口调用成返回值都为0,非0表示失败.
     */
    public static final int SUCCESS = 0;

    public int mResultCode;
    public String mMsg;

    public RxJavaResponse(int resultCode) {
        this.mResultCode = resultCode;
    }

    public boolean isSuccess() {
        return mResultCode == SUCCESS;
    }

}
