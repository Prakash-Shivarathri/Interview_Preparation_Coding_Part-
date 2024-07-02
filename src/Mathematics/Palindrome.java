package Mathematics;

public class Palindrome {
    public static boolean palindrome(int num){
        int temp = num;
        int reverse = 0;
        while(temp != 0){
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
      return (reverse == num);
    }

    public static void main(String[] args) {
//        System.out.println(palindrome(121));
        System.out.println(palindrome(12));

    }
}
