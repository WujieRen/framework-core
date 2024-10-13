package cn.rwj.framework.spring.beans.factory;

import cn.rwj.framework.spring.beans.BeansException;

import java.util.Map;

/**
 * 扩展 {@link BeanFactory} 接口，由能够枚举所有 bean 实例的 bean 工厂实现，而不是按照客户端的请求逐个按名称查找 bean。
 * 预加载所有 bean 定义的 BeanFactory 实现（例如基于 XML 的工厂）可以实现此接口。
 *
 * @author rwj
 * @since 2024/10/13
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 按照类型返回 Bean 实例
     *
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * Return the names of all beans defined in this registry.
     * <p>
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
