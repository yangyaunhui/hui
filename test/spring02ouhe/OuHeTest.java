package spring02ouhe;

import org.junit.Test;

public class OuHeTest {
    // 创建几个类, 模拟耦合
    @Test
    public void test01(){
                // 如果使用电脑传数据
//        Computer computer = new Computer();
//                   computer.usbData();  // 将来要改 Computer
                // 如果用 电视传输数据
//            MyTv myTv = new MyTv();
//                    myTv.usbData();

//        更新接口后, 代码优化了, 解耦 1次
      //  Usb u= new Computer();
       // Usb u= new Mp4();
          //  u.usbData();
        // 需求1: 现在  new Computer();    new MyTv(); 都有  usbData的功能.
        // 问题:直接修改  代码修改量比较大.
        // 想把 Compter类不用,修改成Tv,
        //  那么 需要 把 usbData 方法提取成  接口.   然后 使用多态的思想进行 代码更新, 解耦1次
        // 第一次 使用 接口,多态的思想 解耦, 好处是, 可以 多次修改代码 不用改 变量了, 直接 一个 u 就可以代替上面的new对象
        // 第二次解耦,  即 代码更方便
        Usb u = FactoryBean.getInstance("Computer");
        u.usbData();
        // 以上 第二次写法是不是 更 优美, 更 解耦了.  让 用户输入字符, 比打开源代码 找到第几行,更方便, 将来代码已加密.


    }
}
