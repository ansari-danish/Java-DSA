import java.util.*;

public class searchstr {
    public static void main(String[] args) {
        String str = "Danish";
        char target = 'm';
        System.out.println(search1(str,target));
    }
    static boolean search1(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
