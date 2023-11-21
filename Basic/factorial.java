import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int f=1;
        while(n>0)
        {
            f=f*n;
            n=n-1;
        }
        System.out.println(f);
        sc.close();
    }
}
