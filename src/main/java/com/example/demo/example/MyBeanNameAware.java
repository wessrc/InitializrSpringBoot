package com.example.demo.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * 这个类也是Aware扩展的一种，触发点在bean的初始化之前，也就是postProcessBeforeInitialization之前，
 * 这个类的触发点方法只有一个：setBeanName
 * <p>
 * 使用场景为：用户可以扩展这个点，在初始化bean之前拿到spring容器中注册的的beanName，来自行修改这个beanName的值
 * 8-0
 */
@Slf4j
@Component
public class MyBeanNameAware implements BeanNameAware {

    public MyBeanNameAware() {
        log.info("=====> [8-1] MyBeanNameAware -> constructor()");
    }

    @Override
    public void setBeanName(String name) {
        log.info("=====> [8-2] BeanNameAware -> setBeanName() " + name);
    }
}