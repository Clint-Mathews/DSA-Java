package recursion.BasicRecursion;

class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println("No: of steps: "+ numberOfSteps(41));
    }
    static int numberOfSteps(int n) {
        if(n==0) return 0;
        return 1 + numberOfSteps(n%2==0 ? n/2 : n-1);
    }
}