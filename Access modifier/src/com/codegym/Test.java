package com.codegym;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Hieu");
        student.setClasses("Codegym");
        System.out.println( "Name is :"+ student.getName());
        System.out.println("Classes is :"+ student.getClasses());
    }
}
