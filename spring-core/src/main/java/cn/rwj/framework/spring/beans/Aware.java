package cn.rwj.framework.spring.beans;

/**
 * Marker superinterface indicating that a bean is eligible to be
 * notified by the Spring container of a particular framework object
 * through a callback-style method.  Actual method signature is
 * determined by individual subinterfaces, but should typically
 * consist of just one void-returning method that accepts a single
 * argument.
 * <p>
 * 标记超接口，表示某个 bean 有资格通过回调式方法由 Spring 容器通知特定框架对象。
 * 实际方法签名由各个子接口决定，但通常应仅包含一个接受单个参数的 void 返回方法。
 *
 * @author rwj
 * @since 2024/10/16
 */
public interface Aware {
}
