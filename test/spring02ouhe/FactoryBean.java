package spring02ouhe;
// 工厂类, 工厂模式 , spring 创建bean的底层  工厂模式
// 使用工厂模式, 代码更加灵活
//  单例模式,  已经经过  6 种  常用2中
// HR问: spring框架中, 使用到了那些设计模式!
//对象一多, 就要 有容器来管理
//记下来:   Spring就是个容器,  用来管理对象的.
// 如何才叫做 管理对象, 就是 负责 对象的
// 1. 出生,
// 2. 使用 ,
// 3. 死亡, 这叫做生命周期,学名: IOC ,
// 4 依赖关系 学名 DI  依赖注入

public class FactoryBean {
    public static Usb getInstance(String beanName)  {
        Usb usb=null;
        /*if(beanName.equals("MyTv")){
            usb=new MyTv();
        }else if (beanName.equals("Computer")){
            usb=new Computer();
        }else if (beanName.equals("Mp4")){
            usb=new Mp4();
        }
        else if (beanName.equals("Mp3")){
            usb=new Mp4();
        }
        else if (beanName.equals("Mp5")){
            usb=new Mp4();
        }
        else if (beanName.equals("Mp100")){
            usb=new Mp4();
        }*/

        Class<?> aClass = null;//反射的优势 1行代码 代替所有
        try {
            aClass = Class.forName("beanName");
            usb = (Usb) aClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return usb;
        // 结论   大量new 对象是造成  耦合的关键,  那么 就需要一个框架 来解决 new对象的 耦合
        //  什么框架可以解决 这个呢 ? spring , 为什么spring可以解决 new 对象的耦合呢 ?  ---> 底层的反射!!!!
    }
}
