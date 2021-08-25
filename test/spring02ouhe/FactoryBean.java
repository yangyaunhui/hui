package spring02ouhe;
//工厂类，工厂模式，spring 创建 bean 的底层 工厂模式
// 使用工厂模式  代码更加灵活
//单例模式 ，已经有 6种了  常用2种
// HR问：  spring 框架中，使用到了那些设计模式！！  单例和工厂模式
public class FactoryBean {
    public static Usb getInstance(String beanName){
        Usb usb=null;
//        if(beanName.equals("MyTv")){
//            usb=new MyTv();
//        }else if(beanName.equals("Computer")){
//            usb=new Computer();
//        }else if(beanName.equals("Mp4")){
//            usb=new Mp4();
//        } else if(beanName.equals("Mp3")){
//            usb=new Mp4();
//        }else if(beanName.equals("Mp100")){
//            usb=new Mp4();
//        }


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
        // 结论： 大量的new对象 是造成 耦合的关键， 那么久需要 一个框架 来解决 new 对象的耦合
        // 什么框架可以解决 这个呢？  Spring框架  ，
        //为什么spring可以解决new 对象的耦合呢？ 底层的反射
    }
}
