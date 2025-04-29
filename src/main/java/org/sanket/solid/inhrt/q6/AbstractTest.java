package org.sanket.solid.inhrt.q6;

abstract class AbstractParent {
    AbstractParent() {
        System.out.println("AbstractParent constructor");
        callMe();
    }
    
    abstract void callMe();
}

class ConcreteChild extends AbstractParent {
    int x = 10;
    
    ConcreteChild() {
        System.out.println("ConcreteChild constructor");
    }
    
    void callMe() {
        System.out.println("x = " + x);
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        AbstractParent obj = new ConcreteChild();
    }
}
