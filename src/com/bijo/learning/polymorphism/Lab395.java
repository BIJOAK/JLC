package com.bijo.learning.polymorphism;

public class Lab395 {
    public static void main(String[] args) {
        Person pob=null;
        pob= new Student();
        pob.sleeping();
        pob=new Employee();
        pob.sleeping();
    }
}
