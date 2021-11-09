package multithreading;

public class DaemonThread extends Thread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println(t1.isDaemon());
    }

    @Override
    public void run() {
        System.out.println("In run method");
    }
}
