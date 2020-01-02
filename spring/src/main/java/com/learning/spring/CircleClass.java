package com.learning.spring;

import com.learning.spring.applicationContextFeatures.EventHandlingClass.CustomEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CircleClass implements Draw, ApplicationEventPublisherAware {
    private Points pointA;
    private Points pointB;
    private Points pointC;

    private ApplicationEventPublisher publisher;

    public Points getPointA() {
        return pointA;
    }

    public void setPointA(Points pointA) {
        this.pointA = pointA;
    }

    public Points getPointB() {
        return pointB;
    }

    public void setPointB(Points pointB) {
        this.pointB = pointB;
    }

    public Points getPointC() {
        return pointC;
    }

    public void setPointC(Points pointC) {
        this.pointC = pointC;
    }

    @Override
    public void draw() {
        System.out.println("CircleClass");
        CustomEvent ce  = new CustomEvent(this);
        this.publisher.publishEvent(ce);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    @Override
    public String toString() {
        return "CircleClass{" +
                "\n pointA=" + pointA +
                "\n , pointB=" + pointB +
                "\n , pointC=" + pointC +
                "\n , publisher=" + publisher +
                '}';
    }
}
