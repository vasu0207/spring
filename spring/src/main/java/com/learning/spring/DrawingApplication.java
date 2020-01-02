package com.learning.spring;

import com.learning.spring.annotations.ComponentClass;
import com.learning.spring.annotations.sterotypes.StereoTypeClass;
import com.learning.spring.applicationContextFeatures.messaging.MessageClass;
import com.learning.spring.jsr250.Octogane;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

    public static void main(String[] args) {
    System.out.println("Entered Main");
      //  BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        getTriangele(context);

        getcircle(context);

        getOctane(context);

        getComponentClass(context);

        getSteroTypeClass(context);

        getMessaging(context);


        System.out.println("Exist Main");
    }

    private static void getMessaging(ClassPathXmlApplicationContext context) {
        MessageClass messageClass = (MessageClass) context.getBean("messageClass");
        messageClass.draw();
    }

    private static void getSteroTypeClass(ClassPathXmlApplicationContext context) {
        StereoTypeClass stereoTypeClass = (StereoTypeClass) context.getBean("stereoTypeClass");
        stereoTypeClass.draw();
        System.out.println(stereoTypeClass.getPointA().toString());
    }

    private static void getComponentClass(ClassPathXmlApplicationContext context) {
        ComponentClass componenetClass = (ComponentClass) context.getBean("componentClass");
        componenetClass.draw();
        System.out.println(componenetClass.getPointB().toString());
    }

    private static void getTriangele(ClassPathXmlApplicationContext context) {
        Traingele traingle = (Traingele) context.getBean("traingle");
        traingle.draw();
    }

    private static void getOctane(ClassPathXmlApplicationContext context) {
        Octogane octogane = (Octogane)context.getBean("octogane");
        System.out.println(octogane.getPointA().toString());
    }

    private static void getcircle( ClassPathXmlApplicationContext context ){
        CircleClass cc = (CircleClass) context.getBean("circle");
        System.out.println(cc.getPointA().toString());
        System.out.println(cc.getPointB().toString());
        System.out.println(cc.getPointC().toString());
        cc.draw();
    }
}
