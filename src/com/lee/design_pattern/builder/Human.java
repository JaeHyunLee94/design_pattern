package com.lee.design_pattern.builder;

public class Human {

    private String name;
    private String race;
    private String country;
    private String gender;
    private String job;
    private int age;
    private int height;
    private int weight;


    public static class HumanBuilder{
        //필수인자
        private String name;
        private String race;
        //선택인자
        private String country="korea";
        private String gender="male";
        private String job="student";
        private int age=27;
        private int height=179;
        private int weight=70;

        HumanBuilder(String name,String race){
            this.name=name;
            this.race=race;
        }
        HumanBuilder country(String country){
            this.country=country;
            return this;
        }
        HumanBuilder gender(String gender){
            this.gender=gender;
            return this;
        }
        HumanBuilder job(String job){
            this.job=job;
            return this;
        }
        HumanBuilder age(int age){
            this.age=age;
            return this;
        }
        HumanBuilder height(int height){
            this.height=height;
            return this;
        }
        HumanBuilder weight(int weight){
            this.weight=weight;
            return this;
        }
        Human build(){
            return new Human(this);
        }

    }

    private Human(HumanBuilder builder){
        this.age=builder.age;
        this.name=builder.name;
        this.height=builder.height;
        this.weight=builder.weight;
        this.job=builder.job;
        this.country=builder.country;
        this.gender=builder.gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
