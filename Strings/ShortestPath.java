// Shortest Path to reach Destination.

import java.util.*;
public class ShortestPath {
    
    public static float shortestPath(String str,int x,int y){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'W'){
                x--;
            }else if(str.charAt(i) == 'E'){
                x++;
            }else if(str.charAt(i) == 'N'){
                y++;
            }else{
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("The shortest path is : "  + shortestPath(str, 0, 0));
    }
}
