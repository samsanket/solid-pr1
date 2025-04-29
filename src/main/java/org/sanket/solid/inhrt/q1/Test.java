package org.sanket.solid.inhrt.q1;

class Parent {
    int num = 10;
    
    Parent() {
        System.out.println("Parent constructor: " + num);
        print();
    }
    
    void print() {
        System.out.println("Parent print: " + num);
    }
}

class Child extends Parent {
    int num = 20;
    
    Child() {
        System.out.println("Child constructor: " + num);
    }
    
    void print() {
        System.out.println("Child print: " + num);
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
    }
}
