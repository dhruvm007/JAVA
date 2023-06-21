// import java.util.*;

class q2_print_duplicates
{
    public static void main(String args[]){
        String str1 = "stringsjava";
        String str2 = "             ";

        char str_array[] = str1.toCharArray();
        char str2_array[] = str2.toCharArray();

        int index = 0;

        for(int i=0;i<str_array.length;i++){
            int j;
            for(j=0;j<i;j++){
                if(str_array[j] == str_array[i]){
                    str2_array[index] = str_array[i];
                    index++;
                }
            }
        }
        str2 = String.valueOf(str2_array);
        System.out.println(str2);

    }
}