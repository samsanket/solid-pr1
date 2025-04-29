package org.sanket.solid.inhrt.q2;

class A {
    static {
        System.out.println("Static block A");
    }
    
    {
        System.out.println("Instance block A");
    }
    
    A() {
        System.out.println("Constructor A");
    }
}

class B extends A {
    static {
        System.out.println("Static block B");
    }
    
    {
        System.out.println("Instance block B");
    }
    
    B() {
        System.out.println("Constructor B");
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
    }
}
