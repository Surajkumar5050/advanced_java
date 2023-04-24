import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Collection_Class{
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();

        list1.add(90);
        list1.add(44);
        list1.add(2);
        list1.add(34);
        list1.add(21);
        list1.add(98);
        list1.add(45);
        list1.add(38);
        list1.add(50);
        list1.add(100);

        System.out.println("minimum element : "+ Collections.min(list1));
        System.out.println("maximum element : "+ Collections.max(list1));
        System.out.println("frequency of 100 : "+ Collections.frequency(list1, 100));

        Collections.sort(list1);
        System.out.println(list1);
    }
}