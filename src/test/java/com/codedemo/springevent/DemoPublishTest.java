/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.springevent;

import com.codedemo.springevent.publis.DemoPublish;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Describe: 测试
 * @Author: linjuanjuan
 * @Date: 2018/6/28 17:00
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringEventApplication.class)
@WebAppConfiguration
public class DemoPublishTest {

    @Autowired
    protected WebApplicationContext webApplicationContext;
    @Autowired
    private DemoPublish demoPublish;

    protected MockMvc mockMvc;

    @Before
    public void setMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void demoListner1Test() {
        demoPublish.demoListner1();
        demoPublish.demoListener2();
    }

}
