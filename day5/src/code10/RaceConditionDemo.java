package code10;

public class RaceConditionDemo {
    public static void main(String[] args) {
        // create a shared Counter object
        Counter counter = new Counter();

        // create two threads that increment the counter
        Thread t1 = new IncrementThread(counter);
        Thread t2 = new IncrementThread(counter);

        // start the threads
        t1.start();
        t2.start();

        // wait for the threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // print the final value of the counter
        System.out.println("Final count: " + counter.getCount());
    }
}
