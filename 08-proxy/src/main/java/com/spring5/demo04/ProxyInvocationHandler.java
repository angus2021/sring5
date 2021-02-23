package com.spring5.demo04;

import com.spring5.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        pre();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    public void pre() {
        System.out.println("执行前");
    }
    public void after() {
        System.out.println("执行后");
    }
}
