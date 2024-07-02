package Recursion;

public class print_1_N {

    static void WholeNumbers(int num){
        if(num==0)
            return;
        WholeNumbers(num-1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        WholeNumbers(5);
    }
}
