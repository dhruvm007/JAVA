public class PangramCheck {
    public static void main(String args[]){

        String str = "The Quick Brown Fox Jumps Over Lazy Dog";
        boolean flag = false;

        // STEP 1: Removing all the blank spaces
        str = str.replace(" ", "");

        // STEP 2: Converting str into lowecase
        str = str.toUpperCase();
        System.out.println(str);

        // STEP 3: Creating a character array of str
        char arr[] = str.toCharArray();

        // STEP 4: Creating an integer array of size 26(There are a total of 26 alphabets) to initiate further program
        int arr2[] = new int[26];

        // for loop to traverse char array arr[]
        for(int i=0;i<arr.length;i++){
            
            // value of index of int array arr2 = value after subtracting 97(since lowercase) of ASCII value of letter in char array arr
            arr2[arr[i]-65]++;
        }

        // enhanced loop to check values of all index of arr2, if any value is found to be zero, str is not a pangram
        for(int n=0;n<arr2.length;n++){

            if(arr[n]==0){
                System.out.println(str +" "+ " IS NOT A PANGRAM");
                flag = true;
            }
        }
        if(flag==false){
            System.out.println(str+" "+ " IS A PANGRAM");
        }
    }
}
