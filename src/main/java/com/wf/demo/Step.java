package com.wf.demo;

import lombok.Getter;
import lombok.Setter;

/**
 * 组件每一步
 */
@Setter
@Getter
public class Step {

    private Long id;

    private String componentName;

    private int index;

    private Long parentId;

    public Step(Long id, String componentName, int index, Long parentId) {
        this.id = id;
        this.componentName = componentName;
        this.index = index;
        this.parentId = parentId;
    }

}
