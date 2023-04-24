public class three {
    public void finalize(){
        // int i = 0;
        // i++;
        // System.out.println(i);
        System.out.println("object is garbage collected...");
    }
    public static void main(String[] args) {

        
        three a = new three();
        three b = new three();
        three c = new three();

        a = null;
        b = null;
        c = null;

        // if (System.gc()) {
        //     System.out.println("done");
        // } else {
        //     System.out.println("not");
        // }
    }
}
