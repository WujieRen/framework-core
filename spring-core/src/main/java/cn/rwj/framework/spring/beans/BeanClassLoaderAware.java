package cn.rwj.framework.spring.beans;

/**
 * Callback that allows a bean to be aware of the bean
 * {@link ClassLoader class loader}; that is, the class loader used by the
 * present bean factory to load bean classes.
 * <p>
 * 允许一个bean感知其类加载器，即当前bean工厂来加载bean类的类加载器。
 *
 * @author rwj
 * @since 2024/10/16
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);

}
