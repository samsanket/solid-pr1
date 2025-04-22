package org.sanket.solid.funct;

public class CalcImpl {
    public static void main(String[] args) {
       CalculateAdd calculateAdd= (a,b)->a+b;
       int result = calculateAdd.add(10,20);
       System.out.println(result);
    }
}
