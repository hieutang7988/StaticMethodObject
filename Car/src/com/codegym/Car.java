package com.codegym;

public class Car {
    private  static String name;
    private static String engine;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public  void display() {
        System.out.println(name + "\t" + engine + "\t");
    }
}
