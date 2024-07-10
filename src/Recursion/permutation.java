package Recursion;


public class permutation {
    static void permute(String str ,int i){
        if(i == str.length()-1){
            System.out.println(str);
        }else{
            for(int j=i; j<=str.length()-1; j++){
                str = swap(str,i,j);
                permute(str,i+1);
                str=swap(str,i,j);
            }
        }

    }
    static String swap(String str, int i, int j){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str= "ABC";
        int n = str.length();
        permute(str,0);

    }
}
