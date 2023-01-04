package com.example.demo.example;

import com.example.demo.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 这个接口在读取项目中的beanDefinition之后执行，提供一个补充的扩展点
 * 使用场景：可以在这里动态注册自己的beanDefinition，可以加载classpath之外的bean
 * <p>
 * 2-0
 */
@Slf4j
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        log.info("=====> [2-1] MyBeanDefinitionRegistryPostProcessor -> postProcessBeanDefinitionRegistry()");
        log.info("=====> [2-1] postProcessBeanDefinitionRegistry Bean的数量：" + registry.getBeanDefinitionCount());
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(UserInfo.class).getBeanDefinition();
        registry.registerBeanDefinition("Hello", beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("=====> [2-2] MyBeanDefinitionRegistryPostProcessor -> postProcessBeanFactory()");
        log.info("=====> [2-2] MyBeanDefinitionRegistryPostProcessor Bean的数量：" + beanFactory.getBeanDefinitionCount());
    }
}