package com.luffy.test.android.ui.owner.thread.entrance;

import com.luffy.test.android.ui.owner.thread.asyncTask.AsyncTaskActivity;
import com.luffy.test.android.ui.owner.thread.executorService.ExecutorServiceActivity;
import com.luffy.test.android.ui.owner.thread.handler.HandlerActivity;

public enum ThreadModel {

    THREAD_HANDLER("Handler", HandlerActivity.class),
    THREAD_ASYNC_TASK("AsyncTask（异步任务）", AsyncTaskActivity.class),
    THREAD_EXECUTOR_SERVICE("ExecutorService（线程池）", ExecutorServiceActivity.class);

    public String name;
    public Class mClass;

    ThreadModel(String name, Class mClass) {
        this.name = name;
        this.mClass = mClass;
    }
}
