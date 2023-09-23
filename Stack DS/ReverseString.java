import java.util.*;
public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            result.append(s.pop());
        }
        return result.toString();
    }
    public static void main(String args[]){
        Stack<Character> s = new Stack<>();
        // Another way to do(simple form)
        // String str = "Dayakar";
        // for(int i=0;i<str.length();i++){
        //     s.push(str.charAt(i));
        // }
        // while(!s.isEmpty()){
        //     System.out.print(s.pop());
        // }
        String result = reverseString("ABCDEFGHI");
        System.out.println(result);
    }
}
