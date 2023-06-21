import java.util.Arrays;

public class AngramCheck {
    public static void main(String args[]){

        System.out.println();
        System.out.println("---FIRST EXAMPLE---");
        
        String str1 = "pool";
        String str2 = "loop";
        System.out.println("First string : "+str1);
        System.out.println("Second string : "+str2);
        
        // STEP 1: REMOVE SPACE (not removing because no space in this case)
        
        // STEP 2: CONVERT Strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // STEP 3: CONVERT STRING INTO STRING ARRAY
        char Array1[] = str1.toCharArray();
        char Array2[] = str2.toCharArray();

        // STEP 4: SORT THE Char ARRAYS (ASCII Value sorting)
        Arrays.sort(Array1);
        Arrays.sort(Array2);
        
        // STEP 5: COMPARE THE TWO ARRAYS (If same, anagram true)
        if(Arrays.equals(Array1, Array2)){
            System.out.println();
            System.out.println("It is ANAGRAM");
        }
        else{
            System.out.println();
            System.out.println("It is not Anagram");
        }
        
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        
        System.out.println();
        System.out.println("---SECOND EXAMPLE---");
        
        String str3 = "A Gentleman";
        String str4 = "Elegant Man";
        
        System.out.println("First string : "+str3);
        System.out.println("Second string : "+str4);

        // STEP 1: REMOVE SPACE (not removing because no space in this case)
        str3 = str3.replace(" ", "");
        str4 = str4.replace(" ", "");

        // STEP 2: CONVERT Strings to lowercase
        str3 = str3.toLowerCase();
        str4 = str4.toLowerCase();

        // STEP 3: CONVERT STRING INTO STRING ARRAY
        char Array3[] = str3.toCharArray();
        char Array4[] = str4.toCharArray();

        // STEP 4: SORT THE Char ARRAYS (ASCII Value sorting)
        Arrays.sort(Array3);
        Arrays.sort(Array4);

        // STEP 5: COMPARE THE TWO ARRAYS (If same, anagram true)
        if(Arrays.equals(Array3, Array4)){
            System.out.println();
            System.out.println("It is ANAGRAM");
        }
        else{
            System.out.println();
            System.out.println("It is not Anagram");
        }
    }
}
