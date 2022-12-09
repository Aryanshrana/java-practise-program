// applying sleep method on  custom thread;
public class Threadsleep1 extends Thread {
    // String str;

    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Threadsleep1 t1 = new Threadsleep1();
        Threadsleep1 t2 = new Threadsleep1();

        t1.start();
        t2.start();
    }
}
