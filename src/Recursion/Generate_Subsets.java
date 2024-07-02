package Recursion;

public class Generate_Subsets {

    static void Subsets(String str , String substring, int index){
          if(index == str.length()){
              System.out.print(substring+" ");
              return;
          }
          Subsets(str,substring,index+1);
          Subsets(str,substring+str.charAt(index),index+1);
    }

    public static void main(String[] args) {
        Subsets("abc","",0);
    }
}
