package LinearSearchAlgorithm;

public class MinMaxNumber {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        System.out.println(minNum(arr));
    }
    static int minNum(int[] arr){
        if(arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min> arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
