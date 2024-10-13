package cn.rwj.framework.spring.factory.config;

/**
 * 单例Bean的注册
 *
 * @author rwj
 * @since 2024/10/13
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
