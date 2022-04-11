package numbersystem;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,1,6,4};
        System.out.println(findUniq(arr));
    }

    static int findUniq(int[] arr){
        int unique = 0;
        for(int item : arr){
            unique ^= item;
        }
        return unique;
    }
}
