package LeetCode;

public class RichestCustomerWealth {
//    Richest Customer Wealth
//    Input: accounts = [[1,5],[7,3],[3,5]]
//    Output: 10
    public static void main(String[] args) {
        int[][] arr = {
                {1,12,1},
                {12,2,1},
                {2,2}
        };
        System.out.println(MaxWealth(arr));
        System.out.println(MaxWealthFor(arr));
    }
    static int MaxWealth(int[][] accounts){
        int maxWealth = -1;
        for(int[] eachaccount: accounts){
            int personWealth = 0;
            for(int amount: eachaccount){
                personWealth += amount;
            }
            if(personWealth > maxWealth){
                maxWealth = personWealth;
            }
        }
        return maxWealth;
    }


    static int MaxWealthFor(int[][] accounts){
        int maxWealth = -1;
        for(int row = 0; row < accounts.length; row++){
            int personWealth = 0;
            for(int col = 0; col < accounts[row].length;col++ ){
                personWealth += accounts[row][col];
            }
            if(personWealth > maxWealth){
                maxWealth = personWealth;
            }
        }
        return maxWealth;
    }
}
