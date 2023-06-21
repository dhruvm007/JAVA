public class count {
    public static void main(String args[]){

        String str = "mynameisdhruvm007#@!&*$";

        int consonant = 0;
        int vowel = 0;
        int special_char = 0;

        char str1[] = str.toCharArray();

        for(int n : str1){
            if(str1[n]>=97 && str1[n]<=122){
                if(str1[n]==97 || str1[n]==101 || str1[n]==105 || str1[n]==111 || str1[n]==117){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
            else if((str1[n]>=33 && str1[n]<=64) || (str1[n]>=123 && str1[n]<=126)){
                special_char++;
            }
            else{
                continue;
            }
        }
        System.out.println("Consonants - "+consonant);
        System.out.println("Vowels - "+vowel);
        System.out.println("Special Characters - "+special_char);
    }
}
