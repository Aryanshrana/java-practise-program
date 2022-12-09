import java.io.*;

//show the working of join method , it will stop current thread and execute the thread on which it invokes
public class Threadjoin extends Thread {
    public void run() {
        for (int j = 0; j < 2; j++) {
            try {
                Thread.sleep(300);
                System.out.println("the current thread is " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(j);
        }
    }

}

class Thradjointest {
    public static void main(String[] args) {
        // making threads
        Threadjoin th1 = new Threadjoin();
        Threadjoin th2 = new Threadjoin();
        Threadjoin th3 = new Threadjoin();

        th1.start();// starting thread 1
        try {
            System.out.println("the current thread is " + Thread.currentThread().getName());
            th1.join();// invoking the thread 1 so that main thread stops and thread1 starts , main
                       // thread(current thread) will wait until thread 1 is dead
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        th2.start();// starting thread 1
        try {
            System.out.println("the current thread is " + Thread.currentThread().getName());
            th2.join();// invoking the thread 2 so that main thread stops and thread1 starts , main
                       // thread(current thread) will wait until thread 2 is dead
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        th3.start();// startin the thread 3

    }
}
