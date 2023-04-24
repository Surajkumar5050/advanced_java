import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.sampled.SourceDataLine;

public class Set_1 {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<Integer>();
        // Set<Integer> set = new LinkedHashSet<Integer>();
        Set<Integer> set = new TreeSet<Integer>(Comparator.reverseOrder());

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(10);
        
        set.remove(10);
        System.out.println(set);
        System.out.println(set.contains(5));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
