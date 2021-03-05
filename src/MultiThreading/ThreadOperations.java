package MultiThreading;

public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Program started");
        Thread t=Thread.currentThread();
        String name=t.getName();
        System.out.println("Current running thread is "+ name);
        t.setName("Mymain");
        System.out.println("new name of Current running thread is "+ t.getName());
        System.out.println("Current running thread id is "+ t.getId());
        System.out.println("Program terminated");
    }
}
