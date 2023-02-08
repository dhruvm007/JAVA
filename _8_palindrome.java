import java.util.Scanner;
public class _8_palindrome {
    public static void main(String args[]){
        int Number;
        int rno=0;
        int OriginalNumber=0; 
        int Remainder=0;
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
            System.out.println("The entered number is PALINDROME");
        }
        else{
            System.out.println("Enter number is NOT A PALINDROME");
        }
    }
}