package spring17aopjdkdongtaidaili;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//jdk动态代理.省去了代理对象.代理对象由程序员手写变为统一的jdk中的类,直接调用
public class YouXiTest {
    @Test
    public void test01(){
        YouXi youXi = new YouXi();
        Conn jdkProxy = (Conn) Proxy.newProxyInstance(youXi.getClass().getClassLoader(),
                youXi.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Integer integer = (Integer) method.invoke(youXi, args);
                        if (integer == null) {
                            integer = 60;
                        }
                        return integer;
                    }
                }
        );
        int i = jdkProxy.conNet();
        System.out.println("i = " + i);
    }
}
