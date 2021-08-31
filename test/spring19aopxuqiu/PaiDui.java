package spring19aopxuqiu;
/*
 * 这个类就是切面类,切面类和普通类有什么区别?
 * 1.逻辑上的区别 切面类是次要业务 普通类是主要业务
 * 2.写法上的区别 一般切面类里面何少有属性 只有方法
 *
 * 切面类就是通知
 * */
public class PaiDui {
    public static void paiHao(){
        System.out.println("排号嘞");
    }
}
