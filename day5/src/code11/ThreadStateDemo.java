package code11;

public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        // create a new Thread object
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
                try {
                    Thread.sleep(2000); // sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // print the initial state of the thread
        System.out.println("Initial state: " + thread.getState());

        // start the thread
        thread.start();
        System.out.println("After start(): " + thread.getState());

        // wait for the thread to enter timed waiting state
        Thread.sleep(500);
        System.out.println("After sleep(): " + thread.getState());

        // wait for the thread to finish executing
        thread.join();
        System.out.println("After join(): " + thread.getState());

        // print the final state of the thread
        System.out.println("Final state: " + thread.getState());
    }
}
