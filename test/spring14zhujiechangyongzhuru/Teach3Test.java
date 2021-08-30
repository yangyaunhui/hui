package spring14zhujiechangyongzhuru;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teach3Test {
    @Test
    public void test01(){
        String xml = "spring14zhujiechangyongzhuru/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Teacher3 teacher3 = ac.getBean("teacher3", Teacher3.class);
        System.out.println("teacher3 = " + teacher3);
    }
}
