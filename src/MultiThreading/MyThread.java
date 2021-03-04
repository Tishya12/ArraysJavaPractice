package MultiThreading;

public class MyThread implements Runnable{
public void run(){
    for(int i=0;i<10;i++){
        System.out.println("Mythread is running "+(i+1) );
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }
}

    public static void main(String[] args) {
    MyThread t=new MyThread();
    AnotherThread t2=new AnotherThread();

    Thread thread=new Thread(t);
    thread.start();

        Thread thread2=new Thread(t2);
        thread2.start();
}
}
