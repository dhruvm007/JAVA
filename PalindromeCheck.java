import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String args[]){
        int Number;
        int rno=0;
        int OriginalNumber=0; 
        int Remainder=0;
        System.out.println();
        System.out.println("---CHECKING PALINDROME FOR INTEGER---");
        System.out.println("Enter any number to check");
        Scanner obj = new Scanner(System.in);
        Number = obj.nextInt();

        OriginalNumber = Number;
        while(Number != 0){
            Remainder = Number%10;
            rno = rno * 10 + Remainder;
            Number= Number/10;
        }

        if(OriginalNumber == rno){
            System.out.println("The entered number is PALINDROME!!!");
        }
        else{
            System.out.println("Enter number is not a PALINDROME");
        }


        System.out.println();
        System.out.println();

        String str1 = "";
        String str2 = "";
        System.out.println("---CHECKING PALINDROME FOR STRING---");
        System.out.println("Enter any one word string to check");
        str1 = obj.next();

        for(int i = str1.length()-1;i>=0;i--){
            str2 += str1.charAt(i);
        }
        if(str2.equals(str1)){
            System.out.println("Entered String is a PALINDROME!!!");
        }
        else{
            System.out.println("Entered String is not a PALINDROME");
        }
        obj.close();
    }
}