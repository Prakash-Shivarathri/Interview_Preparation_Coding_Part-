package Recursion;

public class Josephus {
    static int jos(int n, int k){

        if(n==1){
            return 0;
        }
        return (jos(n-1,k)+k) % n;
    }
    static int js(int n , int k){
        return jos(n,k)+1; // this is mainly for above func do from starting 0 position we need to killed the 3rd position element
        // but it's from 1 position so after i can add the 1 to it
    }

    public static void main(String[] args) {
        System.out.print(js(5,3));
    }

}
