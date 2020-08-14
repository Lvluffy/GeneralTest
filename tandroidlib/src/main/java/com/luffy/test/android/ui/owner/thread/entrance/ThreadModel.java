package com.luffy.test.android.ui.owner.thread.entrance;

import com.luffy.test.android.ui.owner.activityForResult.BankCardDetailActivity;
import com.luffy.test.android.ui.owner.thread.asyncTask.AsyncTaskActivity;
import com.luffy.test.android.ui.tsm.multiCard.MultiCardActivity;

public enum ThreadModel {

    THREAD_HANDLER("Handler", BankCardDetailActivity.class),
    THREAD_ASYNC_TASK("AsyncTask（异步任务）", AsyncTaskActivity.class),
    THREAD_EXECUTOR_SERVICE("ExecutorService（线程池）", MultiCardActivity.class);

    private String name;
    private Class aClass;

    ThreadModel(String name, Class aClass) {
        this.name = name;
        this.aClass = aClass;
    }

    public String getName() {
        return name;
    }

    public Class getaClass() {
        return aClass;
    }
}
