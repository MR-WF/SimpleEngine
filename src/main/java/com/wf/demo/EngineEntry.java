package com.wf.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 引擎模拟入口
 * Created by Mr_WF on 2018/3/6.
 */
public class EngineEntry {
    List<Map<String,Object>> maps = new ArrayList<Map<String,Object>>();
    @org.junit.Test
    public void main(){
        List<Step> steps = initComponent();
        for (Step step : steps){
            Class<?> aClass = null;
            try {
                aClass = Class.forName(step.getComponentName());
                BaseComponent component = (BaseComponent)aClass.newInstance();
                maps = (List<Map<String, Object>>) component.onExecute(maps,null);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private List<Step> initComponent() {
        List<Step> list = new ArrayList<>();
        Step step = new Step(1L, "com.wf.demo.impl.DataComponent", 1, 0L);
        Step step2 = new Step(1L, "com.wf.demo.impl.CalcComponent", 1, 1L);
        Step step3 = new Step(1L, "com.wf.demo.impl.PersistComponent", 1, 2L);
        list.add(step);
        list.add(step2);
        list.add(step3);
        return list;
    }

}
