package cn.rwj.framework.spring.test;

import cn.rwj.framework.spring.beans.factory.support.DefaultListableBeanFactory;
import cn.rwj.framework.spring.beans.factory.xml.XmlBeanDefinitionReader;
import cn.rwj.framework.spring.context.support.ClassPathXmlApplicationContext;
import cn.rwj.framework.spring.test.beans.UserService;
import cn.rwj.framework.spring.test.common.MyBeanFactoryPostProcessor;
import cn.rwj.framework.spring.test.common.MyBeanPostProcessor;
import org.junit.Test;

/**
 * @author rwj
 * @since 2024/10/15
 */
public class ApiTest2 {


    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        // 3. BeanDefinition 加载完成 & Bean实例化之前，修改 BeanDefinition 的属性值
        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        // 4. Bean实例化之后，修改 Bean 属性信息
        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        // 5. 获取Bean对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

    @Test
    public void test_xml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

}
