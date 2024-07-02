package Recursion;

public class Palindrome {

    static boolean isPalindrom(String str , int start, int end){
        if(start >= end){
            return true;
        }
        return (str.charAt(start) == str.charAt(end) && isPalindrom( str,  start+1, end-1));
    }

    public static void main(String[] args) {
       String str = "abba";
        System.out.print(isPalindrom(str,0, str.length()-1));
    }
}
