package cn.rwj.framework.spring.beans.factory.config;

/**
 * Bean引用，用于描述Bean类型的属性
 *
 * @author rwj
 * @since 2024/10/13
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
    
}
