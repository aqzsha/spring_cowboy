package com.example;
public class Person {
    // @Autowired
    // @Qualifier("dogBean")
    private Pet pet;
    // @Value("Akzhol")
    private String surname;
    private int age;

    // @Autowired
    // public Person(@Qualifier("dogBean") Pet pet){
    //     this.pet = pet;
    // }
    
    public Person(Pet pet){
        this.pet = pet;
    }
    // public Person(){}

    public void setPet( 
    Pet pet){
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
    
    // @Autowired
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
