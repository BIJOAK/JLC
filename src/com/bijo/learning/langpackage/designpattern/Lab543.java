package com.bijo.learning.langpackage.designpattern;

public class Lab543 {
    public static void main(String[] args) {
        Student1 st=new Student1(99,"Bijo",67548976);
        System.out.println(st);
    }
}

final class Student1{
    private final int sid;
    private final String name;
    private final long phone;

    public Student1(int sid,String name,long phone){
        this.sid=sid;
        this.name=name;
        this.phone=phone;
    }

    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", phone=" + phone ;
    }
}