package general.threads;

public class HelloRunnable implements Runnable {

    public void run() {

        System.out.println("Hello from a thread! : " + Thread.currentThread().getName());
    }

    public static void main(String args[]) {

        (new Thread(new HelloRunnable(), "HelloThread1")).start();
        (new Thread(new HelloRunnable(), "HelloThread2")).start();
    }

}
