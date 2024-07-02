package Mathematics;

public class Factorial {
    public static int factorial(int num){
//        int fac = 1;
//        for(int i=2; i<=num; i++){
//            fac = fac * i;
//        }
//        return fac;
        if(num == 0){
            return 1;
        }
        return num * factorial(num-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
