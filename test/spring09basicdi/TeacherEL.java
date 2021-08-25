package spring09basicdi;

//Spring el表达式
public class TeacherEL {
    private String name;
    private int age;
    private String friendName;
    private String loverName;
    private Double score;
    private String db;//暂时不用

    @Override
    public String toString() {
        return "TeacherEL{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendName='" + friendName + '\'' +
                ", loverName='" + loverName + '\'' +
                ", score=" + score +
                ", db='" + db + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getLoverName() {
        return loverName;
    }

    public void setLoverName(String loverName) {
        this.loverName = loverName;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}

