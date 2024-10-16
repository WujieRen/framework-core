package cn.rwj.framework.spring.context;

import cn.rwj.framework.spring.beans.BeansException;

/**
 * 被大多数应用程序上下文实现的的SPI接口。除了支持{@link ApplicationContext}接口中的方法，还提供配置应用上下文的工具。
 *
 * @author rwj
 * @since 2024/10/15
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

}
