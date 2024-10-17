package cn.rwj.framework.spring.beans.factory.support;

import cn.rwj.framework.spring.beans.BeansException;
import cn.rwj.framework.spring.beans.factory.BeanFactory;
import cn.rwj.framework.spring.beans.factory.config.AutowireCapableBeanFactory;
import cn.rwj.framework.spring.beans.factory.config.BeanDefinition;
import cn.rwj.framework.spring.beans.factory.config.BeanPostProcessor;
import cn.rwj.framework.spring.beans.factory.config.ConfigurableBeanFactory;
import cn.rwj.framework.spring.util.ClassUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象Bean工厂。
 * 封装了所有Bean工厂必须有的公共能力；
 * 定义获取Bean的标准流程/编排获取Bean的模板 getBean() —— 只定义了过程，具体实现交给子类
 * 同时继承 SingletonBeanRegistry ，具备了单例Bean对象注册、获取的能力，该能力也是所有的BeanFactory共有的能力
 * <p>
 * 接口(BeanFctory)规定了所有Bean工厂必须具备的能力，[实现/抽象]类（AbstractBeanFactory）可以拥有除必备的能力外更为丰富的能力
 *
 * @author rwj
 * @since 2024/10/13
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ConfigurableBeanFactory {

    /**
     * ClassLoader to resolve bean class names with, if necessary
     */
    private ClassLoader beanClassLoader = ClassUtils.getDefaultClassLoader();

    /**
     * BeanPostProcessors to apply in createBean
     */
    private final List<BeanPostProcessor> beanPostProcessors = new ArrayList<BeanPostProcessor>();


    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }

    /**
     * Return the list of BeanPostProcessors that will get applied
     * to beans created with this factory.
     */
    public List<BeanPostProcessor> getBeanPostProcessors() {
        return this.beanPostProcessors;
    }

    public ClassLoader getBeanClassLoader() {
        return this.beanClassLoader;
    }

}
