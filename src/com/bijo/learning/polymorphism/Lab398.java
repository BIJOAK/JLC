package com.bijo.learning.polymorphism;

public class Lab398 {
    public static void main(String[] args) {
        A aobj=new B();
        System.out.println(aobj.x);
    }
}

class A{
    int x=10;
}
class B extends A{
    String x="Bijo";
}