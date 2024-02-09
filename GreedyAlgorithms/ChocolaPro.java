package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class ChocolaPro {
    public static void main(String[] args) {
        int n = 4,m=6;
        Integer costHor[] = {4,1,2};
        Integer costVer[] = {2,1,3,1,4};
        Arrays.sort(costHor,Comparator.reverseOrder());
        Arrays.sort(costVer,Comparator.reverseOrder());
        int h=0,v=0,hp=1,vp=1,cost=0;
        while(h<costHor.length && v<costVer.length){
            if(costVer[v] <= costHor[h]){
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }else{
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            cost += (costHor[h] * vp);
                hp++;
                h++;
        }
        while(v<costVer.length){
            cost+=(costVer[v]*hp);
                vp++;
                v++;
        }
        System.out.println("Minimum Cost of cuts " + cost);
    }
}
