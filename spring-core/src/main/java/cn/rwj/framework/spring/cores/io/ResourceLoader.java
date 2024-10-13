package cn.rwj.framework.spring.cores.io;

/**
 * 加载资源对象
 *
 * @author rwj
 * @since 2024/10/13
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
