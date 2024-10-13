package cn.rwj.framework.spring;

/**
 * Bean定义
 *
 * @author rwj
 * @since 2024/10/13
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
    
}
