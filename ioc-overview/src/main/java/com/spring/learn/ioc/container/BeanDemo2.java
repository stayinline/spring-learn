package com.spring.learn.ioc.container;


import org.springframework.context.annotation.Bean;

//@Bean 这里依赖有问题
public class BeanDemo2 {

    private String name;

    public BeanDemo2(String name) {
        this.name = name;
    }

    public BeanDemo2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
