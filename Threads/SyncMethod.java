package Threads;

class Counter{
    int count = 0;
    // synchronized keyword w r t methods
    synchronized void increment(){ 
        count++;
        System.out.println(Thread.currentThread().getName()+" count : "+count);
    }
}
/*
Thread-0 count : 1
Thread-1 count : 2
Thread-1 count : 3
Thread-1 count : 4
Thread-1 count : 5
Thread-1 count : 6
Thread-0 count : 7
Thread-0 count : 8
Thread-0 count : 9
Thread-0 count : 10
*/

class MyThread extends Thread{
    Counter c; // instance variable
    MyThread(Counter c){
        this.c = c;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            c.increment();
        }
    }
}

public class SyncMethod {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        MyThread t1 = new MyThread(c1);
        MyThread t2 = new MyThread(c1);
        t1.start();
        t2.start(); 
    }
}
/*
No Thread Synchronization you can observe that they are not in order
Thread-1 count : 0
Thread-1 count : 1
Thread-1 count : 2
Thread-1 count : 3
Thread-1 count : 4
Thread-0 count : 0
Thread-0 count : 6
Thread-0 count : 7
Thread-0 count : 8
Thread-0 count : 9

op-2
Thread-1 count : 0
Thread-0 count : 0
Thread-0 count : 2
Thread-0 count : 3
Thread-0 count : 4
Thread-1 count : 1
Thread-1 count : 6
Thread-1 count : 7
Thread-1 count : 8
Thread-0 count : 5
*/
