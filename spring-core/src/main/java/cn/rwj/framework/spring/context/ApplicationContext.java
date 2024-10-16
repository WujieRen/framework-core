package cn.rwj.framework.spring.context;

import cn.rwj.framework.spring.beans.factory.ListableBeanFactory;

/**
 * 为应用程序提供配置的中央接口。在应用程序运行时，这是只读的，但是如果实现了该接口，可以实现重载。
 *
 * @author rwj
 * @since 2024/10/15
 */
public interface ApplicationContext extends ListableBeanFactory {
}
