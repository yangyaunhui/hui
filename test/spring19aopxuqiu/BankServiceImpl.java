package spring19aopxuqiu;

//经过上述的推论 静态方法和接口都被推翻掉了...
//把排队这个方法应该提取成一个类(对象) 这个对象就是切面,那么就是面向切面
//主要业务类
public class BankServiceImpl implements BankService{
    @Override
    public void cunQian(){
        System.out.println("存钱");
    }
}
