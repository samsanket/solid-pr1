package org.sanket.solid.abstr;

public class Dimpl extends Deflt{
    @Override
    int summ() {
        return t+100;
    }

    public static void main(String[] args) {
        Deflt deflt= new Dimpl();
        deflt.summ();
        System.out.println(deflt.t);
        System.out.println(deflt.summ());

    }
}
