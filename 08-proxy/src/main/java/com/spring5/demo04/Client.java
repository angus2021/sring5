package com.spring5.demo04;


public class Client {
    public static void main(String[] args) {
        Rent host = new Host();
        Rent hostess = new Hostess();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(host);
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();

        proxyInvocationHandler.setTarget(hostess);
        proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();

    }
}
