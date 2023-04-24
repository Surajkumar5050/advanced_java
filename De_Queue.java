import java.util.ArrayDeque;
public class De_Queue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
        adq.offer(1);
        adq.offerFirst(10);
        adq.offerLast(20);
        adq.offer(2);
        adq.offerFirst(30);
        adq.offerLast(40);
        adq.offer(3);
        adq.offerFirst(50);
        adq.offerLast(60);
        System.out.println(adq);
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
    }
}
