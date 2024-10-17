package cn.rwj.framework.spring.beans;

import cn.rwj.framework.spring.context.ApplicationContext;

/**
 * Interface to be implemented by any object that wishes to be notified
 * of the {@link ApplicationContext} that it runs in.
 * <p>
 * 实现此接口，就能感知到所属的 ApplicationContext
 *
 * @author rwj
 * @since 2024/10/16
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
