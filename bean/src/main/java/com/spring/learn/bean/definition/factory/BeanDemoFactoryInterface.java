package com.spring.learn.bean.definition.factory;

import com.spring.learn.bean.definition.BeanDemo;

public interface BeanDemoFactoryInterface {

    default BeanDemo createBeanDemo() {
        return new BeanDemo();
    }
}
