package code8;

public class ThreadDemo {
    public static void main(String[] args) {
        // create two threads
        Thread t1 = new MyThread("Thread 1");
        Thread t2 = new MyThread("Thread 2");

        // set thread priorities
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        // start the threads
        t1.start();
        t2.start();
    }
}
//In this program, we create two threads t1 and t2 of class MyThread. We set their priorities using the setPriority() method, with t1 having maximum priority and t2 having minimum priority.