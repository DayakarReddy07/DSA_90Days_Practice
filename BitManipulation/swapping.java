package BitManipulation;

public class swapping {
    public static void swappingBits(int x,int y){
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("The x and y are after swapping is : " + x + ", " + y);
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("The x and y are before swapping is : " + x + ", " + y);
        swappingBits(x, y);
    }
}
