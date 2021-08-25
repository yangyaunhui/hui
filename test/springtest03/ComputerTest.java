package springtest03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputerTest {
    @Test
    public void test01(){
        String xml = "springtest03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        JianPan jianpan = ac.getBean("jianPan", JianPan.class);
        jianpan.use();
    }
}
