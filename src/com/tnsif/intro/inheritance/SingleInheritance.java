package com.tnsif.intro.inheritance;

class Parent {
    void parentMethod() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child class");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child s = new Child();
        s.parentMethod(); 
        s.childMethod();  
    }
}
