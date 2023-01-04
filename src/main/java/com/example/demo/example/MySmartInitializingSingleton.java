package com.example.demo.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * 这个接口中只有一个方法afterSingletonsInstantiated，
 * 其作用是是 在spring容器管理的所有单例对象（非懒加载对象）初始化完成之后调用的回调接口。
 * 其触发时机为postProcessAfterInitialization之后。
 * <p>
 * 使用场景：用户可以扩展此接口在对所有单例对象初始化完毕后，做一些后置的业务处理。
 * <p>
 * 12-0
 */
@Slf4j
@Component
public class MySmartInitializingSingleton implements SmartInitializingSingleton {

    @Override
    public void afterSingletonsInstantiated() {
        log.info("=====> [12-1] MySmartInitializingSingleton -> afterSingletonsInstantiated()");
    }
}
