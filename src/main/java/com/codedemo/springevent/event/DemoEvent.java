/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.springevent.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Describe: 需要发布的事件，必须继承ApplicationEvent
 * @Author: linjuanjuan
 * @Date: 2018/6/28 15:31
 * @Version: 1.0
 */
public class DemoEvent extends ApplicationEvent {

    private String message;

    public DemoEvent(Object source) {
        super(source);
    }

    public DemoEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
