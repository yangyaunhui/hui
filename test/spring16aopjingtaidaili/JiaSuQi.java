package spring16aopjingtaidaili;
/*
* 代理对象,用于增强目标对象的方法
*   游戏    迅游加速器
*   王宝强  宋喆
*   浏览器  vpn
*   被告人  律师
*   谁依赖谁?谁拥有谁?谁注入到谁的类?
*   谁是主体类?谁是副体类?
* */
public class JiaSuQi {
    private Game game;//代理类是主体,代理对象依赖了目标对象,代理对象包含了目标对象
    private int ws;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }

    //代理对象的方法.必须和目标对象方法用于.代理对象也要有目标对象的方法
    public void conNet(){
        //这个方法方法要承接目标对象的方法
        int wangsu = game.getWangsu();//目标对象的网速方法
        this.ws=wangsu-400;
        System.out.println("加速后的游戏网速 = " + this.ws);
    }

}
