package code7;

public class MultiThread extends Thread {
    private String name;

    public MultiThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread " + name + " has started.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + name + " has finished.");
    }

    public static void main(String[] args) {
        MultiThread thread1 = new MultiThread("Thread 1");
        MultiThread thread2 = new MultiThread("Thread 2");

        thread1.start();
        thread2.start();
    }
}
//In this program, we create a new class called MultiThreadExample that extends the Thread class. We override the run() method to specify the behavior of the thread when it starts running. In this case, we print a message indicating that the thread has started, then pause the thread for 5 seconds using the Thread.sleep() method to simulate some work being done. Finally, we print another message indicating that the thread has finished.

//In the main() method, we create two instances of MultiThreadExample with different names, then call the start() method on each instance to start the threads. When start() is called on each instance, it creates a new thread of execution for each instance and calls the run() method on that thread.

//Note that the threads will run concurrently, so it's possible for the "Thread X has finished" message from one thread to appear before the "Thread Y has started" message from another thread.






