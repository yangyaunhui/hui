package spring11duquprop;

public class ReadPropertiesBean {
    private String name;
    private String age;

    @Override
    public String toString() {
        return "ReadPropertiesBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
