package com.spring.learn.bean.definition;

import com.spring.learn.bean.definition.factory.BeanDemoFeactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanGCDemo {

    public static void main(String[] args) {
        // 创建容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(BeanDemo.class);
        // 启动应用上下文
        applicationContext.refresh();


        // 关闭应用上下文
        applicationContext.close();
        System.out.println("applicationContext 已关闭");
        System.gc();
    }
}
