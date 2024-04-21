public class Main {
    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread One: " + (i+1));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread Two: " + (i+1));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        t2.start();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());


        t1.join();
        t2.join();

        //Join keyword is used to tell the current thread to wait until selected threads( .join threads ) to complete before continue and  go to next step
        //isAlive is used to check whether to check th corresponding thread is running or not


        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        System.out.println("End");


    }
}