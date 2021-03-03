package Stack;

public class MainStack {
    public static void main(String[] args) throws Exception{
        MyStack<Integer> stack=new MyStack<>();
        stack.push(1);
        stack.push(3);
        stack.push(3);
        stack.push(4);
        int popped= stack.pop();
        System.out.println("popped "+popped);
        int peeked= stack.peek();
        System.out.println("peeked "+peeked);

    }
}
