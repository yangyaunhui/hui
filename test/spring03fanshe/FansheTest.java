package spring03fanshe;

import org.junit.Test;

import java.util.Date;

public class FansheTest {

    // 反射用来干嘛的?  答:  创建对象的   -- 使用反射如何创建对象  有3中.
    // 之前如何创建对象? 答:  new 对象  --- low逼,  会造成耦合
    @Test
    public void test01(){
        /// 古老创建对象
        Date date = new  Date();
        System.out.println("date = " + date);// date = Mon Aug 23 12:07:37 CST 2021
        // 新兴的 反射创建对象
        // 1. 找到类的出处, 并创建对象, 不常用
        try {
            Date date1 = date.getClass().newInstance();
            System.out.println("date1 = " + date1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // 2. 以文本形式, 找到出处,  很常用
        try {
            Class<Date> aClass = (Class<Date>) Class.forName("java.util.Date");
            System.out.println("aClass = " + aClass.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //3. 直接 .class
            Class c= Date.class;
        try {
            Date o = (Date) c.newInstance();
            System.out.println("o = " + o);
        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}
