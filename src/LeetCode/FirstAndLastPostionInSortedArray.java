package LeetCode;

import java.util.Arrays;

public class FirstAndLastPostionInSortedArray {
    public static void main(String[] args) {
        int[] ans = {-1,-1};
        int[] nums = {5,7,7,7,7,7,7,7,8,8,10};
        int target = 7;
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        System.out.println(Arrays.toString(ans));
    }
    static int search(int[] nums, int target, boolean isFistIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            } else {
                // Potential answer found
                ans = mid;
                if(isFistIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
