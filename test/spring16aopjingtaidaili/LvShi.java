package spring16aopjingtaidaili;

public class LvShi {
    private BeiGao beiGao;

    public int money;

    public BeiGao getBeiGao() {
        return beiGao;
    }

    public void setBeiGao(BeiGao beiGao) {
        this.beiGao = beiGao;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void guanSi(){
        int feiyong = beiGao.getFeiyong();
        this.money=feiyong-60000;
        System.out.println("打赢官司需赔付受害人:" + this.money);
    }
}
