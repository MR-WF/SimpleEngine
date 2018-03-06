package com.wf.demo.impl;

import com.wf.demo.task.TaskExecution;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * 计算组件
 * Created by Mr_WF on 2018/3/6.
 */
@Slf4j
public class CalcComponent extends CommonComponent<List<Map<String,Object>>> {

    private  final Logger logger = LoggerFactory.getLogger(CalcComponent.class);

    @Override
    public List<Map<String, Object>> onExecute(List<Map<String, Object>> maps, TaskExecution taskExecution) {
        logger.info("CalcComponent组件开始{}","onExecute");
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
        logger.info("CalcComponent组件计算{}","onComplete");
        return null;
    }

    @Override
    public int onError(TaskExecution execution, Throwable throwable) {
        logger.info("CalcComponent组件计算{}","onError");
        throwable.printStackTrace();
        return 0;
    }
}
