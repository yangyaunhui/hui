package spring20aop01;

//主要业务
public interface RegService {
    public void addUser();  //切入点

    public void lognUser();

    //环绕通知
    public void transMoney();
}
