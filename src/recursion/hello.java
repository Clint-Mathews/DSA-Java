package recursion;

public class hello {
    public static void main(String[] args) {
        helloPrint(5);
    }
    static void helloPrint(int count){
        System.out.println("Hello");
        if (count == 0) {
            return;
        }
        helloPrint(count-1);
    }

}

