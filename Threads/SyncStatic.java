package Threads;

class Counter{
    // static methods doesnt need objects to access them
    synchronized static void show(){
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }
}

class MyThread extends Thread{
    public void run(){
        Counter.show();
    }
}

public class SyncStatic {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
