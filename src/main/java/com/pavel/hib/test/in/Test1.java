package com.pavel.hib.test.in;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Dog dog = context.getBean("dog", Dog.class);
//        Dog myDog = context.getBean("dog", Dog.class);
//        System.out.println(dog==myDog);
//        System.out.println(dog);
//        System.out.println(myDog);
//        context.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());
//        Pet cat = context.getBean("catBean", Pet.class);
//        cat.say();
        context.close();
    }
}
