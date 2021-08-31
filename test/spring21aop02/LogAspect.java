package spring21aop02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logAspect")
@Aspect
public class LogAspect {
    @Pointcut("execution (* spring21aop02.*.*(..))")
    public void pt(){
        System.out.println("切入点表达式......");
    }
    @Before("pt()")
    public void beforeMsg(){
        System.out.println("前置通知......");
    }
    @AfterReturning("pt()")
    public void afterMsg(){
        System.out.println("后置通知......");
    }
/*    @Around("pt()")
    public void aroundMsg(ProceedingJoinPoint joinPoint){
        System.out.println("环绕通知......前面");
        try {
            Object proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕通知......后面");
    }*/
    @AfterThrowing(value = "pt()",throwing = "e")
    public void throwing(JoinPoint joinPoint,Exception e){
        System.out.println("异常通知...");
        System.out.println("异常通知 = " + e.getMessage());
    }
    @After("pt()")
    public void afterFinal(){
        System.out.println("最终的通知...");
    }
}
