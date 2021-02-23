package com.spring5.demo03;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Rent host = new Host();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(host);
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();
    }
}
