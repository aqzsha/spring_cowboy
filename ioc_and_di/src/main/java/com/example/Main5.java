package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigSecond.class);

        Pet cat = context.getBean("catBean", Pet.class);
        cat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
