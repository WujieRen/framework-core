package cn.rwj.framework.spring;

/**
 * @author rwj
 * @since 2024/10/13
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}