package cn.rwj.framework.spring.context.support;

import cn.rwj.framework.spring.beans.BeansException;
import cn.rwj.framework.spring.beans.factory.ConfigurableListableBeanFactory;
import cn.rwj.framework.spring.beans.factory.support.DefaultListableBeanFactory;

/**
 * Base class for {@link AbstractApplicationContext}  implementations which are supposed to support multiple calls to {@link #refresh()},
 * creating a new internal bean factory instance every time.
 * Typically (but not necessarily), such a context will be driven by a set of config locations to load bean definitions from.
 *
 * @author rwj
 * @since 2024/10/15
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
