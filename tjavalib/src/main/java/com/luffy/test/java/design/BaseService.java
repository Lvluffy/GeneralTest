package com.luffy.test.java.design;

public class BaseService implements IService {

    protected String mReader;

    public BaseService() {
        mReader = "base";
    }

    @Override
    public String getResult() {
        return BaseService.class.getSimpleName();
    }
}
