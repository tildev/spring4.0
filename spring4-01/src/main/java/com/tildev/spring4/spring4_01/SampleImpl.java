package com.tildev.spring4.spring4_01;

import java.util.List;

public class SampleImpl implements Sample {

    private String s;

    @Override
    public void test(List<String> list, String s) {
        System.out.println("String: " + s);
        System.out.println("list: " + list);
    }

    public void setS(String s) {
        this.s = s;
    }
}
