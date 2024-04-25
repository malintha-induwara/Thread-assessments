package Ex2;

class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }


    @Override
    public void run() {
            int i =0 ;
            while (true){
                System.out.println("Number is "+ i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                i++;
            }

    }
}


public class Main {
    public static void main(String[] args) {


        MyThread my = new MyThread("Hello");
        my.setDaemon(true);
        my.start();

        Thread mainThread = Thread.currentThread();
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}