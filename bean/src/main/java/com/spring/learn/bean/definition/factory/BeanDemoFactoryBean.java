package com.spring.learn.bean.definition.factory;

import com.spring.learn.bean.definition.BeanDemo;
import org.springframework.beans.factory.FactoryBean;

public class BeanDemoFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return BeanDemo.newInstance();
    }

    @Override
    public Class<?> getObjectType() {
        return BeanDemo.class;
    }
}
