package multithreading;

public class ProducerConsumer {
    int num;
    public void set(int num){
        this.num=num;
        System.out.println("Set:"+ this.num);
    }
    public void get(){
        System.out.println("Get:"+num);
    }
}

class Producer implements Runnable{

    ProducerConsumer producerConsumer;

    public Producer(ProducerConsumer producerConsumer){
        this.producerConsumer=producerConsumer;
        Thread t1=new Thread(this);
        t1.start();

    }

    @Override
    public void run() {
        int i=0;
        while(true){
            producerConsumer.set(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Consumer implements Runnable{

    ProducerConsumer producerConsumer;
    public Consumer(ProducerConsumer producerConsumer){
        this.producerConsumer=producerConsumer;
        Thread t2=new Thread(this);
        t2.start();
    }


    @Override
    public void run() {
        while (true){
            producerConsumer.get();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Main{
    public static void main(String[] args) {
        ProducerConsumer producerConsumer=new ProducerConsumer();
        Producer producer= new Producer(producerConsumer);
        Consumer consumer= new Consumer(producerConsumer);
    }
}








//notify
//wait
//syna