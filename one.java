//  enum color{
//     RED("red"), GREEN("green"), BLUE("blue");
//     private String value;
//     color(String value){
//         this.value = value;
//     }
//     public String getValue(){
//         return value;
//     }
//  }

//  public class one{
//     public static void main(String[] args) {
//         color c1 = color.RED;

//         System.out.println("RED enum name : "+c1.name());
//         System.out.println("RED enum value : "+c1.getValue());

//         for(color c : color.values()){
//             System.out.println("enum value: "+c.getValue());
//         }
//     }
//  }

enum day{
    HOLIDAY_1("10 days"), HOLIDAY_2("11 days"), HOLIDAY_3("12 days");

    private String days;
    day(String days){
        this.days = days;
    }

    public String getDays(){
        return days;
    }
    
}

public class one{
    public static void main(String[] args) {
        day day1 = day.HOLIDAY_1;
        
        System.out.println("enum name of HOLIDAY_1 is : "+ day1.name());
        System.out.println("number of days : "+ day1.getDays());

        for(day d :day.values()){
            System.out.println(d.getDays());
        }
    }
}