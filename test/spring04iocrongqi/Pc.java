package spring04iocrongqi;

public class Pc {
    //出生后的构造方法
    public Pc(){
        System.out.println("电脑的无参构造就是对象一诞生就会执行的方法,比如人一出生就会哭,这就是无参构造方法");
        System.out.println("构造方法是对象一诞生就会执行的方法,一般多用来初始化自己属性的 比如颜色");
    }
    //对象的初始化方法
    public void initShow(){
        System.out.println("开机****");
        System.out.println("初始化方法是对象一诞生就会执行的方法,和构造方法不同的是,它多用 直接调用自己的方法");
    }
    //对象的普通方法 周期中...成年中
    public void playGame(){
        System.out.println("电脑的普通方法,用来打游戏");
    }
    //对象的死亡方法 参考过滤器 servlet
    public void destoryObj(){
        System.out.println("电脑中毒了....被砸了...总之就是电脑对象死亡,执行的方法");
    }
}
