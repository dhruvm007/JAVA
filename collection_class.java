/* We can use the collections class for various things using its inbuilt methods */

/* "COLLECTIONS" IS CLASS       "COLLECTION" IS INTERFACE            */

import java.util.*;
public interface collection_class {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(30);
        list.add(110);
        list.add(60);
        Collections.sort(list); /* Sorts the list in ascending order */
        System.out.println(list);

        int indexOfSearch = Collections.binarySearch(list, 30); /* if we enter a number not present, output will be negative */
        System.out.println(indexOfSearch);

        Collections.rotate(list, 2);
        System.out.println(list);  /* Rotates the list by 2 positions, shits it two positions towards right */

        int frequency = Collections.frequency(list, 30); /* tells the number of times 30 occurs in the list */
        System.out.println(frequency);
    }
}
