package spring07di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring07DiTest {
    //06讲的是set注入 现在讲构造器注入
    @Test
    public void test01(){
        String xml = "spring07di/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        People people = ac.getBean("people", People.class);
        people.play();

    }
}
