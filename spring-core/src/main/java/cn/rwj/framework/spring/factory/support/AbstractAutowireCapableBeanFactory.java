package cn.rwj.framework.spring.factory.support;

import cn.rwj.framework.spring.BeansException;
import cn.rwj.framework.spring.factory.config.BeanDefinition;

/**
 * 具有自动注入能力的Bean工厂
 *
 * @author rwj
 * @since 2024/10/13
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

}
