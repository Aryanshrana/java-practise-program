package Threadsprogram;

// using runnable interface
public class Thread2 implements Runnable {
    public void run() {
        System.out.println("creating thread by implementing runnable interface");
    }

    public static void main(String[] args) {
        Thread2 t2 = new Thread2();
        Thread thread1 = new Thread(t2);
        thread1.start();
    }
}
