package Sorting.CyclicSortQuestions;

public class MissingNumbers {
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[] {4,0,2,1}));
    }
    static int findMissingNumber(int[] nums){
        sortArray(nums);
        return FindMissing(nums);
    }

    static int FindMissing(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    static void sortArray(int[] nums){
        int i=0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[correct] != nums[i]){
                swap(nums, correct, i);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

}
