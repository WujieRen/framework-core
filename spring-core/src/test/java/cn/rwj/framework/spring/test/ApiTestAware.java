package cn.rwj.framework.spring.test;

import cn.rwj.framework.spring.context.support.ClassPathXmlApplicationContext;
import cn.rwj.framework.spring.test.beans.UserService;
import org.junit.Test;

/**
 * @author rwj
 * @since 2024/10/16
 */
public class ApiTestAware {

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);

        System.out.println("ApplicationContextAware：" + userService.getApplicationContext());
        System.out.println("BeanFactoryAware：" + userService.getBeanFactory());
    }

}
