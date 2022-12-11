//Showing interthread communication in java by synchronization ,using wait() and notify() method
class Factory {
    int num;

    boolean setvalue = false;

    public synchronized void put(int num) {
        while (setvalue) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("produce " + num);

        this.num = num;
        setvalue = true;
        notify();
    }

    public synchronized void get() {
        while (!setvalue) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("consumer " + num);
        setvalue = false;
        notify();
    }

}

class Producer implements Runnable {
    Factory factory;

    public Producer(Factory factory) {
        this.factory = factory;
        Thread t1 = new Thread(this, "Producer");
        t1.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            factory.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            ;
        }
    }
}

class Consumer implements Runnable {
    Factory factory;

    public Consumer(Factory factory) {
        this.factory = factory;
        Thread t2 = new Thread(this, "Consumer");
        t2.start();
    }

    public void run() {
        while (true) {
            factory.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            ;
        }
    }
}

public class Threadcommunication {
    public static void main(String[] args) {
        Factory factory = new Factory();
        new Producer(factory);
        new Consumer(factory);

    }
}
