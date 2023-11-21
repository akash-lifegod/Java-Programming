import java.util.Scanner;
public class fibonacci 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        int n =sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n-2;i++)
        {
            int s=a+b;
            System.out.println(s);
            a=b;
            b=s;
        }
        sc.close();
    }
}
