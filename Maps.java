/* Stored data may contain duplicate values but unique. Map Interface is used to stored duplicate values with unique keys 
in the form of a key-value pair. Each key-value pair is known as an Entry
*/

import java.util.*;
import java.util.Map.*;

class Student {
    private int id;
    private String name;
    private int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }
    /*
     * toString() method is called by default whenever we do s.o.p, which prints the
     * String address of the data. To solve this we overrided
     * toString() method and defined what data it has to print. Interfaces like
     * hashmap doesn't include overriden toString() method.
     */
}

public class Maps {
    public static void main(String args[]) {
        HashMap hm = new HashMap();
        hm.put(1, "Dhruv"); /* 1 is key and "dhruv is value" */
        hm.put(2, "Mutreja");
        hm.put(null, null); /* Hash map also allows NULL values */
        System.out.println(hm);

        // sometimes the hashmap prints the data in order but sometimes it doesn't. So,
        // to preserve the order we use linked hashmap
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(1, "Hello"); /* 1 is key and "dhruv is value" */
        lhm.put("Dhruv", 2);
        System.out.println(lhm);

        // we can't perform iteration on hashmap as key-value pair order of addition is
        // not guaranteed

        System.out.println(hm.get(1)); /* Accessing value at specific key */

        // Accessing only keys using iterator
        Set keyset = hm.keySet();
        Iterator i = keyset.iterator(); /* since hashmap doesn't have direct access to using iterator */
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // Accessing only values using iterator
        Collection valueOnly = hm.values();
        Iterator i2 = valueOnly.iterator(); /* since hashmap doesn't have direct access to using iterator */
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }

        // Accessing key-value pair using iterator
        Set entry = hm.entrySet();
        Iterator i3 = entry.iterator(); /* since hashmap doesn't have direct access to using iterator */
        while (i3.hasNext()) {
            System.out.println(i3.next());
        }

        Student st1 = new Student(1, "Dhruv Mutreja", 20);
        Student st2 = new Student(1, "David Laid", 24);
        Student st3 = new Student(1, "CBUM", 28);

        Map HM = new HashMap();

        HM.put(101, st1);
        HM.put(102, st2);
        HM.put(103, st3);

        System.out.println(HM);
        /*
         * prints correctly but will print address of value instead of data. Solution to
         * this is at line 31
         */

        Set entryOnly = HM.entrySet();
        Iterator I = entryOnly.iterator(); /* printing + accessing the data using iterator */
        while (I.hasNext()) {
            System.out.println(I.next());
            // Map.Entry data =(Entry)I.next();
        }

        /*
         * HASH TABLE
         * -doesn't allow null values
         */
        Hashtable ht = new Hashtable();
        ht.put(1, "Dhruv");
        ht.put(2, "David");
        ht.put(3, "CBUM");
        ht.putIfAbsent(2, "David"); /*
                                     * Puts the particular key-value pair if that pair hasn't been added atleast
                                     * once
                                     */
        System.out.println(ht);

        /*
         * TREE MAP
         * - it doesn't print in the order the data is added but it prints the data so
         * that the key data is in ascending order.
         * - Follows the same structure as tree set data structure
         */

        TreeMap tm = new TreeMap();
        tm.put(1, "Dhruv");
        tm.put(3, "David");
        tm.put(2, "CBUM");
        tm.put(4, "Mahesh");
        System.out.println(tm);

        /*
         * HASH MAP v/s WEAK HASH MAP
         * Garbage Collection involves the process of calling a function called
         * finalize().
         * When we use HasMap, garbage collector doesn't work on HashMap object because
         * HashMap dominates
         * it. To perform garbage collection we need to use Weak HashMap
         */

        System.out.println("AABBBBBBBBBEEEEEEEEEEEEOOOOOOOOO");
        demo d1 = new demo("Dhruv", 20);
        HashMap hash = new HashMap();
        hash.put(d1, "David");
        System.out.println(hash); /* printing to check if it works fine */
        d1 = null; /* Hash Map object value set to null so that garbage collector can erase it */
        System.gc(); /* Invoking garbage collector */
        System.out.println(hash); /* Printing again to see if garbage collector has erased d1 or not */

        /* The above code will print two times successfully as HashMap dominates garbage collector
         * To avoid this we use ----Weak HashMap---- instead of HashMap as it doesn't dominates Garbage collector.
         */
    }
}

class demo {
    String name;
    int age;

    demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override /* printing a statement to see when garbage collection takes place */
    public void finalize() {
        System.out.println("Garbage collector has collected the object just now");
    }

    public String toString() {
        return name + " " + age;
    }
}