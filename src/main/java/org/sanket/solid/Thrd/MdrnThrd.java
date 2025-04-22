package org.sanket.solid.Thrd;

public class MdrnThrd {

    public static void main(String[] args) {

        Thread thread = new Thread
                (()->{
                    System.out.println("Thrad1 is Running ");
                }
        );



        Runnable runnable= ()-> {
            System.out.println("Thrad2 is Running ");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thrad2 is Completed ");

        };

        Thread obb = new Thread(runnable,"runnable Thread");
        obb.start();
        thread.start();
        try {
            obb.join();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
