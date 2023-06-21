public class q3_check_palindrome {
    public static void main(String args[]){
        String str = "2552";
        String str2 = "";

        for(int i=str.length()-1;i>=0;i--){
            str2 = str2 + str.charAt(i);
        }
        if(str2.equals(str)){
            System.out.println("Palindrome !!!");
        }
        else{
            System.out.println("Not a Palindrome !!!");
        }
    }
}