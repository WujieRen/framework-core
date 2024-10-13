package cn.rwj.framework.spring.beans.factory;

import cn.rwj.framework.spring.beans.BeansException;
import cn.rwj.framework.spring.beans.factory.config.AutowireCapableBeanFactory;
import cn.rwj.framework.spring.beans.factory.config.BeanDefinition;
import cn.rwj.framework.spring.beans.factory.config.ConfigurableBeanFactory;

/**
 * 大多数可列出 bean 工厂都要实现的配置接口。除了 {@link ConfigurableBeanFactory} 之外，它还提供分析和修改 bean 定义以及预先实例化单例的功能。
 *
 * @author rwj
 * @since 2024/10/13
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
