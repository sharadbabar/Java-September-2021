package multithreading;

public class ThreadClassMethods {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In run");
            }
        });
        t1.setName("Thread first");
        System.out.println(t1.getName());


        Thread t2=new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("In run");
            }
        });
        t2.setName("Thread second");
        System.out.println(t2.getName());
    }
}


//t1.getPriority()
//t1.setPriority()
//t1.isAlive()
//t1.isDaemon()