package recursion.RecursionString;

public class StreamRemoveCharacters {
    public static void main(String[] args) {
        String s = "baccad";
        RemoveCharacter("",s);
        System.out.println(RemoveCharacterReturn(s));
        System.out.println(RemoveStringReturn("bcdapple12132d"));
        System.out.println(SkipStringIfItDoesNotContainReturn("bcdappapple12132d"));
    }

    static void RemoveCharacter(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            RemoveCharacter(p,up.substring(1));
        } else {
            RemoveCharacter(p + ch,up.substring(1));
        }
    }

    static String RemoveCharacterReturn(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return RemoveCharacterReturn(up.substring(1));
        } else {
            return ch + RemoveCharacterReturn(up.substring(1));
        }
    }

    static String RemoveStringReturn(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return RemoveStringReturn(up.substring(5));
        } else {
            return up.charAt(0) + RemoveStringReturn(up.substring(1));
        }
    }

    static String SkipStringIfItDoesNotContainReturn(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return SkipStringIfItDoesNotContainReturn(up.substring(3));
        } else {
            return up.charAt(0) + SkipStringIfItDoesNotContainReturn(up.substring(1));
        }
    }
}
