/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.springevent.listener;

import com.codedemo.springevent.event.DemoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Describe: 事件监听器，必须实现ApplicationListener，泛型中存放的是需要监听的事件
 * @Author: linjuanjuan
 * @Date: 2018/6/28 15:43
 * @Version: 1.0
 */
@Component
public class DemoListener1 implements ApplicationListener<DemoEvent> {

    @Async  //需要异步执行时添加注解
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("DemoListner1 监听到事件");
        System.out.println("事件的内容是：" + demoEvent.getMessage());
    }

}
