package org.sanket.solid.Thrd.prdbm_voltl;

public class CallClass {

    public static void main(String[] args) {
        SharedResc sharedResc = new SharedResc();
        Runnable runnable = ()->{

            System.out.println("Thread 1 started ");
            sharedResc.setIs_set(true);
            System.out.println("Thread 1 Complted  ");
        };



        Runnable runnable1 = ()->{
            System.out.println("Thread 2 Started ");
            while(!sharedResc.getIs_set()){
                System.out.println("Thread 2 Running ");
            }
            System.out.println("Thread 2 Completed ");
        };



        Thread thread= new Thread(runnable);
        thread.start();
        Thread thread2= new Thread(runnable1);
        thread2.start();


    }
}
