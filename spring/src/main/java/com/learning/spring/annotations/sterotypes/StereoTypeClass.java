package com.learning.spring.annotations.sterotypes;

import com.learning.spring.Draw;
import com.learning.spring.Points;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

@Service
public class StereoTypeClass implements Draw {

    private Points pointA;

    public Points getPointA() {
        return pointA;
    }

    @Resource(name = "pointA")
    public void setPointA(Points pointA) {
        this.pointA = pointA;
    }

    @Override
    public void draw() {
        System.out.println("StereoTypeClass.draw");
    }


}
