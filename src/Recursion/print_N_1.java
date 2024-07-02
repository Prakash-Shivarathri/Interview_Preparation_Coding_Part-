package Recursion;

public class print_N_1 {
    static void wholeNumbers(int num){
        if(num==0)
            return;
        System.out.println(num);
        wholeNumbers(num-1);
    }

    public static void main(String[] args) {
        wholeNumbers(5);
    }


}
