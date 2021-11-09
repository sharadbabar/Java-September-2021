package multithreading;

public class ThreadValueIncrementAndPrint {

    public static void main(String[] args) {
        VariableDemo obj=new VariableDemo();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {

                while(true){
                    obj.i=obj.i+1;
                    System.out.println("set-->"+obj.i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("get-->"+obj.i);
//                    System.out.println("Sharad");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                System.out.println(t1.i);
            }
        });
        t1.start();
        t2.start();
    }
}

class VariableDemo{
    int i=0;
}
