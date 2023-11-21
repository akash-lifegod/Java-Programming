import java.util.Scanner;
public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
        System.out.println("Neither Prime Nor Composite");
        if(n==2)
        System.out.println("Prime");
        int c =0;
        if(n>2)
        {
            for(int i=2;i<n;i++)
            {
                if(n%i!=0){
                    c++;
                }
            }
            if(c==n-2)
            System.out.println("Prime");
            else
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
