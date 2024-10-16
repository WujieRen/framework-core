package cn.rwj.framework.spring.beans.factory.config;

import cn.rwj.framework.spring.beans.factory.BeanFactory;
import cn.rwj.framework.spring.beans.factory.HierarchicalBeanFactory;

/**
 * 大多数 bean 工厂都要实现的配置接口。除了 {@link BeanFactory} 接口中的 bean 工厂客户端方法外，还提供配置 bean 工厂的工具。
 *
 * @author rwj
 * @since 2024/10/13
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
