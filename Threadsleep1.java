// applying sleep method on  custom thread;
public class Threadsleep1 extends Thread {
    // String str;
    String name;

    public Threadsleep1(String name) {
        this.name = name;

    }

    public void run() {

        try {
            System.out.println("thread " + name + " running");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("thread " + name + " after sleeping");

    }

    public static void main(String[] args) {
        Threadsleep1 t1 = new Threadsleep1("first");

        Threadsleep1 t2 = new Threadsleep1("second");
        t1.start();
        t2.start();
    }
}
