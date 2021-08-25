package springtest01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentELTest {
    @Test
    public void test01(){
        String xml = "springtest01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        StudentEL studentEL = ac.getBean("studentEL", StudentEL.class);
        System.out.println("studentEL = " + studentEL);

    }
}
