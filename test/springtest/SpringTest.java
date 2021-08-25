package springtest;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test01() {
        String xml = "springtest/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        //拿主体
        Person person = ac.getBean("person",Person.class);
        person.Use();
    }
}
