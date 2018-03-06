package com.wf.demo.impl;

import com.wf.demo.task.TaskExecution;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * 数据持久化组建
 * Created by Mr_WF on 2018/3/6.
 */
@Slf4j
public class PersistComponent extends CommonComponent<List<Map<String,Object>>> {

    private  final Logger logger = LoggerFactory.getLogger(PersistComponent.class);

    @Override
    public List<Map<String, Object>> onExecute(List<Map<String, Object>> maps, TaskExecution taskExecution) {
        logger.info("PersistComponent组件开始{}","onExecute");
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
        logger.info("PersistComponent组件计算{}","onComplete");
        return null;
    }

    @Override
    public int onError(TaskExecution execution, Throwable throwable) {
        logger.info("PersistComponent组件计算{}","onError");
        throwable.printStackTrace();
        return 0;
    }
}
