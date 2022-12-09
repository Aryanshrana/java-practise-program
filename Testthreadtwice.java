// we  cannot start a thread twice. once after starting it executes but on secon time it throws IllegalThreadStateException
//example
public class Testthreadtwice extends Thread {
    public void run() {
        try {
            System.out.println("running");
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("after sleeping");
    }

    public static void main(String[] args) {
        Testthreadtwice t1 = new Testthreadtwice();
        t1.start();
        t1.start();
    }
}
