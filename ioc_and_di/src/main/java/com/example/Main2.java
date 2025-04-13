package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBean.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Baek");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Momo");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        // System.out.println(myDog==yourDog);
        // System.out.println(myDog);
        // System.out.println(yourDog);
        
        context.close();
    }
}
