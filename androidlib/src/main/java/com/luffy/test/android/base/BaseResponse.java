package com.luffy.test.android.base;

public class BaseResponse {

    public int mResultCode;
    public String mMsg;
    public Object[] mDatas;

    public BaseResponse() {
    }

    public BaseResponse(int resultCode, Object... objects) {
        this.mResultCode = resultCode;
        this.mDatas = objects;
    }

    public BaseResponse(int resultCode, String errorMsg, Object... data) {
        this.mResultCode = resultCode;
        this.mMsg = errorMsg;
        this.mDatas = data;
    }

    public boolean isSuccess() {
        return mResultCode == ErrorCode.SUCCESS;
    }

}
