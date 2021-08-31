package spring21aop02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//使用juint
@ContextConfiguration(locations = "classpath:spring21aop02/applicationContext.xml")
public class AccountTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void test01(){
        accountService.findAll();
    }
}
