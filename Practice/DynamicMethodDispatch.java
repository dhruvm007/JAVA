class Animal{
    void run(){
        System.out.println("animal can move");
    }
}

class Dog extends Animal{
    void run(){
        System.out.println("dog can run as well as walk");
    }
    void runs(int speed){
        System.out.println("dog can run at a speed of"+speed+"km/h");
    }
}
public class DynamicMethodDispatch {
    public static void main(String args[]){
        Animal animal=new Animal();
        Animal dog=new Dog();
        Dog mydog=new Dog();

        animal.run();
        dog.run();
        // this will show error because animal class reference is used to create object of dog class so only inherited methods are allpwed to be invoked.
        // dog.runs(30); 
        mydog.run();
        mydog.runs(30);
    }
}
