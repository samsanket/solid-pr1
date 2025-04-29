package org.sanket.solid.inhrt.q5;

class Alpha {
    static int count = 0;
    Alpha() {
        count++;
    }
}
class Beta extends Alpha {
    Beta() {
        count++;
    }
}
// count =
public class TestStatic {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        Beta b = new Beta();
        Alpha a2 = new Beta();
        System.out.println(Alpha.count);
    }
}
