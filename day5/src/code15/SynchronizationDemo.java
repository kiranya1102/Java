package code15;

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedCounter counter = new SynchronizedCounter();
        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter value: " + counter.getValue());
    }
}
//In this program, we define a SynchronizedCounter class with three methods: increment(), decrement(), and getValue(). Each method is declared as synchronized, which means that only one thread can execute the method at a time.

//We also define a CounterThread class that takes a SynchronizedCounter object as a parameter in its constructor. The run() method of the CounterThread class simply calls the increment() and decrement() methods of the SynchronizedCounter object repeatedly.

//Finally, in the SynchronizationDemo class, we create a SynchronizedCounter object and two CounterThread objects that share this counter object. We start both threads and wait for them to finish using the join() method. After both threads have finished, we print the final value of the SynchronizedCounter object.

//When we run the program, we should see that the final value of the SynchronizedCounter object is 0, indicating that there were no race conditions between the two threads accessing the shared resource. This is because the use of synchronized methods ensures that only one thread can execute a method at a time, preventing any race conditions from occurring.







