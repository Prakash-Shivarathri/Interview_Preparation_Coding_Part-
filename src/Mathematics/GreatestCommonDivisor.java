package Mathematics;
import java.util.*;
public class GreatestCommonDivisor {
    public static int GCD(int x, int y){
        //to find the small number..
        int res = Math.min(x, y);
        while(x > 0){
            if(x % res == 0 && y % res == 0){
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(GCD(7,13));
    }
}
