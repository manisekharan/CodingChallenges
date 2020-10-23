package general.BlockingQueueDemo;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueExample {
    private BlockingQueue<String> sharedQueue = new ArrayBlockingQueue<>(64);

    public static void main(String[] args) {
        new ArrayBlockingQueueExample().createProducerConsumer();
    }

    private void createProducerConsumer() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        sharedQueue.put("DATA");
                        //sharedQueue.stream().forEach(s -> System.out.print(s+"\t "));
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Producer Thread").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + "=> ");
                    try {
                        System.out.println(sharedQueue.take());
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Consumer Thread-1").start();
    }
}
