package Mathematics;

public class Sieve_of_Eratosthenes {
    static void primeNumbers(int num){
        for(int i=2; i <=num; i++){
            if(CheckPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean CheckPrime(int n){
        for(int i=2; i<n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primeNumbers(10);
    }
}
