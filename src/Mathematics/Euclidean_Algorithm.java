package Mathematics;

public class Euclidean_Algorithm {
    public static int GCD(int x, int y){
        //Euclidean basic approach...
        //Time Complexity: O(min(a,b))...
//        while(x  != y ){
//            if(x > y){
//                x = x-y;
//            }else{
//                y = y-x;
//            }
//        }
//        return x;
        //Euclidean Optimised approach...
        //Time Complexity: O(log(min(a,b))
        if(y == 0){
            return x;
        }else{
            return GCD(y,x%y);
        }

    }

    public static void main(String[] args) {
        System.out.println(GCD(4,6));
    }
}
