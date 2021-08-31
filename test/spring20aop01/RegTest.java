package spring20aop01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegTest {
    //测试目的把message的切面次要业务 融合在主要业务reg中
    //用spring去实现
    @Test
    public void test01(){
        String xml="spring20aop01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        RegService regService = ac.getBean("regService", RegService.class);
        regService.addUser();
        System.out.println("===================");
        regService.lognUser();
        System.out.println("===================");
        //int i = 9 / 0;//必须卸载主要业务的方法中
        regService.transMoney();

    }
}
