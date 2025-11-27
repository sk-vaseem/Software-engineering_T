package datastructure;


public class Stackdemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        System.out.println("Empty? " + stack.isEmpty()); // true

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());      // 30
        System.out.println("Size: " + stack.size());     // 3
        System.out.println("Full? " + stack.isFull());   // false

        System.out.println("Popped: " + stack.pop());    // 30
        System.out.println("Popped: " + stack.pop());    // 20

        System.out.println("Size: " + stack.size());     // 1

        
        // while (true) stack.push(99); // throws IllegalStateException when full
        // while (true) System.out.println(stack.pop());   // throws when empty
    }
}
