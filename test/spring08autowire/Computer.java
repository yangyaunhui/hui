package spring08autowire;

public class Computer implements GameInterface {
    public Computer(){
        System.out.println("电脑对象出现");
    }

    public void game(){

        System.out.println("电脑运行cf");
    }
}
