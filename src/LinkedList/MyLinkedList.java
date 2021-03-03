package LinkedList;


import java.util.LinkedList;

//to make it generic replace int with E(element)
public class MyLinkedList<E> {     //<E>
  Node<E> head;                  //Node<E>
    public void add(E data){
        Node<E> toAdd=new Node<E>(data);
        if(isEmpty()){
            head=toAdd;
            return;
        }
        Node<E> temp=head;
        while(temp.next!=null){
           temp=temp.next;
        }
        temp.next=toAdd;
    }
    public boolean isEmpty(){
        return head==null;
    }
    void print(){
        Node<E> temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    public E removeLast(){
        Node<E> temp=head;
        //if list has only one element
        if(temp.next==null) {
            Node<E> toRemove=head;
            head=null;
            return toRemove.data;
        }
        //check for 2nd last element
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node<E> toRemove=temp.next;
        temp.next=null;
        return toRemove.data;
    }

    public E getLast(){
        Node<E> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp.data;
    }

    public static class Node<E>{
        public E data;
        public Node next;

        public Node(E data){
            this.data=data;
            this.next=null;
        }
    }
}
