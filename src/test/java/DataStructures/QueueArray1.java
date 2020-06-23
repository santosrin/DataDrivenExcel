package DataStructures;

public class QueueArray1 {
    int front;
    int rear;
    int qSize;
    int currentSize;
    int queue[];

    public QueueArray1(int size) {
        qSize = size;
        front = 0;
        rear = -1;
        queue = new int[qSize];
    }

    public void enqueue(int data) {
        if(isFull()) {
            System.out.println("Queue is full");
        } else {
            rear++;
            if(rear == qSize-1){
                rear = 0;
            }
            queue[rear] = data;
            currentSize++;
            System.out.println(data);
        }
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            front++;
            if(front == qSize-1) {
                System.out.println(queue[front-1]);
                front = 0;
            } else {
                System.out.println(queue[front-1]);
            }
            currentSize--;
        }
    }

    public boolean isFull(){
        if(currentSize == qSize) {
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(currentSize == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        QueueArray1 qa = new QueueArray1(1);
        //qa.dequeue();

        qa.enqueue(10);
        qa.dequeue();
        qa.dequeue();
//        qa.enqueue(20);
//        qa.enqueue(30);
//        qa.dequeue();
//        qa.enqueue(40);
    }
}
