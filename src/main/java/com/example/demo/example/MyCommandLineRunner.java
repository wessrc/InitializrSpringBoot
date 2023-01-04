package com.example.demo.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 这个接口也只有一个方法：run(String... args)，触发时机为整个项目启动完毕后，自动执行。
 * 如果有多个CommandLineRunner，可以利用@Order来进行排序。
 * <p>
 * 使用场景：用户扩展此接口，进行启动项目之后一些业务的预处理。
 * <p>
 * 13-0
 */
@Slf4j
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        log.info("=====> [13-1] MyCommandLineRunner -> run()");
    }

}
