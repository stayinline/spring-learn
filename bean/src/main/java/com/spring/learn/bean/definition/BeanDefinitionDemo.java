package com.spring.learn.bean.definition;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * 构建bean
 * 通过 BeanDefinitionBuilder
 */
public class BeanDefinitionDemo {

    public static void main(String[] args) {


        // 方式一：BeanDefinitionBuilder
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(BeanDemo.class);

        beanDefinitionBuilder.addPropertyValue("name", "张三");

        AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();

        // 此时的beanDefinition并不是终态，还可以进行其他操作


        // 方式二：GenericBeanDefinition
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(BeanDemo.class);

        MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
        mutablePropertyValues.add("name", "张三");

        genericBeanDefinition.setPropertyValues(mutablePropertyValues);



    }
}
