package com.spring.learn.ioc.container;

public class BeanDemo {

    private String name;

    public BeanDemo(String name) {
        this.name = name;
    }

    public BeanDemo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
