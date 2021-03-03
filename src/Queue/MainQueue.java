package Queue;

public class MainQueue {
    public static void main(String[] args) {
    MyQueue<Integer> q=new MyQueue<>();
    q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        System.out.println(q.dequeue());

}
}
