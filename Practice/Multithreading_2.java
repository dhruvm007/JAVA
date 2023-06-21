// In this program we are using only one single run() method from the Thread class to execute multiple Tasks simultaneously

import java.util.*;

class MyThread extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("adds")){
            adds();
        }
        else if(name.equals("subtracts")){
            subtracts();
        }
        else{
            prints();
        }
    }
    public void adds(){
        int a;
        int b;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter value of a and b : ");
        a=ob.nextInt();
        b=ob.nextInt();
        int c = a+b;
        System.out.println("Sum-->"+c);
        ob.close();
    }
    public void subtracts(){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b : ");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            int c=a-b;
            System.out.println("Difference--> "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Invalid values, can't subtract");
        }
        sc.close();
    }
    public void prints(){
        try{
            for(int i=0;i<4;i++){
            System.out.println("HELLO HELLO HELLO HELLO");
            Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("An error occured");
        }
    }
}
public class Multithreading_2 {
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setName("adds");
        t2.setName("prints");
        t3.setName("subtracts");
        t1.start();
        t2.start();
        t3.start();
    }
}
