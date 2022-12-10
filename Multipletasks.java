// doing multiple task by multiple threads , more than one run method , we are creating more than one class for each run method
class Sample1 extends Thread {
    public void run() {
        System.out.println("sample1 testing");
    }
}

class Sample2 extends Thread {
    public void run() {
        try {
            System.out.println("sample2 testing");
            Thread.sleep(500);
            System.out.println("after sleeping testing again sample2");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Multipletasks {
    public static void main(String[] args) {
        Sample1 s1 = new Sample1();
        Sample2 s2 = new Sample2();

        s2.start();
        s1.start();

    }

}
