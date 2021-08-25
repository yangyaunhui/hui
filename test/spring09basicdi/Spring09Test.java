package spring09basicdi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring09Test {
    @Test
    public void test01(){
    String xml = "spring09basicdi/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
    Teacher teacher = ac.getBean("teacher", Teacher.class);
    System.out.println("teacher = " + teacher);
}
}
