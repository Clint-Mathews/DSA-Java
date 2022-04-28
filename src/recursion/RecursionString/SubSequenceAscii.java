package recursion.RecursionString;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSequenceAscii {
    public static void main(String[] args) {
        SubSeqAscii("","abc");
        ArrayList<String> res = SubSeqAsciiRet("","abc");
        System.out.println(res);
    }

    static void SubSeqAscii(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        SubSeqAscii(p + ch,up.substring(1));
        SubSeqAscii(p + (ch + 0 ),up.substring(1));
        SubSeqAscii(p,up.substring(1));
    }
    static ArrayList<String> SubSeqAsciiRet(String p, String up){
        if(up.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
        char ch = up.charAt(0);
        ArrayList<String> res = SubSeqAsciiRet(p + ch,up.substring(1));
        ArrayList<String> res1 = SubSeqAsciiRet(p + (ch + 0 ),up.substring(1));
        ArrayList<String> res2 = SubSeqAsciiRet(p,up.substring(1));
        res.addAll(res1);
        res.addAll(res2);
        return res;
    }

}
