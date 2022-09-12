package com.codegym;

public class Student {
    String name = "John";
    String classes = "C02";
    public  Student() {}
    public Student(String name,String classes) {
        this.name = name;
        this.classes = classes;
    }
    public String getName() {
       return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClasses() {
        return this.classes;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
}
