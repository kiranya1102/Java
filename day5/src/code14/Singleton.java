package code14;

public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation from outside
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}