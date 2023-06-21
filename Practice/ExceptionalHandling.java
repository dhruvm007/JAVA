public class ExceptionalHandling{
    public static void main(String args[]){
        int arr[] = new int[] {1,2,3,4,5,6,7};
        try{
            System.out.println(arr[8]);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            // System.out.println(e.printStackTrace());
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            // System.out.println(e.printStackTrace());
            System.out.println(e);
        }
    }
}