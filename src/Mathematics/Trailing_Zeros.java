package Mathematics;

//Trailing Zeros in Factorial
public class Trailing_Zeros {
    public static int Trailing(int num){
        // Method 1
//        int res = 1;
//        for(int i=2; i<=num; i++){
//            res = res*i;
//        }
//        int count = 0;
//        while(res != 0){
//            int id = res % 10;
//            if(id ==0){
//                count++;
//            }
//            res = res / 10;
//        }
//
//        return count;
         // Method 2
//        int res = 1;
//        for(int i=2; i<=num; i++){
//            res = res*i;
//        }
//        int count = 0;
//        while(res % 10 == 0){
//            count++;
//            res = res / 10;
//        }
//        return count;

        //Method 3
        int res = 0;
        for(int i=5; i<=num; i=i*5){
            res = res+ num/5;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Trailing(10));
    }
}
