import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<String>();
        student.add("suraj");
        student.add("1");
        student.add("2");
        System.out.println(student);
        student.add(1, "777");
        System.out.println(student);

        ArrayList<String> boys = new ArrayList<String>();
        boys.add("11");
        student.addAll(boys);
        System.out.println(boys);

        System.out.println(student.get(2));
        student.remove(1);
        System.out.println(student);
        student.set(1, "555");
        System.out.println(student);
        // student.contains(boys);


        // for(int i=0; i<student.size(); i++){
        //     System.out.println(student.get(i));
        // }

        for (String string : student) {
            System.out.println(string);
        }
    }
}
