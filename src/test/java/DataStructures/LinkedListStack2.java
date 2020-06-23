package DataStructures;

public class LinkedListStack2 {

    Node head;
    class Node{
        int value;
        Node next;
    }

    LinkedListStack2() {
        head = null;
    }

    public void push(int element) {
        Node extraNode = head;
        head = new Node();
        head.value=element;
        head.next = extraNode;
    }

    public int pop(){
        if(head == null) {
            System.out.println("empty");
        }
        int value = head.value;
        head = head.next;
        return value;
    }

    public static void print(Node head) {
        Node temp = head;
        while(temp!= null) {
            System.out.println(temp.value + " ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListStack2 ls = new LinkedListStack2();
        ls.push(10);
        ls.push(20);
        print(ls.head);
        System.out.println(ls.pop());
    }
}
