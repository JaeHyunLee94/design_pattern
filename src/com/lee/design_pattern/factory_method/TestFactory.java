package com.lee.design_pattern.factory_method;

public class TestFactory {
    public static void main(String[] args) {

        CarFactory factory=new CarFactory();

        Car mycar1=factory.getcar("Bus");
        Car mycar2=factory.getcar("Suv");

        mycar1.run();
        mycar2.run();



    }
}
