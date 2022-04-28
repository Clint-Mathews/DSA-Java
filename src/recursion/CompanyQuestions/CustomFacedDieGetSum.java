package recursion.CompanyQuestions;

import java.util.ArrayList;

public class CustomFacedDieGetSum {
    public static void main(String[] args) {
        getSumCombinationPrint("",7,7);
        ArrayList<String> data = getSumCombination("",7,7);
        System.out.println(data);
        ArrayList<String> res = new ArrayList<>();
        getSumCombinationRefArray("",7,res,7);
        System.out.println(res);

    }
    static ArrayList<String> getSumCombination(String processed, int unprocessed, int face){
        if(unprocessed==0){
            ArrayList<String> data = new ArrayList<>();
            data.add(processed);
            return data;
        }
        ArrayList<String> data = new ArrayList<>();
        // Need the dice faces to be less than 6
        for(int i=1;i<=face && i<=unprocessed;i++){
            ArrayList<String> res  = getSumCombination( i + processed,unprocessed-i,face);
            data.addAll(res);
        }
        return data;
    }
    static void getSumCombinationPrint(String processed, int unprocessed,int face){
        if(unprocessed==0){
            System.out.println(processed);
        }
        // Need the dice faces to be less than 6
        for(int i=1;i<=face && i<=unprocessed;i++){
            getSumCombinationPrint( i + processed,unprocessed-i,face);
        }
    }

    static void getSumCombinationRefArray(String processed, int unprocessed, ArrayList<String> data, int face){
        if(unprocessed==0){
            data.add(processed);
        }
        // Need the dice faces to be less than 6
        for(int i=1;i<=face && i<=unprocessed;i++){
            getSumCombinationRefArray( i + processed,unprocessed-i, data,face);
        }
    }
}
