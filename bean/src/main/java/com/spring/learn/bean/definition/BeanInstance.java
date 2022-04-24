package com.spring.learn.bean.definition;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean实例化
 */
public class BeanInstance {

    public static void main(String[] args) {

        // 方式一：
        // bean的配置文件路径
        String path = "classpath:/META-INF/bean-instation.xml";

        // 启动spring应用上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext(path);
        BeanDemo beanDemo = beanFactory.getBean("#beanDemo", BeanDemo.class);

        System.out.println(beanDemo);


        // 方式二：
        BeanDemo beanDemo2 = beanFactory.getBean("beanDemo2", BeanDemo.class);
        System.out.println(beanDemo2);
        System.out.println(beanDemo == beanDemo2);

        // 方式三：
        BeanDemo beanDemo3 = beanFactory.getBean("beanDemo3", BeanDemo.class);
        System.out.println(beanDemo3);
        System.out.println(beanDemo3 == beanDemo2);

    }

}
