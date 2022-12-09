// to show how priority of thread works
//priority of thread lies from 1 to 10 and if it is not in that range then it will throw IllegalArgumentException
public class Threadpriority extends Thread {
    String str;

    Threadpriority(String str) {
        this.str = str;
    }

    public void run() {
        System.out.println("running " + str);
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(7);
        Threadpriority th1 = new Threadpriority("thread1");
        Threadpriority th2 = new Threadpriority("thread2");

        th1.setPriority(8);
        th2.setPriority(10);
        // th1 is the child of main thread therefore it will also get priority equal to
        // it if we don't set the priority externally;

        th1.start();
        th2.start();

        System.out.println("currently executing thread is " + Thread.currentThread().getName()
                + " and it's priority is " + Thread.currentThread().getPriority());

        System.out.println("priority of thread th1 is " + th1.getPriority());

        // now both thread have equal priority ,depend on jvm wich will execute first

    }
}
