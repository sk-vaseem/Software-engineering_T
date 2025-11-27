package datastructure;


public class ArrayQueue {
    private int[] data;
    private int front;  // Index of the front element (to be dequeued next)
    private int rear;   // Index where next element will be enqueued
    private int count;  // Number of elements currently in the queue

    // Constructor: initialize with a fixed capacity
    public ArrayQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be > 0");
        }
        data = new int[capacity];
        front = 0;
        rear = 0;
        count = 0;
    }

    // Enqueue: O(1)
    public void enqueue(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue overflow: queue is full");
        }
        data[rear] = value;
        rear = (rear + 1) % data.length; // circular increment
        count++;
    }

    // Dequeue: O(1)
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow: queue is empty");
        }
        int value = data[front];
        front = (front + 1) % data.length; // circular increment
        count--;
        return value;
    }

    // Peek: O(1)
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[front];
    }

    // isEmpty: O(1)
    public boolean isEmpty() {
        return count == 0;
    }

    // isFull: O(1)
    public boolean isFull() {
        return count == data.length;
    }

    // size: O(1)
    public int size() {
        return count;
    }

    // capacity (optional helper)
    public int capacity() {
        return data.length;
    }
}
