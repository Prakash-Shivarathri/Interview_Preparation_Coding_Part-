package Mathematics;

public class CountDigits {
    public static int Count(int num){
        long fact = factorial(num);
         int count = 0;
         while(fact > 0){
             fact = fact / 10;
             count++;
         }
       return count;
    }
    public static long factorial(int num){
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
        System.out.println(Count(42));
    }
}
