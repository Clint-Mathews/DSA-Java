package recursion.ArrayRecursion;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,9,19};
        System.out.println("Sorted: "+ArraySorted(arr,0));
        int[] arr1 ={1,2,3,14,5,6,9,19};
        System.out.println("Sorted: "+ArraySorted(arr1,0));
    }

    static boolean ArraySorted(int[] arr, int i){
        if(arr.length-1 == i) return true;
        return arr[i] < arr[i+1] && ArraySorted(arr,i+1);
    }
}
