package spring14zhujiechangyongzhuru;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
* 注解版的常用类型注入
* */
@Component
public class Teacher3 {
    @Value("小灰灰")
    private String name;
    @Value("20")
    private int age;
    //余下的就是集合,需要读取xml注入
    @Value("#{friendNames}")
    private List<String> friendNames;
    @Value("#{loverNames}")
    private Set<String> loverNames;
    @Value("#{scores}")
    private Map<String,Double> scores;
    @Value("#{properties}")
    private Properties properties;
    @Value("#{url.name}")
    private String url;

    @Override
    public String toString() {
        return "Teacher3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendNames=" + friendNames +
                ", loverNames=" + loverNames +
                ", scores=" + scores +
                ", properties=" + properties +
                ", url='" + url + '\'' +
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

    public List<String> getFriendNames() {
        return friendNames;
    }

    public void setFriendNames(List<String> friendNames) {
        this.friendNames = friendNames;
    }

    public Set<String> getLoverNames() {
        return loverNames;
    }

    public void setLoverNames(Set<String> loverNames) {
        this.loverNames = loverNames;
    }

    public Map<String, Double> getScores() {
        return scores;
    }

    public void setScores(Map<String, Double> scores) {
        this.scores = scores;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
