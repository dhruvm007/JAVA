public class TryCatch {
    public static void main(String args[]){
        int a=10;
        int b=0;
        int c=0;
        int d=5;
        int div1=0,div2=0,div3=0;
        try{
            div1 = a/b;
            div2 = a/d;
            try{
                div3=a/c;
            }
            catch(Exception e){
                System.out.println("In INNER catch block");
                System.out.println(e.getMessage());
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println("In OUTER catch block");
            System.out.println(e.getMessage());  //Prints the reason why the exception was thrown
            System.out.println(e);
        }
        System.out.println(div1);
        System.out.println(div2);
        System.out.println(div3);
        
    }
}
