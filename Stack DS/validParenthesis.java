import java.util.*;
public class validParenthesis {
    public static boolean isValidParenthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //Opening case
            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(ch);
            } // Closing case
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')') || (s.peek() == '[' && ch == ']') || (s.peek() == '{' && ch == '}') ){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "{}[]({})";
        System.out.println("Is this string a valid Parenthesis: " + isValidParenthesis(str));
    }
}
