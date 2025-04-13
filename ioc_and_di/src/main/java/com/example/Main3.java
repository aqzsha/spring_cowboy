package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextConf.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
    }
}
