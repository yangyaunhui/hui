package spring18aopcglibdongtaidaili;

public class Man {
    private int gaoKaoScore=400;
    public int dream(){
        System.out.println("高考分数:" + this.gaoKaoScore);
        return this.gaoKaoScore;
    }

    public int getGaoKaoScore() {
        return gaoKaoScore;
    }

    public void setGaoKaoScore(int gaoKaoScore) {
        this.gaoKaoScore = gaoKaoScore;
    }
}
