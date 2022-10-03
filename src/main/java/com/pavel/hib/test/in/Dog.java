package com.pavel.hib.test.in;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.atomic.AtomicInteger;

//@Scope("prototype")
public class Dog implements Pet {
//    private static int grow;
//    private String name;

//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }

    public Dog() {
       // grow++;
        System.out.println("Создана собака ");

    }
    @PostConstruct
    public void init() {
        System.out.println("Class Dog init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog destroy method");
    }

    @Override
    public void say() {
        System.out.println("Gav-Gav");
    }
}
