package code13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        int numTasks = 10;
        ExecutorService executor = Executors.newFixedThreadPool(numTasks);

        for (int i = 0; i < numTasks; i++) {
            final int taskIndex = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Starting task " + taskIndex);
                    // simulate task by sleeping for a random amount of time
                    try {
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ending task " + taskIndex);
                }
            });
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // wait for all tasks to complete
        }

        System.out.println("All tasks completed.");
    }
}