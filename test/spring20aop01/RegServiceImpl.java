package spring20aop01;

public class RegServiceImpl implements RegService {
    @Override
    public void addUser() {
        System.out.println("调用dao层这个是会员的注册功能");
        //注册完毕后给顾客发一条短信，您注册了xxx？？
        //订单...消费...违规....都要发短信通知
    }

    @Override
    public void lognUser() {
        System.out.println("调用dao层这个是登录功能");
        int i = 9 / 0;
    }

    @Override
    public void transMoney() {
        System.out.println("转账......");
    }


}
