package LeetCode;
// Given a characters array letters that is sorted in non-decreasing order and a character target,
// Return the smallest character in the array that is larger than target.
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char foundLetter = nextGreatestLetter(new char[]{'c','f','j'}, 'c');
        System.out.println(foundLetter);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < letters[mid]){
                end = mid - 1;
            } else {
                // Reason to put start in else is because we need the next largest element so
                // even when value is same then the start will increment and
                // the condition fails
                start = mid + 1;
            }
        }
        // wrap around (Get the first element if not found)
        return letters[start % letters.length];
    }
}
