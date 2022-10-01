package com.spring.learn.dependency.luckup;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;


/**
 * 通过ObjectProvider 查找
 * spring5.1之后才有
 */
public class ObjrectProviderDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ObjrectProviderDemo.class);
        applicationContext.refresh();
        lockupByObjectProvider(applicationContext);
        applicationContext.close();
    }

    @Bean
    public String helloWorld() {// 方法名就是类名
        return "hello,world";
    }

    private static void lockupByObjectProvider(AnnotationConfigApplicationContext applicationContext) {
        ObjectProvider<String> beanProvider = applicationContext.getBeanProvider(String.class);
        System.out.println(beanProvider.getObject());
    }
}
