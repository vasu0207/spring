package com.learning.spring.applicationContextFeatures.messaging;

import com.learning.spring.Draw;
import com.learning.spring.Points;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MessageClass implements Draw {


    @Autowired
    MessageSource messageSource;

    @Autowired
    private Points pointC;

    @Override
    public void draw() {
        System.out.println("x : "+pointC.getX() +" , y : "+pointC.getY() + " , z : "+pointC.getZ());
        System.out.println(messageSource.getMessage("points",new Object[]{pointC.getX(), pointC.getY(), pointC.getZ()}, "default Message drawing" , null));

        System.out.println(messageSource.getMessage("message",null, "default Message drawing" , null));
    }
}
