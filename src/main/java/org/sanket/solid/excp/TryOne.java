package org.sanket.solid.excp;

public class TryOne {

    public static void main(String[] args)   {

        try {
            System.out.println(toDo(0));
        }catch (Exception e){
            System.out.println("Error happen");

            try {
                System.out.println(toDo(0));
            }catch (Exception exception){
                System.out.println("Error happen");
            }

        }

        System.out.println(toDo(1));

        System.out.println(toDo(2));

        try {
            throw  new MyOwwn();
        } catch (MyOwwn e) {
            System.out.println(" Handled My own ");
        }
    }

    private static int toDo(int ans) {
       int def =100;
        return 100/ans;
    }
}
