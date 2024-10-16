package cn.rwj.framework.spring.test.common;

import cn.rwj.framework.spring.beans.BeansException;
import cn.rwj.framework.spring.beans.factory.config.BeanPostProcessor;
import cn.rwj.framework.spring.test.beans.UserService;

/**
 * @author rwj
 * @since 2024/10/15
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
