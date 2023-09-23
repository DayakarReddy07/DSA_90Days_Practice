import java.util.*;
public class comparision {
    public static String subString(String str,int si,int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
    //   String str = "HelloWorld";
    //   System.out.println(str.substring(0,5));
    //   System.out.println(subString(str, 0, 5));
    // String fruits[] = {"apple","mango","banana"};
    // String largest = fruits[0];
    // for(int i=1;i<fruits.length;i++){
    //    if (largest.compareTo(fruits[i]) < 0){
    //     largest = fruits[i];
    //    }
    // }
    // System.out.println(largest);

    StringBuilder sb = new StringBuilder("");
    for(char ch = 'a';ch<='z';ch++){
        sb.append(ch);
    }
    System.out.println(sb);
    System.out.println(sb.length());
    }
}
