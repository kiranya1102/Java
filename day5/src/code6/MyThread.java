package code6;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Hello from a new thread!");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

//In this program, we create a new class called MyThread that extends the Thread class. We override the run() method to specify the behavior of the thread when it starts running. In this case, we simply print a message to the console.

//In the main() method, we create a new instance of MyThread and call the start() method on it to start the thread. When start() is called, it creates a new thread of execution and calls the run() method on that thread.

//Note that calling run() directly on the MyThread instance would simply execute the run() method on the same thread as the main() method, and not create a new thread of execution. We need to call start() instead to create a new thread.
