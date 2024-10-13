package cn.rwj.framework.spring.beans;

/**
 * bean属性信息
 *
 * @author rwj
 * @since 2024/10/13
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
