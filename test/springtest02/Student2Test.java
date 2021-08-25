package springtest02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student2Test {
    @Test
    public void test01(){
        String xml = "springtest02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Student2 student2 = ac.getBean("student2", Student2.class);
        System.out.println("student2 = " + student2);
    }
}
