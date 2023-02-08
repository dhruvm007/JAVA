import java.util.Scanner;
class _10_marks_and_grades {
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter your marks: ");
        Scanner obj = new Scanner(System.in);
        marks = obj.nextInt();

        if(marks >= 90 && marks <= 100){
            System.out.println("Your Grade is O");
        }
        else if(marks >=80 && marks<90){
            System.out.println("Your Grade is E");
        }
        else if(marks >=70 && marks<80){
            System.out.println("Your Grade is A");
        }
        else if(marks >=60 && marks<70){
            System.out.println("Your Grade is B");
        }
        else if(marks >=50 && marks<60){
            System.out.println("Your Grade is C");
        }
        else if(marks >=40 && marks<50){
            System.out.println("Your Grade is D");
        }
        else if(marks >=30 && marks<40){
            System.out.println("Your Grade is F");
        }
        else if(marks<30){
            System.out.println("You have failed the exam");
        }
        else {
            System.out.println("Enter valid marks");
        }
    }
}