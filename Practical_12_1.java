class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
    }
}

public class Practical_12_1{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.setName("Thread-A");
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("Thread-B");
        t2.start();
    }
}