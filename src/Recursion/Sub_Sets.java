package Recursion;

public class Sub_Sets {
    static int sum(int arr[], int n, int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return sum(arr, n-1, sum)+sum(arr, n-1, sum-arr[n-1]);
    }

    public static void main(String[] args) {
//        int arr[] ={10,20,25};
        System.out.print(sum(new int[]{10, 20, 25},3,25));
    }
}
