package com.pavel.hib.test.in;

import org.springframework.stereotype.Component;

public class Cat implements Pet {

    @Override
    public void say() {
        System.out.println("Myau-Myau");
    }
}
