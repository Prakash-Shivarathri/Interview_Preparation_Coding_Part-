package Mathematics;

public class LeastCommonMultiple {
    //LCM
          //Naive Approach
          //O(a*b - max(a,b))
    public static int LCM(int x , int y){
//        int res = Math.max(x,y);
//        while(true){
//            if(res % x ==0 && res % y == 0){
//                return res;
//            }
//            res++;
//        }

           //Efficient Approach
        // a x b = LCM(a, b) * GCD (a, b) -> LCM(a, b) = (a x b) / GCD(a, b)
        //Time Complexity: O(log(min(a,b))
        return (x*y)/GCD(x,y);

    }

    public static int GCD(int x, int y){
        if(y == 0){
            return x;
        }
        return GCD(y , x%y);
    }

    public static void main(String[] args) {
        System.out.println(LCM(7,3));
    }
}
