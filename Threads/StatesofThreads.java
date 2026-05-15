package Threads;

class ThreadEx extends Thread{
    public void Run(){
        System.out.println("State of a thread is: "+Thread.currentThread().getState());
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
            // System.out.println("Exception :"+e);
        }
    }
}

public class StatesofThreads {
    public static void main(String[] args) {
        ThreadEx t1 = new ThreadEx();
        System.out.println("State of the thread before starting : "+t1.getState());
        t1.start();
        System.out.println("State of the thread after starting : "+t1.getState()); 

        System.out.println("State of the thread before sleeping : "+t1.getState());
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("State of the thread after sleeping : "+t1.getState());

        System.out.println("State of the thread before joining : "+t1.getState());
        try{
            t1.join(); // it wait until
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("State of the thread after joining : "+t1.getState());
    }
}
/*
NOTE : states wil be changing 
State of the thread before starting : NEW
State of the thread after starting : RUNNABLE
State of the thread before sleeping : RUNNABLE
State of the thread after sleeping : TERMINATED
State of the thread before joining : TERMINATED
State of the thread after joining : TERMINATED
*/