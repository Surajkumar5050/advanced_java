import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<String>();
        animals.push("lion");
        animals.push("dog");
        animals.push("cat");
        animals.push("tiger");
        animals.push("horse");

        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);
    }
}
