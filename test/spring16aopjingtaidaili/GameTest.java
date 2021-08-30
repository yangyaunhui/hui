package spring16aopjingtaidaili;

import org.junit.Test;

public class GameTest {
    @Test
    public void test01(){
        Game wangzhe = new Game();
        JiaSuQi xuyou = new JiaSuQi();
        xuyou.setGame(wangzhe);//seth注入.王者注入了迅游.迅游依赖了王者.迅游包含了王者.迅游是主体
        xuyou.conNet();//调用.都调用主体类
    }
}
