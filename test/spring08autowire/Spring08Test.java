package spring08autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring08Test {
    @Test
    public void test01(){
        String xml = "spring08autowire/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Student student = ac.getBean("student", Student.class);
        student.play();
        System.out.println("student = " + student);
    }
}
