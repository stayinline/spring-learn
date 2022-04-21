package com.spring.learn.ioc.container;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class IocContainerByApplicationContext {

    public static void main(String[] args) {
        // 创建容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(IocContainerByApplicationContext.class);
        // 启动应用上下文
        applicationContext.refresh();

        String[] beanNamesForType = applicationContext.getBeanNamesForType(BeanDemo2.class);
        System.out.println("注解方式加载的bean的名称：" + Arrays.toString(beanNamesForType));

        // 关闭应用上下文
        applicationContext.close();
    }


}
