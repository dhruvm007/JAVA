public class q4_count {
    public static void main(String args[]){
        String str = "My name is Dhruv Mutreja!!";
        int vowel = 0;
        int consonant = 0;
        int special_char = 0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vowel++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                consonant++;
            }
            else if(str.charAt(i)== ' '){
                System.out.print("");
            }
            else{
                special_char++;
            }
        }
        System.out.println("Number of Vowels = "+vowel);
        System.out.println("Number of Consonant = "+consonant);
        System.out.println("Number of Special Character = "+special_char);
    }
}
