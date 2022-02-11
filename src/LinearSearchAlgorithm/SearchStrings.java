package LinearSearchAlgorithm;

import java.util.Arrays;

public class SearchStrings {
    public static void main(String[] args){
        String str = new String();
        char ch = 'u';
        str = "Clint is a great guy";

        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println("Check id string: "+str + " has character: "+ ch + " " + searchStringExist(str,ch));
        System.out.println("Check id string: "+str + " has character: "+ ch + " " + searchStringExist2(str,ch));
    }
    static boolean searchStringExist2(String str, char check){
        if(str.length() == 0){
            return false;
        }
        for (char el:str.toCharArray()){
            if(el == check){
                return true;
            }
        }
        return false;
    }
    static boolean searchStringExist(String str, char check){
        if(str.length() == 0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == check){
                return true;
            }
        }
        return false;
    }
}
