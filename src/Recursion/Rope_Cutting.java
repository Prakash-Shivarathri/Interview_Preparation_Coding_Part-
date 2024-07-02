package Recursion;
import java.util.*;
public class Rope_Cutting {

    static int recur(int n, int a, int b, int c){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }
        int res = Math.max(recur(n-a,a,b,c),Math.max(recur(n-b,a,b,c),recur(n-c,a,b,c)));
        if( res==-1){
            return -1;
        }
        return res+1;
    }

    public static void main(String[] args) {
        int n=5, a = 2, b=1,c=5;
        System.out.print(recur(n,a,b,c));
    }
}
