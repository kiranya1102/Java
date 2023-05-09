package code15;

public class CounterThread extends Thread {
    private SynchronizedCounter counter;

    public CounterThread(SynchronizedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.increment();
            counter.decrement();
        }
    }
}
