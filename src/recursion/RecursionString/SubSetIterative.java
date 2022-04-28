package recursion.RecursionString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetIterative {
    public static void main(String[] args) {
        List<List<Integer>> res = subSet(new int[] {1,2,3});
        for(List<Integer> data:res){
            System.out.println(data);
        }
        List<List<Integer>> duplicatesArray = subSetWithouDuplicates(new int[] {1,2,2});
        for(List<Integer> data:duplicatesArray){
            System.out.println(data);
        }
    }
    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            // Since new list will be same size of existing list
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return  outer;
    }
    static List<List<Integer>> subSetWithouDuplicates(int[] arr){
        //Sort the array
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0;
        int end = 0;
        for(int i = 0;i<arr.length;i++){
            // If current and previous element are same, s = e + 1
            if (i>0 && arr[i] == arr[i-1]) {
                start = end+1;
            }
            // End is behind each loop to make start work in case
            end = outer.size()-1;
            int n = outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return  outer;
    }

}
