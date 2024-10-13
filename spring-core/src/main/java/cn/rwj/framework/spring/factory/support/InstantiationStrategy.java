package cn.rwj.framework.spring.factory.support;

import cn.rwj.framework.spring.BeansException;
import cn.rwj.framework.spring.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 实例化策略
 *
 * @author rwj
 * @since 2024/10/13
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
