package com.learning.spring.annotations;

import com.learning.spring.Draw;
import com.learning.spring.Points;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentClass implements Draw {

    @Autowired
    private Points pointB;

    public Points getPointB() {
        return pointB;
    }

    public void setPointB(Points pointB) {
        this.pointB = pointB;
    }

    @Override
    public void draw() {
        System.out.println("ComponentClass.draw");
    }
}
