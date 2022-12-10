public class Multipletasks2 {
    // implementing runnable interface and creating two anonymous classes so that
    // thier object is created as a thread and can be used one time
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("my runnabble1 is running");
            }
        };

        Runnable r2 = new Runnable() {
            public void run() {
                System.out.println("mu runnable2 is running");
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }
}
