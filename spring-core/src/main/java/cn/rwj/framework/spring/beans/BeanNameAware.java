package cn.rwj.framework.spring.beans;

/**
 * Interface to be implemented by beans that want to be aware of their
 * bean name in a bean factory. Note that it is not usually recommended
 * that an object depend on its bean name, as this represents a potentially
 * brittle dependence on external configuration, as well as a possibly
 * unnecessary dependence on a Spring API.
 * <p>
 * 需要由想要了解其 bean 工厂中的 bean 名称的 bean 实现的接口。
 * 请注意，通常不建议对象依赖于其 bean 名称，因为这表示对外部配置的潜在脆弱依赖，以及对 Spring API 的可能不必要的依赖。
 *
 * @author rwj
 * @since 2024/10/16
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);

}
