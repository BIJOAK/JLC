package com.bijo.learning.methodoverriding;

public class Lab382 {
    public static void main(String[] args) {
        B382 bobj=new B382();
        bobj.m1();
    }
}
class A382{
    void m1(){}
    static void m2(){}
}
class B382 extends A382{
    void m1(){}
    static void m2(){}
}