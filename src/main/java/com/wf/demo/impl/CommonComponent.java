package com.wf.demo.impl;

import com.wf.demo.BaseComponent;

/**
 * Created by Mr_WF on 2018/3/6.
 */
public abstract class CommonComponent<T> implements BaseComponent<T>{

     public String getStepName(){
        return "CommonComponent";
    }

}
