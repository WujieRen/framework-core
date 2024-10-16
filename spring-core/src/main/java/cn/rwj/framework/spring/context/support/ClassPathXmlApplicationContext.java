package cn.rwj.framework.spring.context.support;

import cn.rwj.framework.spring.beans.BeansException;

/**
 * Standalone XML application context, taking the context definition files  from the class path,
 * interpreting plain paths as class path resource names  that include the package path (e.g.  mypackage/myresource.txt").
 * Useful for  test harnesses as well as for application contexts embedded within JARs.
 *
 * @author rwj
 * @since 2024/10/15
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {

    private String[] configLocations;

    public ClassPathXmlApplicationContext() {
    }

    /**
     * 从 XML 中加载 BeanDefinition，并刷新上下文
     *
     * @param configLocations
     * @throws BeansException
     */
    public ClassPathXmlApplicationContext(String configLocations) throws BeansException {
        this(new String[]{configLocations});
    }

    /**
     * 从 XML 中加载 BeanDefinition，并刷新上下文
     *
     * @param configLocations
     * @throws BeansException
     */
    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        this.configLocations = configLocations;
        refresh();
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }

}
