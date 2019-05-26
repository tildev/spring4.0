package com.tildev.spring4.spring4_01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String configLocation = "classpath:applicationContext.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
        SampleVo sample = ctx.getBean("sample", SampleVo.class);
        sample.test();
        ctx.close();
    }
}
