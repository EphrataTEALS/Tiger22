package sampleCode.Encapsulation;

import java.util.ArrayList;

// TODO: Talk about invariants.
// TODO: Talk about changing imp.
public class Queue {
    ArrayList<Integer> list;

    public Queue() {
        list = new ArrayList<Integer>();
    }

    // TODO: Implement this method.
    // Returns the oldest element in the queue.
    // If there's nothing to remove, return -1.
    public int dequeue() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.remove(0);
    }

    // TODO: Implement this method
    // Adds the element to the queue.
    public void enqueue(int element) {
        list.add(element);
    }

    public String toString() {
        return list.toString();
    }
}
