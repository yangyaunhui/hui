package spring04iocrongqi;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/*
 * 容器的由来:根据刚刚的 工厂模式得出一个项目中有着大量的对象
 * 那么大量的对象需要管理 如果管理更方便 使用 容器 把对象同意处理.
 *
 *
 * Spring 中的容器IOC
 * IOC有个思想:控制反转 什么叫控制 我控制你 你控制我 如何算控制 你的出生 死亡都归我管
 * 什么叫 反转:事情本来由A控制，现在变为B控制
 * 反转:控制的主体 改变了
 * 容器是负责控制反转的
 * */
public class Spring04Test {
/*
* 传统的对象的创建三种方式
* 传统的对象 没有容器的统一管理
* */
    @Test
    public void test01(){
        //因为我们说spring容器是管理对象
        //对象的创建有几种方式
        //传统的创建对象有3种方式
        //第一种: new 关键字
        Date date = new Date();//1.创建对象
        System.out.println("date = " + date);
        System.out.println("--------------");
        //第二种: static 静态方法创建 静态工厂创建
        Calendar calendar = Calendar.getInstance();//2.创建对象
        System.out.println("calendar = " + calendar);
        System.out.println("--------------");
        //第三种: 实例工厂类创建
        Date time = calendar.getTime();//3.创建对象
        System.out.println("time = " + time);
        System.out.println("以上就是 传统创建对象的3种方式");

        //传统的创建对象的缺点
        //1.控制权 在哪里 ? 现在在 test01的方法中
        //2.对象创建的执行顺序 由谁控制 ?  test01的方法中

        //下面使用spring 如何管理对象(创建 销毁 使用)
    }

/*
     * spring 容器管理对象,看spring如何创建对象
     *
     *
     * */

    @Test
    public void test02(){
        //1.加载容器的xml
        String xml = "spring04iocrongqi/applicationContext.xml";
        //2.xml文件一经加载,所有的对象都已经诞生了,这就和传统的test01创建对象不一样
        //达到了对象的统一管理,也就是对象的创建的控制权被Spring拿走了
        //以前是new出来的对象,现在是Spring通过反射 拿到了对象 这就是控制权的改变 这就是控制反转
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac);
        //如何取得对象
        Date date = ac.getBean("date", Date.class);
        System.out.println("date = " + date);

        //作用域:测试spring默认创建对象是否是单例模式
        Pc pc1 = ac.getBean("pc", Pc.class);
        Pc pc2 = ac.getBean("pc", Pc.class);
        System.out.println("pc1 = " + pc1);
        System.out.println("pc2 = " + pc2);
        System.out.println(pc1==pc2);//默认为true
        //加上scope="prototype"  ==为false
        ((ClassPathXmlApplicationContext) ac).close();//关闭容器

        //如果生命周期中使用 圆形模式看,那么无法调用对象的摧毁方式,所以很少用原型模式
    }
}
