package org.sanket.solid.inhrt.q4;

class X {
    int value = 100;
    
    X() {
        modifyValue();
    }
    
    void modifyValue() {
        value += 10;
    }
}

class Y extends X {
    Y() {
        super();
        value += 20;
    }
    
    void modifyValue() {
        value += 30;
    }
}

public class Example {
    public static void main(String[] args) {
        Y obj = new Y();
        System.out.println(obj.value);
    }
}
