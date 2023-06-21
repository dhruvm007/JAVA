import java.util.*;

public class count_words {
    public static void main(String args[]){
        String s = "DHRUV  DURV DHRUV   DHRUV";
        int count =0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
            else{
                count++;
            }

        }
        System.out.println(count);
        
        // char arr[] = s.toCharArray();
        // for( int i:arr){
        //     System.out.print((char)i);
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(){

        //     }
        // }
    }
}
