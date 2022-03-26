package Sorting.CyclicSortQuestions;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        System.out.println(findDupicateNumber(new int[]{3,1,3,4,2}));
    }

    static int findDupicateNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != 1+i){
                int correct = arr[i] - 1;
                if(arr[correct] != arr[i]){
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
