package cn.rwj.framework.spring.factory;


import cn.rwj.framework.spring.BeansException;

/**
 * Bean工厂
 *
 * @author rwj
 * @since 2024/10/13
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
