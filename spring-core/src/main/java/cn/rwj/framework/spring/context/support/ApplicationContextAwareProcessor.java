package cn.rwj.framework.spring.context.support;

import cn.rwj.framework.spring.beans.ApplicationContextAware;
import cn.rwj.framework.spring.beans.BeansException;
import cn.rwj.framework.spring.beans.factory.config.BeanPostProcessor;
import cn.rwj.framework.spring.context.ApplicationContext;

/**
 * @author rwj
 * @since 2024/10/16
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
