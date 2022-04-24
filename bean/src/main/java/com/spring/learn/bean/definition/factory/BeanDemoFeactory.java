package com.spring.learn.bean.definition.factory;

import com.spring.learn.bean.definition.BeanDemo;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanDemoFeactory implements BeanDemoFactoryInterface, InitializingBean, DisposableBean {

    @Override
    public BeanDemo createBeanDemo() {
        return BeanDemo.newInstance();
    }

    // 基于PostConstruct初始化
    @PostConstruct
    public void init() {
        System.out.println("通过 @PostConstruct 初始化");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("通过 InitializingBean.afterPropertiesSet 初始化");

    }

    @PreDestroy
    public void destroyBean() {
        System.out.println("通过 @PreDestroy 销毁");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("通过 DisposableBean.destroy 销毁");

    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("当前 bean 正在垃圾回收中");
    }
}
