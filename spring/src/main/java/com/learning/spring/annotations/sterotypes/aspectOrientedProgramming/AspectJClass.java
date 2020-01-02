package com.learning.spring.annotations.sterotypes.aspectOrientedProgramming;

import com.learning.spring.Draw;
import javafx.scene.shape.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectJClass {

    @Before("execution(public void draw())")
    public void loggingAdvice(){
        System.out.println("AspectJClass.loggingAdvice");
    }

    @Pointcut("within(com.learning.spring.annotations..*)")
    public void loggingAdvice1(){
        System.out.println("loggingAdvice1 for all methods inside package");
    }

    @Before("loggingAdvice1()")
    public void AfterAdviceJoinPoint(JoinPoint joinPoint){
        System.out.println("joinPoint = [" + joinPoint.toString() + "]");
    }

    @Before("loggingAdvice1()")
    public void AfterAdviceJoinPointTarget(JoinPoint joinPoint){
        System.out.println("joinPoint.Target = [" + joinPoint.getTarget() + "]");
        System.out.print("joinPoint.getTarget() : ");
         ((Draw)joinPoint.getTarget()).draw();
    }

   @Before("args(name)")
    public void getArugmentValue(String name){
        System.out.println("name = [" + name + "]");
    }
    /* @AfterReturning(pointcut = "args(name)",returning="returnString")
    public void getReturnString(String name, String returnString) {
        System.out.println("name = [" + name + "], returnString = [" + returnString + "]");
    }*/


}
