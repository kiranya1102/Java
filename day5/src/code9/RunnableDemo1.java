package code9;

class RunnableDemo1 implements Runnable {
    public void run() {
        // task to be executed by the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from thread " + Thread.currentThread().getName() + ", iteration " + i);
        }
    }
}
//In this program, we define a class RunnableDemo that implements the Runnable interface and overrides its run() method. Inside the run() method, the thread prints a message indicating its name and the current iteration number.

//In the main() method, we create a new instance of RunnableDemo and pass it to the constructor of a Thread object, which we then start by calling its start() method.