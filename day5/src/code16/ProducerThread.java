package code16;

public class ProducerThread extends Thread {
    private SharedResource sharedResource;

    public ProducerThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResource.setValue(i);
        }
    }
}
