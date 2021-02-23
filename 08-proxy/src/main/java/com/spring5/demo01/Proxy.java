package com.spring5.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        see();
        host.rent();
        contract();
        fee();
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
