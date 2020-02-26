package com.lee.design_pattern.factory_method;

public class Bus extends Car{
    @Override
    public void run() {
        System.out.println("Bus is running!!");
    }



    @Override
    public void getname() {
        System.out.println("Bus!!");
    }
}
