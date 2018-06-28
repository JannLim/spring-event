/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.springevent.listener;

import com.codedemo.springevent.event.DemoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Describe: 事件监听器，利用@EventListener注解，注解中的入参为要监听的事件
 * @Author: linjuanjuan
 * @Date: 2018/6/28 17:16
 * @Version: 1.0
 */
@Component
public class DemoListener2 {

    @Async
    @EventListener
    public void execute(DemoEvent event) {
        System.out.println("DemoListener2 监听到事件");
        System.out.println("事件的内容是：" + event.getMessage());
    }

}
