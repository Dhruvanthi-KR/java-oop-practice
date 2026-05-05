package Threads;
class MultiThread implements Runnable{ // using Thread class
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Thread is running "+ Thread.currentThread().getName());
        }
    }
}
public class ThreadInterface {
    public static void main(String[] args) {
        MultiThread t1 = new MultiThread();
        MultiThread t2 = new MultiThread();
        Thread thread1 = new Thread(t1); 
        // runnable is interface u need to create obj for thread class
        Thread thread2 = new Thread(t2);

        thread1.setName("Pallav");
        thread2.setName("DKR");

        thread1.start();
        thread2.start();
    }
}
