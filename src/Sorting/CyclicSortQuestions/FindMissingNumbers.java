package Sorting.CyclicSortQuestions;

import java.util.ArrayList;
import java.util.List;

class FindMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
       cyclicSort(arr);
       System.out.println(findMissingValues(arr));
    }
    
    static List<Integer> findMissingValues(int[] nums){
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i< nums.length;i++){
            if(nums[i]-1 != i){
                arr.add(i+1);
            }
        }
        return arr; 
    }
    
    static void cyclicSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[correct] != nums[i]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}