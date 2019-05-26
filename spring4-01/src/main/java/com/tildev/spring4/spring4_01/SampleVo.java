package com.tildev.spring4.spring4_01;

import java.util.List;

public class SampleVo {

    private List<String> list;

    private String s;

    private Sample sample;

    public SampleVo() {
        super();
    }

    public SampleVo(List<String> list, String s, Sample sample) {
        super();
        this.list = list;
        this.s = s;
        this.sample = sample;
    }

    public void test() {
        sample.test(list, s);
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Sample getSample() {
        return sample;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    @Override
    public String toString() {
        return "Test [list=" + list + ", s=" + s + ", sample=" + sample + "]";
    }
}
