package com.spring5.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {
    @Autowired(required = false)
    @Qualifier(value = "cat11")
    private Cat cat;

    @Resource(name = "cat1")
    private Cat cat1;

    @Autowired
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }
    public Cat getCat1() {
        return cat1;
    }
    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
