package cn.rwj.framework.spring.beans.factory.support;

import cn.rwj.framework.spring.beans.BeansException;
import cn.rwj.framework.spring.cores.io.Resource;
import cn.rwj.framework.spring.cores.io.ResourceLoader;

/**
 * bean定义读取器，拥有加载、注册bean定义（BeanDefinitionRegistry）的能力
 *
 * @author rwj
 * @since 2024/10/13
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
