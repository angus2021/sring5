package com.spring5.pojo;

public class User {
    private String name;
    public static void initStaticString(){
        System.out.println("User静态变量");
    };

    public User(String name) {
        System.out.println("User有参构造");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("name="+name);
    }
}
