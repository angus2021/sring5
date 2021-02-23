package com.spring5.demo03;

public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东租出");
    }
}
