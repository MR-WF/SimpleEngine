package com.wf.demo;

import com.wf.demo.task.TaskExecution;

/**
 * Created by Mr_WF on 2018/3/6.
 */
public interface BaseComponent<T> {

    String getStepName();

    /**
     * 主要的业务逻辑实现，如果抛出任何异常，表示改步骤执行失败，会调用该步骤和已经执行完的步骤的onError方法
     * @param t
     * @param taskExecution
     * @return
     */
     T onExecute(T t,TaskExecution taskExecution);

    /**
     * 组件执行完成后
     * @param t
     * @param taskExecution
     * @return
     */
    T onComplete(T t,TaskExecution taskExecution);

    /**
     * 执行过程中出错时调用，如果抛出异常，会被框架给忽略掉。已完成其他步骤的onError方法调用
     * @param execution
     * @param throwable
     * @return
     */
    int onError(TaskExecution execution, Throwable throwable);
}
