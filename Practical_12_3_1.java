public class Practical_12_3_1{
    static Integer sum = 0;

    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (lock) {
                    sum = sum + 1;
                }
            }
        };

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("Final sum (with synchronization): " + sum);
    }
}