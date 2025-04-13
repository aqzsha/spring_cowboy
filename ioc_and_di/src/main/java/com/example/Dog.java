package com.example;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{
    private String name;
    public Dog(){
        System.out.println("The Dog is created");
    }
    @Override
    public void say(){
        System.out.println("Woof-woof");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
