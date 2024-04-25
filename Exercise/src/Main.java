
class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
        setPriority(Thread.MIN_PRIORITY+2);
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


        System.out.println(my.getName());
        System.out.println(my.getId());
        System.out.println(my.getPriority());
        my.start();
        System.out.println(my.getState());
        System.out.println(my.isAlive());


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}