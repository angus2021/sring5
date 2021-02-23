package com.spring5.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        see();
        Object result = method.invoke(rent, args);
        contract();
        fee();
        return result;
    }

    public void see() {
        System.out.println("看房");
    }
    public void contract() {
        System.out.println("合同");
    }
    public void fee() {
        System.out.println("收费");
    }
}
