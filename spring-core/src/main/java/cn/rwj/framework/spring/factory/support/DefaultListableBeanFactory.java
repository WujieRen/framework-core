package cn.rwj.framework.spring.factory.support;

import cn.rwj.framework.spring.BeansException;
import cn.rwj.framework.spring.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * Listable Bean工厂实现。只是做了 beanDefinitionMap 的维护；其他步骤已由父类实现，注册、获取 BeanDefinition 的功能下沉到了本类。
 * getBeanDefinition 是父类工厂 crateBean 所必须的步骤，由父类工厂做了定义；
 * registerBeanDefinition 是由 BeanDefinitionRegistry 接口定义；
 * 以上定义统一放在了 DefaultListableBeanFactory 中实现。
 *
 * @author rwj
 * @since 2024/10/13
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

}
