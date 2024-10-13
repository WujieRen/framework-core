package cn.rwj.framework.spring.beans.factory.support;

import cn.rwj.framework.spring.cores.io.DefaultResourceLoader;
import cn.rwj.framework.spring.cores.io.ResourceLoader;

/**
 * Bean定义读取器抽象类
 *
 * @author rwj
 * @since 2024/10/13
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
