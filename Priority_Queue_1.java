import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue_1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>(Comparator.reverseOrder());
        queue2.offer(1);
        queue2.offer(2);
        queue2.offer(3);
        queue2.offer(4);
        queue2.offer(5);
        queue2.offer(6);
        queue2.offer(7);
        queue2.offer(8);
        queue2.offer(9);
        queue2.offer(10);
        queue2.offer(11);
        queue2.offer(12);
        queue2.offer(13);
        queue2.offer(14);
        queue2.offer(15);
        queue2.offer(16);
        queue2.offer(17);
        queue2.offer(18);
        queue2.offer(19);
        queue2.offer(20);

        System.out.println(queue2);
        
        System.out.println(queue2.poll());
        System.out.println(queue2.peek());
        System.out.println(queue2);

    }
}
