package com.luffy.test.android.base;

/**
 * TSMClient使用的错误码，用于向用户展示的，SP或TSM的错误码需要转一下与此错误码保持一致
 */
public class ErrorCode {

    /**
     * 请求成功.所有接口调用成返回值都为0,非0表示失败.
     */
    public static final int SUCCESS = 0;

    public static boolean isSuccess(int resultCode) {
        return resultCode == ErrorCode.SUCCESS;
    }
}
