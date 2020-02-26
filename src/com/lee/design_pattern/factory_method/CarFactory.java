package com.lee.design_pattern.factory_method;

public class CarFactory {


    public Car getcar(String car_type){

        Car return_type=null;


        switch (car_type){

            case "Suv":
                return_type=new Suv();
                break;

            case "Bus":
                return_type=new Bus();
                break;

        }

        return return_type;
    }

}
