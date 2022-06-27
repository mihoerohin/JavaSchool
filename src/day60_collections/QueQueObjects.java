package day60_collections;

import java.util.PriorityQueue;

public class QueQueObjects {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(19);
        queue.add(5);
        queue.add(4);
        queue.add(5);
        queue.add(1);
        queue.add(30);
        queue.add(10);
        queue.add(1);
        queue.add(0);
        queue.add(1);
        //  queue.get(3); get method from list
        System.out.println(queue);

        queue.offer(30);
        System.out.println(queue);

        System.out.println(new PriorityQueue<>().poll());
    }
}
