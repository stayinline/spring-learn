package com.spring.learn.bean.definition;

import com.spring.learn.bean.definition.factory.BeanDemoFeactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanInitDemo {

    public static void main(String[] args) {
        // 创建容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(BeanDemo.class);
        // 启动应用上下文
        applicationContext.refresh();

        BeanDemoFeactory bean = applicationContext.getBean(BeanDemoFeactory.class);
        System.out.println("注解方式加载的bean的名称：" + bean);

        // 关闭应用上下文
        applicationContext.close();
    }
}
