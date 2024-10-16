package cn.rwj.framework.spring.test.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rwj
 * @since 2024/10/13
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod() {
        System.out.println("执行：init-method");
        hashMap.put("10001", "rwj");
        hashMap.put("10002", "sx");
        hashMap.put("10003", "ggb");
    }

    public void destroyDataMethod() {
        System.out.println("执行：destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
