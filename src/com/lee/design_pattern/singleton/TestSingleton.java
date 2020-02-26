package com.lee.design_pattern.singleton;

import com.lee.design_pattern.singleton.Singleton;

public class TestSingleton {

    public static void main(String[] args) {


        Singleton ins= Singleton.getSingleton_instance();

        Singleton ins2= Singleton.getSingleton_instance();


        System.out.println(ins.equals(ins2));


    }
}
