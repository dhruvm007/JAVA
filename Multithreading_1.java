// Achieveing the mulithreading concept by extending the Thread inbuilt class.

import java.util.*;

class sums extends Thread{
    Scanner ob = new Scanner(System.in);
    public void run(){
        int a;
        int b;
        System.out.println("Enter value of a and b: ");
        a = ob.nextInt();
        b = ob.nextInt();
        int c = a+b;
        System.out.println("sum -->"+c);
    }
}

class print extends Thread{
    public void run(){
        try{
            
            for (int i =0;i<4;i++){
                System.out.println("HELLO HELLO HELLO HELLO");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(" ERROR AGAYA HAI BHAI");
        }
    }
}

// public class _23_multithreading {
//     public static void main(String args[]){
//         sums A = new sums();
//         print P = new print();
//         A.start();
//         P.start();
//     }
// }




// Achieveing the mulithreading concept by implementing the Runnable inbuilt Interface.

class adds implements Runnable{
    Scanner ob = new Scanner(System.in);
    public void run(){
        int a;
        int b;
        System.out.println("Enter value of a and b: ");
        a = ob.nextInt();
        b = ob.nextInt();
        int c = a+b;
        System.out.println("sum -->"+c);
    }
}

class prints implements Runnable{
    public void run(){
        try{
            
            for (int i =0;i<4;i++){
                System.out.println("HELLO HELLO HELLO HELLO");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(" ERROR AGAYA HAI BHAI");
        }
    }
}

public class Multithreading_1 {
    public static void main(String args[]){
        adds A = new adds();
        prints P = new prints();
        // creating New Thread T1
        Thread t1 = new Thread(A);    
        // creating New Thread T2
        Thread t2 = new Thread(P);

        t1.start();
        t2.start();
        // T1 and T2 are in Runnable state now
    }
}