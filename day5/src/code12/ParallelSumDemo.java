package code12;

import java.util.Arrays;

public class ParallelSumDemo {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = 4;
        int arrayLength = array.length;
        int[] sums = new int[numThreads];
        Thread[] threads = new Thread[numThreads];

        // create and start threads
        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    int start = threadIndex * arrayLength / numThreads;
                    int end = (threadIndex + 1) * arrayLength / numThreads;
                    for (int j = start; j < end; j++) {
                        sums[threadIndex] += array[j];
                    }
                }
            });
            threads[i].start();
        }

        // wait for threads to finish
        for (Thread thread : threads) {
            thread.join();
        }

        // calculate final sum
        int finalSum = Arrays.stream(sums).sum();
        System.out.println("Final sum: " + finalSum);
    }
}