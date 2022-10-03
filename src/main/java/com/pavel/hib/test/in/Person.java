package com.pavel.hib.test.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
@Scope("prototype")
public class Person {
    @Autowired
//    @Qualifier("dog")
    private Pet pet;

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Животное внедрено через конструктор, персона создана");
//        this.pet = pet;
//    }
//   public Person() {
//        System.out.println("Person is created");
//    }
//    @Autowired
//    @Qualifier("dog")
//    public void setPet(Pet pet) {
//        System.out.println("Создано через set");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Животное внедрено через конструктор");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Здравствуй, моё любимоё домашнее животное " + pet.getClass());
        pet.say();
    }
}
