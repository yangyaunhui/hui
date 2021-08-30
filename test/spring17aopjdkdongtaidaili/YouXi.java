package spring17aopjdkdongtaidaili;

public class YouXi implements Conn{
    private int wangsu=460;

    public int getWangsu() {
        return wangsu;
    }

    public void setWangsu(int wangsu) {
        this.wangsu = wangsu;
    }

    @Override
    public int conNet() {
        System.out.println("游戏本身的网速: " + wangsu);
        return this.wangsu;
    }
}
