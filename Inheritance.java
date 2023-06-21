// SINGLE INHERITANCE
class single_parent{
    int a,b,c;
    void display(){
        a=3;
        b=4;
        c=a+b;
        System.out.println("Sum is "+c);
    }
}

class single_child extends single_parent{

}

// MULTILEVEL INHERITANCE
class multilevel_parent{
    int a,b,c;
    void display(){
        a=3;
        b=4;
        c=a+b;
        System.out.println("Sum is "+c);
    }
}

class multilevel_child extends multilevel_parent{

}

class multilevel_child2 extends multilevel_child{

}

// HIERARCHIAL INHERITANCE
class hierarchial_parent{
    int a,b,c;
    void display(){
        a=3;
        b=4;
        c=a+b;
        System.out.println("Sum is "+c);
    }
}

class hierarchial_child1 extends hierarchial_parent{

}

class hierarchial_child2 extends hierarchial_parent{

}

class hierarchial_child3 extends hierarchial_parent{

}

public class Inheritance {

    public static void main(String args[]){
        
        // Single Inheritance Instantiation
        single_child c1 = new single_child();
        c1.display();
        
        // Multilevel Inheritance Instantiation
        multilevel_child2 c2 = new multilevel_child2();
        c2.display();
        
        // hierarchial Inheritance Instantiation
        hierarchial_child2 c3 = new hierarchial_child2();
        c3.display();

        hierarchial_child2 c4 = new hierarchial_child2();
        c4.display();

        hierarchial_child2 c5 = new hierarchial_child2();
        c5.display();
    }
}
