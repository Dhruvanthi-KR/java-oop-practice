package Threads;
class MultiThread extends Thread{ // using Thread class
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Thread is running "+ Thread.currentThread().getName());
        }
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        MultiThread t1 = new MultiThread();
        t1.start();
        MultiThread t2 = new MultiThread();
        t2.start();
        /*
        Thread is running Thread-0
        Thread is running Thread-1
        independent they can exchange and execute simultaneously
         */
    }
}
