package org.sanket.solid.excp;

// Custom checked exception
class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}

// Custom unchecked exception
class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}

class Parent {
    void riskyMethod() throws MyCheckedException {
        System.out.println("Parent riskyMethod start");
        if (true) {
            throw new MyCheckedException("Checked Exception from Parent");
        }
    }

    void anotherMethod() {
        System.out.println("Parent anotherMethod start");
        if (true) {
            throw new MyUncheckedException("Unchecked Exception from Parent");
        }
    }
}

class Child extends Parent {
    @Override
    void riskyMethod() { // Notice: no throws here
        System.out.println("Child riskyMethod start");
        if (true) {
            throw new MyUncheckedException("Unchecked Exception from Child riskyMethod");
        }
    }

    @Override
    void anotherMethod() {
        System.out.println("Child anotherMethod start");
    }
}

public class MixChallenge {
    public static void main(String[] args) {
        Parent p = new Child();

        try {
            p.riskyMethod();
        } catch (MyCheckedException e) {
            System.out.println("Caught MyCheckedException: " + e.getMessage());
        }

        p.anotherMethod();

        System.out.println("End of main");
    }
}
