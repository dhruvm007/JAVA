interface abc{
    default void ABC(){
        System.out.println("abc interface");

    }
}

interface bcd{
    default void BCD(){
        System.out.println("bcd interface");
    }
}

class B implements abc, bcd{
    public void abc(){
        abc.super.ABC();
    }
    public void bcd(){
        bcd.super.BCD();
    }
}

public class Interfaces {
    public static void main(String args[]){
        B one = new B();
        one.ABC();
        one.BCD();
    }
}