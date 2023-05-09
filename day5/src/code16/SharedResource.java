package code16;

public class SharedResource {
    private int value;
    private boolean isValueSet = false;

    public synchronized void setValue(int value) {
        while (isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        isValueSet = true;
        System.out.println("Producer set value: " + value);
        notify();
    }

    public synchronized int getValue() {
        while (!isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isValueSet = false;
        System.out.println("Consumer got value: " + value);
        notify();
        return value;
    }
}

