package multithreading;

public class YieldDemo extends Thread {
    public static void main(String[] args) {
        YieldDemo obj = new YieldDemo();
        obj.start();
        for (int j = 0; j <= 5; j++) {
            System.out.println("In main Thread");
        }
    }

    @Override
    public void run() {
        Thread.yield();
//        It stops the current execution of the thread
//        and gives chance to another thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("in run method");
        }
    }
}
