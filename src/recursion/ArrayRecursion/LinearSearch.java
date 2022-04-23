package recursion.ArrayRecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={3,2,1,18,9};
        int target =18;
        int[] arr2 ={3,18,2,1,18,9,18};
        System.out.printf("%d element in Array : %b",target,LSearch(arr,target,0));
        System.out.printf("\n%d element in Array in reverse : %b",target,LSearchReverse(arr,target,arr.length-1));
        System.out.printf("\n%d element in Array index : %d",target,LSearchIndex(arr,target,0));
        FindAllIndex(arr2,target,0);
        System.out.println("\nFind All index: "+ res.toString());
        ArrayList<Integer> data = FindAllIndexParams(arr2,target,0,new ArrayList<>());
        System.out.println("\nFind All index: "+ data.toString());
        ArrayList<Integer> datas = FindAllIndexWithoutArrayArgument(arr2,target,0);
        System.out.println("\nFind All index without array in params: "+ datas.toString());
    }
    static boolean LSearch(int[] arr,int target, int index){
        if (arr.length == index) return false;
        return (arr[index] == target) || LSearch(arr,target,++index);
    }
    static boolean LSearchReverse(int[] arr,int target, int index){
        if (index == -1) return false;
        return (arr[index] == target) || LSearchReverse(arr,target,--index);
    }
    static int LSearchIndex(int[] arr,int target, int index){
        if (arr.length == index) return -1;
        return (arr[index] == target) ? index : LSearchIndex(arr,target,++index);
    }
    static ArrayList<Integer> res = new ArrayList<>();
    static void FindAllIndex(int[] arr,int target, int index){
        if (arr.length == index) return;
        if(arr[index] == target){
            res.add(index);
        }
        FindAllIndex(arr,target,++index);
    }

    static ArrayList<Integer> FindAllIndexParams(int[] arr,int target, int index, ArrayList<Integer> response){
        if (arr.length == index) return response;
        if(arr[index] == target){
            response.add(index);
        }
        return FindAllIndexParams(arr,target,++index, response);
    }

    static ArrayList<Integer> FindAllIndexWithoutArrayArgument(int[] arr,int target, int index){
        ArrayList<Integer> res = new ArrayList<>();
        if(index == arr.length) return res;
        if(arr[index] == target) res.add(index);
        ArrayList<Integer> data = FindAllIndexWithoutArrayArgument(arr,target,index+1);
        res.addAll(data);
        return res;
    }
}
