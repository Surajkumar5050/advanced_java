
import java.util.LinkedList;
import java.util.Queue;

public class QueueAndLinkedList_1 {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue1 = new LinkedList<Integer>();

        queue1.offer(1);
        queue1.offer(2);
        queue1.offer(3);
        queue1.offer(4);
        queue1.offer(5);
        queue1.offer(6);
        queue1.offer(7);
        queue1.offer(8);
        queue1.offer(9);
        queue1.offer(10);
        queue1.offer(11);
        queue1.offer(12);
        queue1.offer(13);
        queue1.offer(14);

        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);
        System.out.println(queue1.peek());
        try {
            queue1.remove();
            System.out.println(queue1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
