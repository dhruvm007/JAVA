import java.util.*;
public class Enumeration {
    public static void main(String args[]){
        Vector v = new Vector<Integer>();
        v.add(100);
        v.add(300);
        v.add(500);
        v.add(700);

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
