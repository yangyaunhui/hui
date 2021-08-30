package spring15zhujieduquproperties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OneBeanTest {
    @Test
    public void test01(){
        String xml = "spring15zhujieduquproperties/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        OneBean oneBean = ac.getBean("oneBean", OneBean.class);
        System.out.println("oneBean = " + oneBean);
    }
}
