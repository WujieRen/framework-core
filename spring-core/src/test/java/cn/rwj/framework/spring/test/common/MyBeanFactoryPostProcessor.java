package cn.rwj.framework.spring.test.common;

import cn.rwj.framework.spring.beans.BeansException;
import cn.rwj.framework.spring.beans.PropertyValue;
import cn.rwj.framework.spring.beans.PropertyValues;
import cn.rwj.framework.spring.beans.factory.ConfigurableListableBeanFactory;
import cn.rwj.framework.spring.beans.factory.config.BeanDefinition;
import cn.rwj.framework.spring.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author rwj
 * @since 2024/10/15
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}
