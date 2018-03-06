package com.wf.demo.impl;

import com.wf.demo.task.TaskExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * 数据组件
 * Created by Mr_WF on 2018/3/6.
 */
public class DataComponent extends CommonComponent<List<Map<String,Object>>> {
    private  final Logger logger = LoggerFactory.getLogger(DataComponent.class);

    @Override
    public List<Map<String, Object>> onExecute(List<Map<String, Object>> maps, TaskExecution taskExecution) {
        logger.info("DataComponent组件开始{}","onExecute");
        try {
            //todo

            onComplete(maps,null);
        }catch (Exception e){
            onError(null,e);
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> onComplete(List<Map<String, Object>> maps, TaskExecution taskExecution) {
        logger.info("DataComponent组件计算{}","onComplete");
        return null;
    }

    @Override
    public int onError(TaskExecution execution, Throwable throwable) {
        logger.info("DataComponent组件计算{}","onError");
        throwable.printStackTrace();
        return 0;
    }
}
