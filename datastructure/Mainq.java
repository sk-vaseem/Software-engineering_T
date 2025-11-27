package datastructure;


public class Mainq {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(4);

        System.out.println("Empty? " + q.isEmpty()); // true

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Peek: " + q.peek());     // 10
        System.out.println("Size: " + q.size());     // 3

        System.out.println("Dequeue: " + q.dequeue()); // 10
        System.out.println("Dequeue: " + q.dequeue()); // 20
        System.out.println("Size: " + q.size());       // 1

        q.enqueue(40);
        q.enqueue(50);
        System.out.println("Full? " + q.isFull());     // true

        // Uncomment to test overflow/underflow:
        // q.enqueue(60); // throws IllegalStateException when full
        // while (true) System.out.println(q.dequeue()); // throws when empty
    }
}
