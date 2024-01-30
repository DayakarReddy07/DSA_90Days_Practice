package BitManipulation;

public class evenOdd {
    public static void Evenodd(int num){
        if((num & 1) == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {
        Evenodd(9);
        Evenodd(4);
        Evenodd(7);
    }
}
