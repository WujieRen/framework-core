package cn.rwj.framework.spring.beans.factory.config;

import cn.rwj.framework.spring.beans.BeansException;
import cn.rwj.framework.spring.beans.factory.BeanFactory;

/**
 * 扩展 {@link BeanFactory} 接口，由具有自动装配功能的 bean 工厂实现，只要它们想要为现有的 bean 实例公开此功能。
 *
 * @author rwj
 * @since 2024/10/13
 */
public interface AutowireCapableBeanFactory {

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
