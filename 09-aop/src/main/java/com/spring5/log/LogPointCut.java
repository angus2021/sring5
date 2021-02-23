package com.spring5.log;

public class LogPointCut {
    public void pre(){
        System.out.println("pre running ");
    }
    public void after(){
        System.out.println("after running ");
    }
}
