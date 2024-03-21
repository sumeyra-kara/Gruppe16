package tage.tag69;

import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

        queue.add("Test51");
        queue.add("Test2");
        queue.add("Test3");
        queue.add("Test4");

        System.out.println("queue vor poll: " + queue);

        System.out.println("queue.poll " + queue.poll());

        System.out.println("queue nach poll: " + queue);

        System.out.println("queue offer(): " + queue.offer("Test4"));

        System.out.println("queue nach poll: " + queue);

        if(queue.offer("text")){
            System.out.println("queue ist nicht voll und 'text' wird in die queue gelegt");
        }
        else {
            System.out.println("queue ist voll");
        }

        System.out.println("queue vor poll: " + queue);

        System.out.println("queue.poll " + queue.poll());

        System.out.println("queue nach poll: " + queue);



    }
}
