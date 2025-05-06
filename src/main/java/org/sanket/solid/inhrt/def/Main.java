package org.sanket.solid.inhrt.def;


import java.util.Optional;

interface  InterdaceA{
    default void commonMethod(){
        System.out.println("A");
    }
}


interface  InterdaceB{
    default void commonMethod(){
        System.out.println("B");
    }
}

class  ImplClass implements InterdaceA,InterdaceB{


    public void commonMethod() {
        InterdaceA.super.commonMethod();
        InterdaceB.super.commonMethod();
    }
}
public class Main {
    public static void main(String[] args) {

        ImplClass implClass= new ImplClass();
        implClass.commonMethod();


    }
}
