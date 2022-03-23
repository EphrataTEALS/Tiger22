package sampleCode.Encapsulation;

public class QueueClient {

    public static void main(String[] args) {

        // DoQueueOperations();
        DoQueueSafeOperations();
    }

    public static void DoQueueOperations() {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.toString());

        System.out.println("Dequeing : " + q.dequeue());
        System.out.println(q.toString());

        ///// DANGER //////
        System.out.println("Removing element! : " + q.list.remove(1));
        System.out.println(q.toString());
    }

    public static void DoQueueSafeOperations() {
        QueueSafe q = new QueueSafe();

        q.enqueue(1);
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.toString());

        System.out.println("Dequeing : " + q.dequeue());
        System.out.println(q.toString());

        ///// DANGER //////
        // System.out.println("Removing element! : " + q.list.remove(1));
        // System.out.println(q.toString());

    }
    
}
