
/* Array list is used over arrays fro two reasons
 * 1. Array has only homogenous data
 * 2. Array doesn't have any inbuilt methods

 * But array list class doesn't have typeSafety.
 * Suppose we have to store the data of an arraylist in string form
 * and the arraylist contains data in the form of int + string, then we won't be able to store the int type data into string type object.
 * So generics is a feature, used to solve this problem as they type cast the whole arraylist class.
 */
import java.util.*;

public class Generic {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        /*
         * The content in <> is called generics, it specifies that the
         * following array list will accept only string type of data
         */
        list.add("hello");
        list.add("dhruv");
        // list.add(07); <-- /* This effort of adding an integer will be denied at
        // compile time because String is specified as a generic */

        String str1 = (String) list.get(0);
        String str2 = (String) list.get(1);
        // String str3 = (String) list.get(2); <-- /* If this line is present in the
        // program it prints ClassCastException Solution at line 16 */
        System.out.println(str1 + " " + str2);
    }
}