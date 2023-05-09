package code16;

public class WaitNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();
        ProducerThread producerThread = new ProducerThread(sharedResource);
        ConsumerThread consumerThread = new ConsumerThread(sharedResource);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
