package com.flepeng.demo.proxy.jdk;

public class Target implements TargetInterface {
    public void save() {
        System.out.println("save running.....");
    }
}
