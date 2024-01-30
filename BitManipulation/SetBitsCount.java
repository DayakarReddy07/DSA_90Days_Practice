package BitManipulation;

public class SetBitsCount {
    public static int countSetBit(int n){
        int count = 0;
        int bitMask = 1<<0;
        while(n>0){
            if((n&bitMask) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n =15;
        System.out.println("The number of set bits in number " + n + " is : " + countSetBit(n));
    }
}
