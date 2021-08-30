package spring16aopjingtaidaili;

public class BeiGao {
    private int feiyong=200000;

    public int getFeiyong() {
        return feiyong;
    }

    public void setFeiyong(int feiyong) {
        this.feiyong = feiyong;
    }

    public void guanSi(){
        System.out.println("需支付:"+this.getFeiyong());
    }
}
