package org.sanket.solid.inhrt.q11;

class A {
    private void display() {
        System.out.println("Display A");
    }
}

class B extends A {
    private void display() {
        System.out.println("Display B");
    }
}

public class PrivateOverride {
    public static void main(String[] args) {
        A obj = new B();
       //  obj.display(); // What will happen if you uncomment this?
    }
}
