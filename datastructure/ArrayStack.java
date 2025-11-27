package datastructure;

public class ArrayStack {
    private int[] data;
    private int top;   // points to the index of the top element; -1 means empty

    // Constructor: initialize with a fixed capacity
    public ArrayStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be > 0");
        }
        data = new int[capacity];
        top = -1;
    }

    // Push: O(1)
    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack overflow: stack is full");
        }
        data[++top] = value; // increment top, then assign
    }

    // Pop: O(1)
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow: stack is empty");
        }
        return data[top--]; // return then decrement top
    }

    // Peek: O(1)
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[top];
    }

    // isEmpty: O(1)
    public boolean isEmpty() {
        return top == -1;
    }

    // isFull: O(1)
    public boolean isFull() {
        return top == data.length - 1;
    }

    // size: O(1)
    public int size() {
        return top + 1;
    }

    // capacity (optional helper)
    public int capacity() {
        return data.length;
    }
}
