package spring02ouhe;

import org.junit.Test;


public class OuHeTest {
    //创建几个类，模拟耦合
    @Test
    public void test01(){
        //如果使用电脑传输数据
//        Computer computer=new Computer();
//        computer.usbData();
        //如果使用电视传输数据
//       MyTv myTv=new MyTv();
//        myTv.usbData();

        //更新接口后的，代码优化了 解耦1次
       // Usb u=new Computer();
//        Usb u=new MyTv();
//        u.usbData();


        //需求1： 现在  new Computer();  new MyTv();  都有usbData功能
        // 问题： 直接修改  代码修改量比较大
        // 想把 Computer 类不用，修改成Tv
        // 那么需要  把 usbData  方法提取成  接口， 然后  使用多态的思想 进行 代码更新 ，解耦一次
        // 第一次  使用接口，多态的思想 解耦， 好处是 ，可以 多次修改代码 不用改 变量了，直接 一个 u就可以代替上面的new 对象
        //第二次 解耦， 即 代码更方便
//        Usb u=FactoryBean.getInstance("Mp4");
//        u.usbData();
        //以上  第二种写法 更优美了 ，更加解耦了，让用户输入 字符串 ，比打开源码

        Usb usb=Menthod02OuheTest.getInstance("spring02ouhe.MyTv");
        usb.usbData();
        Usb usb1=Menthod02OuheTest.getInstance("spring02ouhe.Mp4");
        usb1.usbData();
        Usb usb2=Menthod02OuheTest.getInstance("spring02ouhe.Computer");
        usb2.usbData();




    }
}
