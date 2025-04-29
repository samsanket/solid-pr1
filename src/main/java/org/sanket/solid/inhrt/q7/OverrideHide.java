package org.sanket.solid.inhrt.q7;

class SuperClass {
    static void display() {
        System.out.println("Static method from SuperClass");
    }

    void show() {
        System.out.println("Instance method from SuperClass");
    }
}

class SubClass extends SuperClass {
    static void display() {
        System.out.println("Static method from SubClass");
    }

    void show() {
        System.out.println("Instance method from SubClass");
    }
}

public class OverrideHide {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        obj.display();
        obj.show();
    }
}
