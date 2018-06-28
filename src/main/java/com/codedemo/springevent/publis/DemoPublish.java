/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.springevent.publis;

import com.codedemo.springevent.event.DemoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe: 事件发布
 * @Author: linjuanjuan
 * @Date: 2018/6/28 15:43
 * @Version: 1.0
 */
@RestController
public class DemoPublish {

    @Autowired
    private ApplicationContext context;

    @GetMapping("demoListener1")
    public void demoListner1() {
        DemoEvent event = new DemoEvent(this,"demoListner1");
        context.publishEvent(event);
    }

    @GetMapping("demoListener2")
    public void demoListener2() {
        DemoEvent event = new DemoEvent(this,"demoListner2");
        context.publishEvent(event);
    }

}
