package com.awesome.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigBeanDefinitionParser;

/**
 * Created by Anurag Mishra on 14-04-2018.
 */
public class AppTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Student student1 = (Student) context.getBean("stud");
        student1.getId();
        student1.getName();
        System.out.println("Student details are:" + student1.toString());
    }
}
