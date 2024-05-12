package Ex3;

class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }


    @Override
    public void run() {
            int i =0 ;
            while (true){
                System.out.println("Number "+ i + "My thread");
                i++;
            }

    }
}


public class Main {
    public static void main(String[] args) {


        MyThread my = new MyThread("Hello");
        my.start();




        int j = 0 ;

        while (true){
            System.out.println("Number "+j + "Main ");
            j++;
          //  Thread.yield();


            //Because of above line my thread get more time in the compilation



        }


    }
}