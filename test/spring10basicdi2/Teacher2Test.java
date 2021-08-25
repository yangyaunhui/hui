package spring10basicdi2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher2Test {
    @Test
    public void test01() {
        String xml = "spring10basicdi2/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Teacher2 teacher2 = ac.getBean("teacher2", Teacher2.class);
        System.out.println("teacher2 = " + teacher2);
    }
}
