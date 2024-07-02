package Recursion;

public class Tail_Recursive {
//    static int fact(int num){
//        if(num == 0 || num == 1){
//            return 1;
//        }else{
//           return num*fact(num-1);
//        }
//    }
   // Tail recursive nothing but after recursive call no other work should be do....
    static int tail(int num , int k){
        if(num == 0 || num == 1){
            return k;
        }else{
            return tail(num-1,k*num);
        }
    }

    public static void main(String[] args) {
        System.out.print(tail(5,1));
    }
}
