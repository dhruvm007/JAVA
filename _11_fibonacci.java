import java.util.Scanner;
public class _11_fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.of terms");
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;
        int n = sc.nextInt();
        System.out.println("FIBONACCI SERIES STARTS");
        System.out.println(t1);
        System.out.println(t2);
        for(int i=1;i<=n-2;i++)
        {
            t3 = t1 +t2;
            System.out.println(t3);
            t1 = t2;
            t2 = t3;
        }
    }
}