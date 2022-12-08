package Threadsprogram;

// we can cretae new thread by extending thread class using constructo(String name)
public class Thread3 extends Thread {

    public static void main(String[] args) {
        Thread thread2 = new Thread("second thread");

        thread2.start();
        String str = thread2.getName();
        long id = thread2.getId();
        int priority = thread2.getPriority();
        System.out.println(str + "name of thread " + id + " id of thread");
        System.out.println("priority of thread " + priority);
    }
}
