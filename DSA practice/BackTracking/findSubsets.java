// To find Subsets in a given string using Backtracking

import java.util.*;
public class findSubsets {
    public static void subSets(int i,String str,String ans){
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            } 
            return;
        }
        // Recursive step
        subSets(i+1, str, ans+str.charAt(i));
        subSets(i+1, str, ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSets(0,str,"");
    }
}
