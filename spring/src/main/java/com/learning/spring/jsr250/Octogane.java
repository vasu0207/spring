package com.learning.spring.jsr250;

import com.learning.spring.Draw;
import com.learning.spring.Points;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Octogane implements Draw {

  //  @Autowired
    Points pointA;

    public Points getPointA() {
        return pointA;
    }

   @Resource//(name= "pointA")
    public void setPointA(Points pointA) {
        this.pointA = pointA;
    }

    @Override
    public void draw() {
        System.out.printf("Octogane. draw");
    }
}
