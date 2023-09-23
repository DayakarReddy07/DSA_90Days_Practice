public class findPermutations {
   public static void innerFindPermutations(String str,String ans){
    if(str.length() == 0){
        System.out.println(ans);
        return;
    }
    for(int i=0;i<str.length();i++){
        char curr = str.charAt(i);
        String newString = str.substring(0, i) + str.substring(i+1);
        innerFindPermutations(newString, ans+curr);
    }
   }
    public static void main(String[] args) {
        String str = "abc";
        innerFindPermutations(str, "");
    }
}
