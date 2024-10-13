package cn.rwj.framework.spring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Bean工厂
 *
 * @author rwj
 * @since 2024/10/13
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
