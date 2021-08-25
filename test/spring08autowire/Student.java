package spring08autowire;
//主体类---用电脑类  主体类依赖电脑类
public class Student {
    private GameInterface gameInterface;
    public void setGameInterface(GameInterface gameInterface) {
       this.gameInterface = gameInterface;
   }

//    private Computer computer;
//
//    public Computer getComputer() {
//        return computer;
//    }
//
//    public void setComputer(Computer computer) {
//        this.computer = computer;
//    }

    public Student(){
        System.out.println("我学生是类,学生对象被创建了");
    }

    public void play(){
        System.out.println("学生玩");
        gameInterface.game();
    }
}
