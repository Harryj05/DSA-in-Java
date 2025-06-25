public class Queue {
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private final int capacity;
    private int[] arr;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = arr[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // should print overflow

        q.show(); // 10 20 30 40 50

        q.dequeue();
        q.dequeue();
        q.show(); // 30 40 50

        q.enqueue(60);
        q.enqueue(70);
        q.show(); // 30 40 50 60 70
    }
}
