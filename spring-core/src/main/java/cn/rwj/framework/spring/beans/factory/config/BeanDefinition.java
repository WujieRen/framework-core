package cn.rwj.framework.spring.beans.factory.config;

/**
 * Bean定义，对创建Bean所需属性的封装，描述创建一个Bean所必须的要素
 *
 * @author rwj
 * @since 2024/10/13
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

}
