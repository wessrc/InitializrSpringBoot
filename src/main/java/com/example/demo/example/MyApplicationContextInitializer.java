package com.example.demo.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 可以在整个spring容器还没被初始化之前做一些事情
 * 可以在最开始激活一些配置，或者利用这时候class还没被类加载器加载的时机，进行动态字节码注入等操作
 * 因为这时候spring容器还没被初始化，所以想要自己的扩展的生效，有以下三种方式：
 * <p>
 * 1.在启动类中加入 springApplication.addInitializers(new MyApplicationContextInitializer())
 * <p>
 * public static void main(String[] args) {
 * SpringApplication springApplication = new SpringApplication(InitializrSpringBootApplication.class);
 * springApplication.addInitializers(new MyApplicationContextInitializer());
 * springApplication.run(args);
 * }
 * <p>
 * 2.配置文件配置 context.initializer.classes=com.example.demo.MyApplicationContextInitializer
 * 3.Spring SPI扩展，在spring.factories中加入org.springframework.context.ApplicationContextInitializer=com.example.demo.MyApplicationContextInitializer
 * <p>
 * 1-0
 */
@Slf4j
public class MyApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        log.info("=====> [1-1] MyApplicationContextInitializer -> initialize()");
    }

}