package com.robotframework.java.keywords;

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class MyKeyword {

    @RobotKeyword("Print Message")
    @ArgumentNames({"message"})
    public String printMessage(String message) {
        message = "My message is : " + message;
        System.out.println(message);
        return message;
    }

}