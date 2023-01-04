package com.example.demo;

import com.example.demo.example.MyFactoryBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class InitializrSpringBootApplication {

    static MyFactoryBean myFactoryBean;

    public InitializrSpringBootApplication(MyFactoryBean myFactoryBean) {
        log.info("=====> [998] InitializrSpringBootApplication()");
        InitializrSpringBootApplication.myFactoryBean = myFactoryBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(InitializrSpringBootApplication.class, args);
        myFactoryBean.getObject();
        log.info("=====> [999] InitializrSpring start success");
    }

}
