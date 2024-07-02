package Mathematics;

public class AllDivisor {
    static void printDivisors(int num){
//        for(int i=1; i<=num; i++){
//            if(num % i == 0){
//                System.out.println(i);
//            }
//        }
        int i;
        for(i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i + " ");
            }
        }
        for(;i>1;)
        {
            i--;
            if(i!=num/i && num%i==0)
                System.out.print(num/i+" ");
        }
    }

    public static void main(String[] args) {
        printDivisors(6);
    }
}
