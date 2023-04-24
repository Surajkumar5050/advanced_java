import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Class {
    public static void main(String[] args) {
        Integer[] numbers = {2,1,88,66,54,30,9,25,55555};
        // int index = Arrays.binarySearch(numbers, 4);
        Arrays.sort(numbers);
        
        for (Integer integer : numbers) {
            System.out.println(integer);
        }

        // System.out.println(index);
    }
}
