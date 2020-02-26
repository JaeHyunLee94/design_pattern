package com.lee.design_pattern.Singleton;

public class Singleton {


    private static Singleton singleton_instance;


    public static Singleton getSingleton_instance() {
        return singleton_instance==null? singleton_instance=new Singleton() : singleton_instance;
    }



}
