package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.print(person.getAge());
        context.close();

    }
} 