class  Mythread extends Thread{

    @Override
    public void run() {
        System.out.println("My thread started");
    }
}



public class Main {
    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();

    }
}