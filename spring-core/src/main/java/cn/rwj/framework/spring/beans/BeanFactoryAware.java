package cn.rwj.framework.spring.beans;

import cn.rwj.framework.spring.beans.factory.BeanFactory;

/**
 * Interface to be implemented by beans that wish to be aware of their owning {@link BeanFactory}.
 * <p>
 * 实现此接口，就能感知到所属的 BeanFactory
 *
 * @author rwj
 * @since 2024/10/16
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
    
}
