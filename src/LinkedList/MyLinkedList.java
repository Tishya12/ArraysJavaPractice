package LinkedList;


//to make it generic replace int with E(element)
public class MyLinkedList {     //<E>
    Node head;                  //Node<E>
    void add(int data){
        Node toAdd=new Node(data);
        if(isEmpty()){
            head=toAdd;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
           temp=temp.next;
        }
        temp.next=toAdd;
    }
    boolean isEmpty(){
        return head==null;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}
