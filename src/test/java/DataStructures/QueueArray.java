package DataStructures;

public class QueueArray {
    int capacity;
    int queueArr[];
    int front;
    int rear;
    int currentSize;

    public QueueArray(int sizeOfQueue) {
        capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        queueArr = new int[capacity];
    }

    //add element to queue
    public void enqueue(int data) {
        if(isFull()){
            System.out.println("queue is full");
        } else {
            rear++;
            if(rear == capacity-1) {
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data);
        }
    }

    //to remove element from the front of the queue
    public void dequeue(){
        if(isEmpty()) {
            System.out.println("queue is empty");
        } else {
            front++;
            if(front==capacity-1) {
                System.out.println(queueArr[front-1]+ " removed from the queue");
                front = 0;
            } else {
                System.out.println(queueArr[front-1]+ " removed from the queue");
            }
            currentSize--;
        }
    }

    public boolean isFull(){
        if(currentSize == capacity) {
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(currentSize == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        QueueArray obj = new QueueArray(10);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.dequeue();
        obj.enqueue(40);
        obj.enqueue(330);
        obj.enqueue(350);
        obj.enqueue(254);
        obj.dequeue();
    }

}
