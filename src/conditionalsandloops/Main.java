package conditionalsandloops;

public class Main {
    public static void main(String[] args) {
        int sal = 100;
        if(sal >1000) {
            System.out.println("Salary low");
        } else {
            System.out.println("Salary high");
        }
        System.out.println(sal);
        if(sal >10 ) {
            sal+=10;
            System.out.println("Eligible of bonus");
        } else {
            System.out.println("No bonus");
        }
    System.out.println(sal);
    }
}
