import java.util.Scanner;

abstract class Shape{
    float area;
    Scanner ob = new Scanner(System.in);
    abstract public void GetValues();
    abstract public void Calculate();
    public void Display(){
        System.out.println("Area of = "+area);
    }
}

class square extends Shape{
    float a;
    public void GetValues(){
        System.out.println();
        System.out.print("Enter the value of side - ");
        a = ob.nextFloat();
    }
    public void Calculate(){
        area = a*a;
    }
}

class rectangle extends Shape{
    float length;
    float breadth;
    public void GetValues(){
        System.out.println();
        System.out.print("Enter the value of length - ");
        length = ob.nextFloat();
        System.out.println();
        System.out.print("Enter the value of breadth - ");
        breadth = ob.nextFloat();
        System.out.println();
    }
    public void Calculate(){
        area = length*breadth;
    }
}

class triangle extends Shape{
    float base;
    float height;
    public void GetValues(){
        System.out.println();
        System.out.print("Enter the value of base - ");
        base = ob.nextFloat();
        System.out.println();
        System.out.print("Enter the value of height - ");
        height = ob.nextFloat();
        System.out.println();
    }
    public void Calculate(){
        area = base*height*0.5f;
    }
}

class circle extends Shape{
    float radius;
    public void GetValues(){
        System.out.println();
        System.out.print("Enter the value of radius - ");
        radius = ob.nextFloat();
        System.out.println();
    }
    public void Calculate(){
        area = radius*radius*3.14f;
    }
}

class Calculator{
    public void Calculates(Shape S){
        S.GetValues();
        S.Calculate();
        S.Display();
    }
}
public class _19_area_calculator {
    public static void main(String args[]){
        Calculator C = new Calculator();
        square s = new square();
        C.Calculates(s);
        rectangle r = new rectangle();
        C.Calculates(r);
        triangle t = new triangle();
        C.Calculates(t);
        circle c = new circle();
        C.Calculates(c);
    }
}
