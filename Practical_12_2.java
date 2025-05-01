class MyRunnable implements Runnable{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
            }
        }
    }
}

public class Practical_12_2{
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();

        Thread t1 = new Thread(obj, "Thread-A");
        Thread t2 = new Thread(obj, "Thread-B");

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        t2.start();
    }
}
