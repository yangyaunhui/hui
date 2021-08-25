package spring06di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring06DiTest {

    //刚刚是以set的方式注入的  set注入!!!常用
    @Test
    public void test01(){
        String xml = "spring06di/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        //我们要拿主体
        Person person = ac.getBean("person", Person.class);
        person.Play();

        //思考题:2个类直接的关系
        //人...手机..电脑..psp..小霸王
        //如何提高依赖效率
        //使用接口 同时也解耦了代码 让依赖关系由实体类依赖变为抽象的依赖,依赖关系就解开了
        //同理:也解释了Java3层架构中 为什么要用到接口
    }
}
