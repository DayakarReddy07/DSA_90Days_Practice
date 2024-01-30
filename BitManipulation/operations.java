package BitManipulation;

public class operations {
    // Get ith bit
    public static int getIthBit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    // Set ith Bit
    public static int setIthBit(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    // Clear ith Bit
    public static int clearIthBit(int n,int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    // Update ith Bit
    public static int updateIthBit(int n,int i,int newBit){
        // n = clearIthBit(n, i);
        // int bitMask = newBit<<i;
        // return n|bitMask;
        if(newBit == 0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }
    // Clear I bits
    public static int clearIbits(int n,int i){
        int bitMask = (~0)<<i;
        return n&bitMask;
    }

    // Clear Range in Bits
    public static int clearBitsinRange(int n,int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }

    // Power of Two
    public static boolean isPowerofTwo(int n){
        return ((n&n-1)==0);
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIbits(15, 2));
        System.out.println(clearBitsinRange(10, 2, 4));
        System.out.println(isPowerofTwo(6));
    }
}
