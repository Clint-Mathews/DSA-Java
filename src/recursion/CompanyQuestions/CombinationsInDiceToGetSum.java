package recursion.CompanyQuestions;

import java.util.ArrayList;

public class CombinationsInDiceToGetSum {
    public static void main(String[] args) {
        getSumCombinationPrint("",4);
        ArrayList<String> data = getSumCombination("",4);
        System.out.println(data);
        ArrayList<String> res = new ArrayList<>();
        getSumCombinationRefArray("",4,res);
        System.out.println(res);

    }
    static ArrayList<String> getSumCombination(String processed, int unprocessed){
        if(unprocessed==0){
            ArrayList<String> data = new ArrayList<>();
            data.add(processed);
            return data;
        }
        ArrayList<String> data = new ArrayList<>();
        // Need the dice faces to be less than 6
        for(int i=1;i<=6 && i<=unprocessed;i++){
            ArrayList<String> res  = getSumCombination( i + processed,unprocessed-i);
            data.addAll(res);
        }
        return data;
    }
    static void getSumCombinationPrint(String processed, int unprocessed){
        if(unprocessed==0){
            System.out.println(processed);
        }
        // Need the dice faces to be less than 6
        for(int i=1;i<=6 && i<=unprocessed;i++){
            getSumCombinationPrint( i + processed,unprocessed-i);
        }
    }

    static void getSumCombinationRefArray(String processed, int unprocessed, ArrayList<String> data){
        if(unprocessed==0){
            data.add(processed);
        }
        // Need the dice faces to be less than 6
        for(int i=1;i<=6 && i<=unprocessed;i++){
            getSumCombinationRefArray( i + processed,unprocessed-i, data);
        }
    }
}
