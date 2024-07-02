package Recursion;

public class Fibonacii {
//    the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones. Numbers that are part of the Fibonacci sequence are known as Fibonacci numbers,
    static int fib(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
         return fib(num-1)+fib(num-2);
    }

    public static void main(String[] args) {
        System.out.print(fib(5));
    }
}
