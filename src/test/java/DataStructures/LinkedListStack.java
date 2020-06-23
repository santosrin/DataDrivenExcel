package DataStructures;

public class LinkedListStack {

    Node head;
    class Node {
        int value;
        Node next;
    }

    public LinkedListStack() {
        head = null;
    }

    public void push(int value) {
        Node extraHead = head;
        head = new Node();
        head.value = value;
        head.next = extraHead;
    }

    public int pop() {
        if(head==null){
            System.out.println("stack is null");
        }
        int value = head.value;
        head = head.next;
        return value;
    }

    public static void printList(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListStack ls = new LinkedListStack();
        //System.out.println(ls.pop());
        ls.push(10);
        ls.push(20);
        ls.push(30);
        ls.push(60);
        ls.push(90);
        System.out.println(ls.pop());
        System.out.println(ls.pop());
        ls.push(45);
        System.out.println(ls.pop());
        printList(ls.head);
    }
}
