package org.sanket.solid.inhrt.q8;

class Base {
    Base() {
        System.out.println("Base Constructor");
    }
}

class Derived extends Base {
    Derived() {
        super();
        System.out.println("Derived Constructor");
    }
}

class SubDerived extends Derived {
    SubDerived() {
        System.out.println("SubDerived Constructor");
    }
}

public class ConstructorChain {
    public static void main(String[] args) {
        SubDerived obj = new SubDerived();
    }
}
