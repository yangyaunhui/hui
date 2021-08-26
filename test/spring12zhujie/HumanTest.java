package spring12zhujie;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanTest {
    @Test
    public void test01(){
        String xml = "spring12zhujie/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Human human = ac.getBean("human", Human.class);
        System.out.println("human = " + human);
    }
}
