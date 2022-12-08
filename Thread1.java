package Threadsprogram;

// creating thread by extending thread class
public class Thread1 extends Thread {
    public void run() {
        System.out.println("my first thread by extending thread class");
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}
