package spring16aopjingtaidaili;

import org.junit.Test;

public class BeiGaoTest {
    @Test
    public void test01(){
        BeiGao people = new BeiGao();
        LvShi peo = new LvShi();
        peo.setBeiGao(people);
        peo.guanSi();
    }
}
