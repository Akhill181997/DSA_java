package queue;
public class QueueImplementation {
    int queue[] = new int[5];
    int front = 0; 
    int rear = 0; 
    int size = 0;  

    public void enqueue(int data) {
        if (size == 5) {
            System.out.println("Queue is full");
        } else {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        }
    }

    public int dequeue() {
        int data = -1; 
        if (size == 0) { 
            System.out.println("Queue is empty");
        } else {
            data = queue[front];
            front = (front + 1) % 5;
            size--;
        }
        return data;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " ");  
        }
        System.out.println(); 
    }
}
