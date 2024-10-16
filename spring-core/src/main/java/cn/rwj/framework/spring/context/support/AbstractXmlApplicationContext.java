package cn.rwj.framework.spring.context.support;

import cn.rwj.framework.spring.beans.factory.support.DefaultListableBeanFactory;
import cn.rwj.framework.spring.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Convenient base class for {@link AbstractApplicationContext}
 * implementations, drawing configuration from XML documents containing bean definitions
 * understood by an {@link AbstractApplicationContext}.
 *
 * @author rwj
 * @since 2024/10/15
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
