package com.spring.learn.ioc.injection;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class XmlSetterInjectionDemo {

    public static void main(String[] args) {


        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        String xmlPath = "classpath:/META-INFO/dependency-setter-injection.xml";
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(xmlPath);
    }
}
