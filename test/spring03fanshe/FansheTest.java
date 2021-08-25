package spring03fanshe;

import org.junit.Test;

import java.util.Date;

public class FansheTest {
    //反射用来干嘛的？  答：创建对象啊  ---使用反射如何创建对象  有3 种
    // 之前如何 创建对象？  答： new ---，low比 会造成耦合
    @Test
    public void test01(){
        // 古老的创建对象
        Date date=new Date();
        System.out.println("date = " + date);  //Mon Aug 23 12:14:40 GMT+08:00 2021
        //新兴的 反射创建对象
        //1.找到类的出处，并创建对象  不常用
        try {
            Date date1=date.getClass().newInstance();
            System.out.println("date1 = " + date1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        //2.以文本的形式 ，找到出处 ， 很常用
        try {
            Class<Date> aclass= (Class<Date>) Class.forName("java.util.Date");
            System.out.println("aclass.newInstance() = " + aclass.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //3. 直接 .class
        Class c=Date.class;
        try {
            Date o= (Date) c.newInstance();
            System.out.println("o = " + o);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        //作业: 使用第二种文本方式, 对 spring02ouhe 做出解耦!!!

    }
}
