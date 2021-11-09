package multithreading;

public class ThreadPriorityDemo {

    public static void main(String[] args) {
        Thread1 obj1=new Thread1();
        Thread2 obj2=new Thread2();
        obj1.setPriority(Thread.MIN_PRIORITY);// OR 1
        obj2.setPriority(10);
        obj1.start();
        obj2.start();

    }

}
class Thread1 extends java.lang.Thread{
    @Override
    public void run(){
        System.out.println("In Thread 1 ");
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        System.out.println("In Thread 2 ");
    }
}