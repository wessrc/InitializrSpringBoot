package com.example.demo.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * 这个扩展点也只有一个方法：destroy()，其触发时机为当此对象销毁时，会自动执行这个方法。
 * 比如说运行applicationContext.registerShutdownHook时，就会触发这个方法。
 * <p>
 * 14-0
 */
@Slf4j
@Component
public class MyDisposableBean implements DisposableBean {

    @Override
    public void destroy() {
        log.info("=====> [14-1] MyDisposableBean -> destroy()");
    }

}