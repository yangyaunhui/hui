package spring06di;

//我是手机对象 我是次要的类 我是被主体依赖的
public class Phone implements PlayGame{
    public Phone(){
        System.out.println("我是手机对象");
    }

    public void Game(){
        System.out.println("手机 打游戏");
    }
}
