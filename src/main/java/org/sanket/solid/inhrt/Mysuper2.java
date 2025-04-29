package org.sanket.solid.inhrt;

class MySuper {
    String str ="k";
    public void print(){
        System.out.println("Word "+ str);
    }
    public MySuper(){
        str="y";
        print();
    }
}

public class Mysuper2 extends MySuper{
    String str="m";
    public  void  print(){
        System.out.println("word " +str);
    }
    public static void main(String[] args) {

        MySuper mysuper2= new Mysuper2();

    }
}