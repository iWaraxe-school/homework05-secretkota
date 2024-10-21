package Exercise4;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // create LinkedList to implement the Queue
        Queue<Integer> queue = new LinkedList<>();
        // add in queue 5 element
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("Queue:" + queue);
        // poll 2 element in queue
        queue.poll();
        System.out.println("Queue poll 1:" + queue);
        queue.poll();
        System.out.println("Queue poll 2:" + queue);
        // add 3 element in queue
        queue.add(6);
        System.out.println("Queue add 6:" + queue);
        queue.add(7);
        System.out.println("Queue add 7:" + queue);
        queue.add(8);
        System.out.println("Queue add 8:" + queue);
    }
}
