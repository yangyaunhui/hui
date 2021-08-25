package springtest;

public class Person {
    public Person(){
        System.out.println("人在容器中诞生了");
    }
    //接口是抽象的
    private EatDongXi eatdongxi;

    public EatDongXi getEatdongxi() {
        return eatdongxi;
    }

    public void setEatdongxi(EatDongXi eatdongxi) {
        this.eatdongxi = eatdongxi;
    }

    public void Use(){
        System.out.println("人使用的方法");
        eatdongxi.eat();
    }
}
