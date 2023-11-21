import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k=n;
        int p=n;
        int c=0;
        while(n>0)
        {
            n=n/10;
            c++;
        }
        int s=0;
        while(k>0)
        {
            int digit=k%10;
            s+=Math.pow(digit,c);
            k=k/10;
        }
        if(s==p)
        System.out.println("Armstrong");
        else
        System.out.println("Not Armstrong");
        sc.close();
    }
}