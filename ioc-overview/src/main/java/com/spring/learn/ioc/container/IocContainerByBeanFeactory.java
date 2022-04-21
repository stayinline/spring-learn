package com.spring.learn.ioc.container;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class IocContainerByBeanFeactory {

    public static void main(String[] args) {
        // 创建容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        String path = "classpath:/META-INF/bean-config.xml";
        // 加载配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        int beansCount = xmlBeanDefinitionReader.loadBeanDefinitions(path);
        System.out.println("xml方式加载的bean的数量：" + beansCount);
    }
}
