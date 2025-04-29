package org.sanket.solid.inhrt.q9;

class FinalTest {
    final int x;

    FinalTest(int x) {
        this.x = x;
    }


    void changeX() {
        // x = 20; // What happens if you uncomment this?
    }
}

public class FinalVariable {
    public static void main(String[] args) {
        FinalTest obj = new FinalTest(10);
        System.out.println(obj.x);
    }
}
