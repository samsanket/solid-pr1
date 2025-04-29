package org.sanket.solid.abstr;

public abstract class Deflt {
    int t;

   public Deflt(){
       System.out.println("Deflt Constructor");
        t=100;
    }

    public int getT() {
       System.out.println("t is " + t);
        return t;
    }

    abstract int summ();
}
