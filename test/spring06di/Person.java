package spring06di;

//人是主体 主要的类 需要依赖手机.
public class Person {

    public Person(){
        System.out.println("人在容器中诞生了");
    }
    //接口都是抽象的
    private PlayGame playGame;

    public PlayGame getPlayGame() {
        return playGame;
    }

    public void setPlayGame(PlayGame playGame) {
        this.playGame = playGame;
    }
    //private Phone phone;//人依赖的手机 所以人就拥有了手机
    //private Psp psp; //人依赖的psp

//    public Psp getPsp() {
//        return psp;
//    }
//
//    public void setPsp(Psp psp) {
//        this.psp = psp;
//    }
//
//    public Phone getPhone() {
//        return phone;
//    }
//
//    public void setPhone(Phone phone) { //set是暴露给别人看的.让别人给你东西的.
//        this.phone = phone;
//    }

    public void Play(){
        System.out.println("人玩的方法");
        //phone.Game();
        //psp.Game();
    playGame.Game();
    }
}
