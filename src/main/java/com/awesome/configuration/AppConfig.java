package com.awesome.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Anurag Mishra on 14-04-2018.
 */

@Configuration
public class AppConfig {
    @Bean(name = "stud")
    public Student student(){
        Student student = new Student();
        student.setId(101);
        student.setName("Kanchan");
        return student;
    }


}
