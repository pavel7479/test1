package com.pavel.hib.test.in;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Person person = context.getBean("myPerson", Person.class);
//        person.callYourPet();
//
//        System.out.println(person.getAge());
//        System.out.println(person.getName());

        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        context.close();
    }
}
