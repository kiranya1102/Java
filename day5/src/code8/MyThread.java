package code8;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);

            // sleep for a random amount of time
            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//The MyThread class extends Thread and overrides its run() method. Inside the run() method, the thread prints its name followed by a number from 1 to 5, and then sleeps for a random amount of time between 0 and 1 second using the Thread.sleep() method.
//When we run the program, we should see that Thread 1 outputs its numbers more quickly and consistently than Thread 2, due to its higher priority. However, because we're introducing some random sleep time, the actual output could be different every time we run the program.