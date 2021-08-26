package spring12zhujie;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component //这个注解登录在xml中写了bean标签 <!--<bean id="human" class="spring12zhujie.Human"></bean>-->
//@Component 通用注解
// @Controller 等于 //@Component  用在controller层
// @Service 等于 //@Component  用在service层
//@Repository("ren")  // 可以起别名, 如果不起,那么这个id 就是 类名的小写.
@Repository // 等于 @Component 用在dao层  但是一般不用 因为dao层有xml映射
            //@Service @Component @Controller @Repository 四个简称四大注解
@Scope("prototype") //加上这个注解就是原型/多例 <!--<bean id="human" class="spring12zhujie.Human" scope="prototype"></bean>-->
@Lazy //加上就是懒加载 <!--<bean id="human" class="spring12zhujie.Human" scope="prototype" lazy-init="true"></bean>-->
public class Human {
    public  Human(){
        System.out.println("human对象诞生了");
    }

    @PostConstruct //构造之前的方法 生命周期
    //@Lazy //加上就是懒加载 <!--<bean id="human" class="spring12zhujie.Human" scope="prototype" lazy-init="true" init-method="initShow" destroy-method="destoryObj"></bean>-->
    public void intShow(){
        System.out.println("大哭...");
    }

    @PreDestroy //<!--<bean id="human" class="spring12zhujie.Human" scope="prototype" lazy-init="true" init-method="initShow" destroy-method="destoryObj"></bean>-->
    public void destoryObj(){
        System.out.println("临死前的遗嘱...");
    }
}
