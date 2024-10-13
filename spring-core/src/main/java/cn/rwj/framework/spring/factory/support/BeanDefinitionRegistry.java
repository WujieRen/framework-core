package cn.rwj.framework.spring.factory.support;

import cn.rwj.framework.spring.factory.config.BeanDefinition;

/**
 * BeanDefinition 注册
 *
 * @author rwj
 * @since 2024/10/13
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
