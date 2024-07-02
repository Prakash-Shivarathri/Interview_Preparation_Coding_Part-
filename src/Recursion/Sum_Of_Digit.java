package Recursion;

public class Sum_Of_Digit {
    static int sum(int num){
        if(num == 0){
            return 0;
        }
        return num % 10 + sum(num/10);
    }

    public static void main(String[] args) {
        System.out.print(sum(237));
    }
}
