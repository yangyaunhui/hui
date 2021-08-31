package spring19aopxuqiu;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class AopTest {
    @Test
    public void test01(){
        //排队
        //存钱
        //之前需要1个类,现在需要2个类
        //PaiDui paiDui = new PaiDui();//次要业务 不应该出现在这个方法中
        //paiDui.paiHao();

        BankServiceImpl bank = new BankServiceImpl();//主要业务
        bank.cunQian();//save add insert into bank values(?,?,?,?,?,?)
        //次要业务 不应该出现在这个方法中  那么该怎样实现排号这个方法
        //即:如何让Bank类在不改变源代码的基础上,添加排队这个方法
        //dao层 service
    }

    @Test//使用动态代理解决切面类+主要业务 组合在一起
    public void test02(){
        //排队
        //存钱
        //1.目标对象
        BankService target = new BankServiceImpl();
        //2.代理对象
        BankService bankService = (BankService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    //在这里可以增强目标对象,其实就是直接把切面类直接拿过来就可以了
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                       PaiDui.paiHao();
                        Object result = method.invoke(target, objects);
                        return result;
                    }
                });
        bankService.cunQian();
    }
}
