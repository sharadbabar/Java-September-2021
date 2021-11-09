package multithreading;

public class SynchronizeDemo {
    int num;
    public synchronized void increase(){
        num++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizeDemo obj=new SynchronizeDemo();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    obj.increase();

                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++) {
                    obj.increase();

                }
            }
        });

        t2.start();
        t1.start();
        t1.join();
        t2.join();
        System.out.println(obj.num);

    }
}
