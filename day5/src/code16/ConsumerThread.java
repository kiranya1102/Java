package code16;

public class ConsumerThread extends Thread {
    private SharedResource sharedResource;

    public ConsumerThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResource.getValue();
        }
    }
}
