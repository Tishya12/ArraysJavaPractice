package MultiThreading;

public class AnotherThread implements Runnable {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Anotherthread is running " + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
