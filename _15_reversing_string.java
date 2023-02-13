public class _15_reversing_string {
    public static void main(String args[]){

        String str1 = "MyNameIsDhruv";
        String str2 = "";

        // Using for loop to reverse str1 and storing in str2
        for(int i=str1.length()-1;i>=0;i--){
            str2 = str2 + str1.charAt(i);
        }

        System.out.println();
        System.out.println();
        System.out.println("--REVERSING LETTERS OF A STRING CONTAINING ONE WORD--");
        System.out.println("Original String is "+str1);
        System.out.println("Reversed String is "+str2);


        System.out.println();
        System.out.println();

        String str3 = "Dhruv Mutreja";
        String str = "";
        // String str4 is an array containing two strings variables "Dhruv" and "Mutreja" at indexes 0 and 1
        String str4[] = str3.split(" ");
        for(int i=str4.length-1;i>=0;i--){
            str += str4[i] + " ";
        }
        System.out.println("--SWAPPING THE POSITIONS OF TWO WORDS CONTAINED IN A STRING--");
        System.out.println("Original String is "+str3);
        System.out.println("Reversed String is "+str);

        System.out.println();
        System.out.println();


        String s = "";

        // String str5 is an array containing two strings variables "Dhruv" and "Mutreja" at indexes 0 and 1
        String str5[] = str3.split(" ");

        // For Each Loop/ Enhanced Loop to traverse the array str5
        for(String n : str5){

            // For loop to traverse currently stored String variable of str5 in n
            for(int i=n.length()-1;i>=0;i--){
                s += n.charAt(i);
            }
            // After traversing first String variable of str5, a space will be added in s and then second String variable of str5 will be stored in n to be reversed
            s += " ";
        }
        System.out.println("--REVERSING THE LETTERS OF TWO WORDS CONTAINED IN A STRING WITHOUT REVERSING THEIR POSITION--");
        System.out.println("Original String is "+str3);
        System.out.println("Reversed String is "+s);
    }
}