package org.sanket.solid.inhrt.q10;

class Blocks {
    static {
        System.out.println("Static Block 1");
    }

    {
        System.out.println("Instance Block 1");
    }

    Blocks() {
        System.out.println("Constructor Block");
    }

    static {
        System.out.println("Static Block 2");
    }

    {
        System.out.println("Instance Block 2");
    }
}

public class BlockTest {
    public static void main(String[] args) {
        Blocks blocks = new Blocks();
        Blocks blocks1 = new Blocks();
    }
}
