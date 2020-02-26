package com.lee.design_pattern;

import com.lee.design_pattern.Singleton.Singleton;

public class Main {

    public static void main(String[] args) {


        Singleton ins= Singleton.getSingleton_instance();

        Singleton ins2= Singleton.getSingleton_instance();


        System.out.println(ins.equals(ins2));


    }
}
