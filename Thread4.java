package Threadsprogram;

// giving reference of runnable interface
public class Thread4 implements Runnable {
    public void run() {
        System.out.println("now it is running");

    }

    public static void main(String[] args) {
        Runnable r1 = new Thread4();
        Thread thread4 = new Thread(r1, "aryansh's thread");

        thread4.start();

        String str1 = thread4.getName();
        System.out.println(str1);
    }
}
