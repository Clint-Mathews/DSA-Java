package ArraysAndArrayList;

public class Max {

    public static void main(String[] args) {
        int[] arr = {1,2,23,23,23,2,11232,32,3};
        System.out.println(findmax(arr));
        System.out.println(findMaxInRange(arr, 1,4));
    }

    static int findmax(int[] arr){
        int max =arr[0];
        for(int i = 1; i<arr.length; i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
    static int findMaxInRange(int[] arr, int startIndex, int endIndex){
        if(endIndex < startIndex){
            return -1;
        }
        int max =-1;
        for(int i = startIndex; i<=endIndex; i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
}
