package Recursion;

public class Sum_Of_Natural_Numbers {

    static int Num(int num){
       if(num == 0){
           return 0;
       }
        return num+Num(num-1);
    }

    public static void main(String[] args) {
        System.out.print(Num(2));
    }
}
