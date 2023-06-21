// for loop follows index based accessing, which can't be done in case of queue and set interface
// for each loop also can't be used as if some operation is being performed on the interface/class, for each loop doesn't access that

// Therefore, we use iterator for fetching the data via traversing
import java.util.*;
import java.util.concurrent.*; /* for FAIL SAFE TECHNIQUE */

public class iterator {
    public static void main(String args[]){
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(600);
        
        // Printing the list together
        System.out.print(al);

        // Fetching data one by one and printing using normal Iterator
        Iterator i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        // LIST ITERATOR - traverses the list in reverse order with respect to iterator's order
        ListIterator li = al.listIterator(al.size());  /* al.size() is the index value */
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        
        // FAIL FAST - loops fail to print while data is being updated
        for(int j = 0; j <al.size(); j++){
            System.out.println(al.get(j));  /* The code will print infinite data, Using iterator will show Concurren Modification Exception */
            al.add(100);
        }

        // FAIL SAFE - data will not get added but the iterator will run successfully without any exceptions
        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        al1.add(600);
        
        Iterator i2 = al1.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
            al1.add(1000);
        }
    }
}