package BinarySearchQuestions;

public class CountRotatedTimesInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2};
        int data = FindRotationNonDuplictes(arr);
        if(data == -1){
//            data = FindRotationCount(arr);
            data += 1;
        }
        System.out.println(data);
    }
    static int FindRotationCount(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                return mid +1;
            } else if (arr[mid] < arr[mid-1]){
                return mid;
            } else {
                if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                    if(arr[start] > arr[start +1]){
                        return start+1;
                    }
                    start ++;
                    if(arr[end] < arr[end-1]){
                        return end;
                    }
                    end --;
                } else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])){
                    start = mid +1;
                } else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    static int FindRotationNonDuplictes(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid+1 <=end && arr[mid] > arr[mid + 1]){
                return mid +1;
            } else if (start <= mid-1 && arr[mid] < arr[mid-1]){
                return mid;
            } else {
                if(arr[start] >= arr[mid]) {
                    end = mid-1;
                } else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
