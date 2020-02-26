package com.lee.design_pattern.builder;

public class TestBuilder {
    public static void main(String[] args) {

        Human me= new Human.HumanBuilder("lee jae hyun","Asian")
                .age(27)
                .country("Korea")
                .job("SW developer")
                .height(179)
                .weight(80)
                .build();


        System.out.println(me);





    }
}
