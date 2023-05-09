package code9;

public class ThreadDemo1 {
    public static void main(String[] args) {
        // create a new instance of the RunnableDemo class
        RunnableDemo1 runnableDemo = new RunnableDemo1();

        // create a new thread, passing the RunnableDemo instance to the constructor
        Thread thread = new Thread(runnableDemo);

        // start the thread
        thread.start();
    }
}