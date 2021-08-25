package springtest03;

public class JianPan {
    private CPU cpu;

    public JianPan(){
        System.out.println("键盘对象被创建");
    }

    public JianPan(CPU cpu){
        this.cpu = cpu;
    }
    public void use(){
        System.out.println("键盘使用的方法");
        cpu.usecpu();
    }
}
